package controller;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class UserProfileController {

    @FXML
    private JFXButton btnBackToLoginView;

    @FXML
    private JFXButton btnMemberView;

    @FXML
    private JFXButton btnStatsView;

    @FXML
    private Label lblUserNameDisplay;

    @FXML
    private ImageView lmsLogo;

    @FXML
    private AnchorPane root;

    @FXML
    private TableView<?> tblUserBorrowDetails;

    @FXML
    void btnbtnBackToLoginViewOnAction(ActionEvent event) throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/LoginView.fxml"));
        this.root.getChildren().clear();
        this.root.getChildren().add(node);
    }

}
