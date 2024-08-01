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

public class AdminProfileController {

    @FXML
    private JFXButton btnBack;

    @FXML
    private JFXButton btnManageAdmins;

    @FXML
    private JFXButton btnManageBooks;

    @FXML
    private JFXButton btnManageFinesReturns;

    @FXML
    private JFXButton btnManageUsers;

    @FXML
    private JFXButton btnMemberView;

    @FXML
    private JFXButton btnStatsView;

    @FXML
    private Label lblAdminNameDisplay;

    @FXML
    private ImageView lmsLogo;

    @FXML
    private AnchorPane root;

    @FXML
    void btnManageAdminsOnAction(ActionEvent event) {
        
    }

    @FXML
    void btnManageBooksOnAction(ActionEvent event) throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/BookRegistration.fxml"));
        this.root.getChildren().clear();
        this.root.getChildren().add(node);
    }

    @FXML
    void btnManageFinesReturnsOnAction(ActionEvent event) {

    }

    @FXML
    void btnManageUsersOnAction(ActionEvent event) {

    }

    @FXML
    void btnbtnBackOnAction(ActionEvent event) throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/LoginView.fxml"));
        this.root.getChildren().clear();
        this.root.getChildren().add(node);
    }

}
