package controller;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class UserLoginController {

    @FXML
    private JFXButton btnBackToLogin;

    @FXML
    private TextField btnUserID;

    @FXML
    private JFXButton btnUserLogin;

    @FXML
    private TextField btnUserName;

    @FXML
    private ImageView lmsLogo;

    @FXML
    private AnchorPane root;

    @FXML
    void btnUserLoginOnAction(ActionEvent event) throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/UserProfile.fxml"));
        this.root.getChildren().clear();
        this.root.getChildren().add(node);
    }

    @FXML
    void btnbtnBackToLoginOnAction(ActionEvent event) throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/LoginView.fxml"));
        this.root.getChildren().clear();
        this.root.getChildren().add(node);
    }

}
