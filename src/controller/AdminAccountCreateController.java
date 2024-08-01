package controller;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AdminAccountCreateController {

    @FXML
    private JFXButton btnAdminCreateAccount;

    @FXML
    private JFXButton btnBackToLogin;

    @FXML
    private AnchorPane root;

    @FXML
    private TextField txtAdminAddress;

    @FXML
    private PasswordField txtAdminConfirmPassword;

    @FXML
    private TextField txtAdminContact;

    @FXML
    private DatePicker txtAdminDOB;

    @FXML
    private TextField txtAdminID;

    @FXML
    private TextField txtAdminName;

    @FXML
    private PasswordField txtAdminPassword;

    @FXML
    private TextField txtAdminTitle;

    @FXML
    void btnAdminCreateAccountOnAction(ActionEvent event) throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/AdminProfile.fxml"));
        this.root.getChildren().clear();
        this.root.getChildren().add(node);
    }

    @FXML
    void btnbtnBackToLoginOnAction(ActionEvent event) throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/AdminLogin.fxml"));
        this.root.getChildren().clear();
        this.root.getChildren().add(node);
    }

}
