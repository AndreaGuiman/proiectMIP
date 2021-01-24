package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUpController {
    @FXML
    Hyperlink logIn;

    //dupa ce toate campurile sunt completate, butonul de sign up devine "disable = false", adica il putem folosi
    @FXML
    Button signUp;

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
}
