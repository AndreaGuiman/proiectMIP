package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;


public class ClientAccountController {
    @FXML
    Hyperlink mainMenu;
    @FXML
    Label username, password, name, email, telNo;
    @FXML
    CheckBox seePassword;
    @FXML
    ListView<String> bookList;

    //afisam date despre utilizator si apoi cartile pe care le-a imprumutat si detalii despre imprumuturi
    public void initialize(){
        setLabels();
        setClientBookList();
    }

    public void setLabels(){
        username.setText("username");
        name.setText("name");
        email.setText("email");
        telNo.setText("telNo");
    }

    public void setClientBookList(){

    }

    //punem parola in label
    public void showPassword(){
        if(seePassword.isSelected()){
            password.setText("password");
        }
        else{
            password.setText("");
        }
    }

    public void goToMainMenu()throws Exception{
        mainMenu.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("../scenes/Menu.fxml"));
        Stage menuStage = new Stage();
        Scene menuScene = new Scene(root);
        //logInScene.getStylesheets().add(getClass().getResource("/resources/css/LogInStylesheet.css").toExternalForm());
        menuStage.setTitle("MENU");
        menuStage.setScene(menuScene);
        menuStage.show();
    }
}
