package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

import java.io.IOException;

public class LogInController {
    @FXML
    Hyperlink signUp;

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
