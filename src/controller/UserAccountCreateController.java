package controller;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

import com.jfoenix.controls.JFXButton;

import dto.UserDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;

public class UserAccountCreateController {

    private UserController userController;

    private UserAccountCreateController() throws Exception{
        userController = new UserController();  
    }

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
        createAccount();
        clearForm();
        // Parent node = FXMLLoader.load(this.getClass().getResource("/view/UserProfile.fxml"));
        // this.root.getChildren().clear();
        // this.root.getChildren().add(node);
    }

    @FXML
    void btnbtnBackToLoginOnAction(ActionEvent event) throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/ManageUsers.fxml"));
        this.root.getChildren().clear();
        this.root.getChildren().add(node);
    }

    String date = txtUserDOB.getValue().format(DateTimeFormatter.ofPattern("yyyy-mm-dd"));

    private void createAccount(){
        try {
            UserDto userDto = new UserDto(txtUserID.getText(), txtUserName.getText(), txtUserTitle.getText(), "abc", txtUserAddress.getText(), txtUserContact.getText());
            String resp = userController.save(userDto);
            Alert alert = new Alert(AlertType.CONFIRMATION,resp);
            alert.showAndWait();
        } catch (Exception e) {
            Alert alert = new Alert(AlertType.ERROR,"Error at Creating the account");
            alert.showAndWait();
        }
    }

    private void clearForm(){
        txtUserID.setText("");
        txtUserName.setText("");
        txtUserTitle.setText("");
        date = "";
        txtUserAddress.setText("");
        txtUserContact.setText("");
    }

}
