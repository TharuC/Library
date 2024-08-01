package controller;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ManageUsersController {

    @FXML
    private JFXButton btnBackToManageUsers;

    @FXML
    private JFXButton btnUserCreateAccount;

    @FXML
    private AnchorPane root;

    @FXML
    private TextField txtUserAddress;

    @FXML
    private TextField txtUserContact;

    @FXML
    private DatePicker txtUserDOB;

    @FXML
    private TextField txtUserID;

    @FXML
    private TextField txtUserName;

    @FXML
    private TextField txtUserTitle;

    @FXML
    void btnUserCreateAccountOnAction(ActionEvent event) throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/UserProfile.fxml"));
        this.root.getChildren().clear();
        this.root.getChildren().add(node);
    }

    @FXML
    void btnbtnBackToLoginOnAction(ActionEvent event) throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/AdminProfile.fxml"));
        this.root.getChildren().clear();
        this.root.getChildren().add(node);
    }

}
