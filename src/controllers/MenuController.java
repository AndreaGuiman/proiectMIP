package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import model.Books;

import java.io.IOException;
import java.util.List;

public class MenuController {
    @FXML
    Hyperlink account;
    @FXML
    Label name;
    @FXML
    ListView<String> bookList;

    String book;

    public void setBookList(){

    }

    public List<Books> getAllBooks(){
        return null;
    }

    public void goToAccountDetails() throws IOException{
        account.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("../scenes/ClientAccount.fxml"));
        Stage accountStage = new Stage();
        Scene accountScene = new Scene(root);
        //logInScene.getStylesheets().add(getClass().getResource("/resources/css/LogInStylesheet.css").toExternalForm());
        accountStage.setTitle("ACCOUNT DETAILS");
        accountStage.setScene(accountScene);
        accountStage.show();
    }
}
