package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import model.Clients;
import services.ClientService;

import java.io.IOException;

public class SignUpController {
    @FXML
    Hyperlink logIn;
    //dupa ce toate campurile sunt completate, butonul de sign up devine "disable = false", adica il putem folosi
    @FXML
    Button signUp;
    @FXML
    TextField usernameField, passwordField, nameField, emailField, telNoField;
    @FXML
    PasswordField confirmPasswordField;
    @FXML
    CheckBox verify;

    String username, password, confirmPassword, name, email, telNo;

    public void initialize(){
        signUp.setDisable(true);
    }

    public void keyReleasedProperty(){
        username = usernameField.getText();
        password = passwordField.getText();
        confirmPassword = confirmPasswordField.getText();
        name = nameField.getText();
        email = emailField.getText();
        telNo = telNoField.getText();
        signUp.setDisable((isNullOrEmpty(username, password, confirmPassword, name, email, telNo) || !verify.isSelected()));;
    }

    //verificam daca fiecare casuta de text este completata, daca este completata returnam adevarat, adica activam butonul de log in
    public static boolean isNullOrEmpty(String... strArr) {
        for (String st : strArr) {
            if  (st==null || st.equals(""))
                return true;

        }
        return false;
    }

    //pentru hyperlink, ne duce inapoi la login
    public void goToLogIn() throws IOException {
        logIn.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("../scenes/LogIn.fxml"));
        Stage logInStage = new Stage();
        Scene logInScene = new Scene(root);
        //logInScene.getStylesheets().add(getClass().getResource("/resources/css/LogInStylesheet.css").toExternalForm());
        logInStage.setTitle("LOGIN");
        logInStage.setScene(logInScene);
        logInStage.show();
    }

    public void signUpAction(){
        ClientService clientService = new ClientService();
        Clients clients = new Clients();
        clients.setNameClient(username);
        clients.setTelephoneNumber(telNo);
        clients.setEmailClient(email);
        clientService.addClient(clients);
    }
}
