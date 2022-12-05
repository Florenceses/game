package example.game_project;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class RulesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back;

    @FXML
    void initialize() {
       back.setOnAction(actionEvent -> {
           back.getScene().getWindow().hide();

           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("homeinfo.fxml"));
           try {
               loader.load();
           } catch (IOException e) {
               e.printStackTrace();
           }
           Parent root = loader.getRoot();
           Stage stage = new Stage();
           stage.setScene(new Scene(root));
           stage.setTitle("MainWindow");
           stage.show();
       });

    }

}
