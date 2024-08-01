package controller;

import java.io.IOException;
import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class BookRegistrationController implements Initializable {

    @FXML
    private JFXButton btnBackToManageUsers;

    @FXML
    private JFXButton btnBookRegister;

    @FXML
    private ComboBox<String> cboxCategory;

    @FXML
    private AnchorPane root;

    @FXML
    private TextField txtAurthor;

    @FXML
    private TextField txtBookID;

    @FXML
    private TextField txtBookName;

    @FXML
    private TextField txtDonatedBy;

    @FXML
    private TextField txtISBN;

    @FXML
    private DatePicker txtRegisteredDate;

    @FXML
    void btnUserCreateAccountOnAction(ActionEvent event) {

    }

    String date = txtRegisteredDate.getValue().format(DateTimeFormatter.ofPattern("yyyy-mm-dd"));

    @FXML
    void btnbtnBackToLoginOnAction(ActionEvent event) throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/AdminProfile.fxml"));
        this.root.getChildren().clear();
        this.root.getChildren().add(node);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String[] categoryList = {"Novel","Adventure","Short Story","Ditectives","Horror","Fantasy","Poem","Biography"};
        cboxCategory.getItems().setAll(categoryList);
    }

    private void clearForm(){
        txtBookID.setText("");
        txtBookName.setText("");
        txtAurthor.setText("");
        cboxCategory.setText("");
        txtISBN.setText("");
        txtDonatedBy.setText("");
        date = "";
    }

}
