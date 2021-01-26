package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import model.Users;
import services.UserService;

import java.io.IOException;
import java.util.List;

public class LogInController {
    @FXML
    Hyperlink signUp;
    @FXML
    Button buttonLogIn;
    @FXML
    CheckBox verify;
    @FXML
    TextField usernameField;
    @FXML
    PasswordField passwordField;

    String username, password;


    public void initialize(){
        buttonLogIn.setDisable(true);
    }

    public void keyReleasedProperty(){
        username = usernameField.getText();
        password = passwordField.getText();
        buttonLogIn.setDisable((isNullOrEmpty(username, password) || !verify.isSelected()));
    }

    //verificam daca fiecare casuta de text este completata, daca este completata returnam adevarat, adica activam butonul de log in
    public static boolean isNullOrEmpty(String... strArr) {
        for (String st : strArr) {
            if  (st==null || st.equals(""))
                return true;

        }
        return false;
    }

    public void logInAction() throws Exception{
        UserService userService = new UserService();
        List<Users> usersList = userService.getAllUsers();
        boolean userFound = false;

        if(usersList.size() != 0) {
            for(Users userIterator : usersList) {
                if ((userIterator.getUsername().equals(username)) && (userIterator.getPassword().equals(password))) {
                    Users user = userService.findUser(username);
                    System.out.println(user);

                    //daca userul este un client
                    if (user.getIdClient() != null) {
                        //salvam credentialele clientului

                        //intram pe meniu
                        buttonLogIn.getScene().getWindow().hide();
                        Parent root = FXMLLoader.load(getClass().getResource("../scenes/Menu.fxml"));
                        Stage menuStage = new Stage();
                        Scene menuScene = new Scene(root);
                        //logInScene.getStylesheets().add(getClass().getResource("/resources/css/LogInStylesheet.css").toExternalForm());
                        menuStage.setTitle("MENU");
                        menuStage.setScene(menuScene);
                        menuStage.show();
                        userFound = true;
                        break;
                    }

                    //daca userul este un manager
                    if(user.getIdManager() != null){
                        //salvam credentialele managerului

                        //intram pe meniu
                        buttonLogIn.getScene().getWindow().hide();
                        Parent root = FXMLLoader.load(getClass().getResource("../scenes/MenuManager.fxml"));
                        Stage menuStage = new Stage();
                        Scene menuScene = new Scene(root);
                        //logInScene.getStylesheets().add(getClass().getResource("/resources/css/LogInStylesheet.css").toExternalForm());
                        menuStage.setTitle("MENU");
                        menuStage.setScene(menuScene);
                        menuStage.show();
                        userFound = true;
                        break;
                    }
                }
            }
        }

        if(!userFound){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Numele sau parola este gresita, sau utilizatorul nu se afla in baza de date");
            alert.setTitle("Opss!");
            alert.setHeaderText(null);
            alert.show();
        }
    }

    public void goToSignUp() throws IOException {
        signUp.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("../scenes/SignUp.fxml"));
        Stage signUpStage = new Stage();
        Scene signUpScene = new Scene(root);
        //logInScene.getStylesheets().add(getClass().getResource("/resources/css/LogInStylesheet.css").toExternalForm());
        signUpStage.setTitle("SIGNUP");
        signUpStage.setScene(signUpScene);
        signUpStage.show();
    }
}
