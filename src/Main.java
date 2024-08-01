import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        System.out.println("Hello");
        launch(args);
        
    }

    @Override
    public void start(Stage loginStage) throws Exception {
        URL resource = getClass().getResource("/view/LoginView.fxml");
        Parent root = FXMLLoader.load(resource);
        loginStage.setScene(new Scene(root));
        loginStage.show();
        loginStage.setTitle("Library Management System");
    }

    
}
