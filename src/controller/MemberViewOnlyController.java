package controller;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class MemberViewOnlyController {

    @FXML
    private JFXButton btnBackToLoginView;

    @FXML
    private TableColumn<?, ?> columnUserID;

    @FXML
    private TableColumn<?, ?> columnUserName;

    @FXML
    private AnchorPane root;

    @FXML
    private TableView<?> tblMemberViewOnly;

    @FXML
    void btnbtnBackToLoginViewOnAction(ActionEvent event) throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/LoginView.fxml"));
        this.root.getChildren().clear();
        this.root.getChildren().add(node);
    }

}
