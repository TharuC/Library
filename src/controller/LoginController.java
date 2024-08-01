package controller;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class LoginController {

    @FXML
    private JFXButton btnAdminLogin;

    @FXML
    private JFXButton btnUserLogin;

    @FXML
    private Label heading;

    @FXML
    private ImageView lmsLogo;

    @FXML
    private AnchorPane root;

    @FXML
    private JFXButton btnMemberViewOnly;

    @FXML
    void btnAdminLoginOnAction(ActionEvent event) throws IOException {
        this.root.getChildren().clear();
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/AdminLogin.fxml"));
        this.root.getChildren().add(node);
    }

    @FXML
    void btnUserLoginOnAction(ActionEvent event) throws IOException {
        this.root.getChildren().clear();
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/UserLogin.fxml"));
        this.root.getChildren().add(node);
    }

    @FXML
    void btnMemberViewOnlyOnAction(ActionEvent event) throws IOException {
        this.root.getChildren().clear();
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/MemberView.fxml"));
        this.root.getChildren().add(node);
    }

}
