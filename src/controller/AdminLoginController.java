package controller;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class AdminLoginController {

    @FXML
    private TextField btnAdminID;

    @FXML
    private JFXButton btnAdminLogin;

    @FXML
    private PasswordField btnAdminPassword;

    @FXML
    private JFXButton btnBackToLogin;

    @FXML
    private ImageView lmsLogo;

    @FXML
    private Hyperlink lnkCreateAdminAccount;

    @FXML
    private AnchorPane root;

    @FXML
    void btnAdminLoginOnAction(ActionEvent event) throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/AdminProfile.fxml"));
        this.root.getChildren().clear();
        this.root.getChildren().add(node);
    }

    @FXML
    void btnbtnBackToLoginOnAction(ActionEvent event) throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/LoginView.fxml"));
        this.root.getChildren().clear();
        this.root.getChildren().add(node);
    }

    @FXML
    void lnkCreateAdminAccountOnAction(ActionEvent event) throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/AdminAccountCreate.fxml"));
        this.root.getChildren().clear();
        this.root.getChildren().add(node);
    }

}
