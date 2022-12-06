package example.game_project;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class PersonController {

    @FXML
    private TextField arm;

    @FXML
    private Button crt;

    @FXML
    private TextField dmg;

    @FXML
    private TextField hp;

    @FXML
    private TextField name;

    @FXML
    private Label error;

    @FXML
    void initialize() {
        crt.setOnAction(actionEvent1 -> {
            String NAME = name.getText().trim();
            String DAMAGE = dmg.getText().trim();
            String HP = hp.getText().trim();
            String ARMORE = arm.getText().trim();
            if (!NAME.isEmpty() && !DAMAGE.isEmpty() && !HP.isEmpty() && !ARMORE.isEmpty()) {
                crt.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("game.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setTitle("Game");
                stage.show();
            } else {
                        error.setText("Заповніть усі поля");
                    }
            if (!(HP == String.valueOf(100)) && !(ARMORE == String.valueOf(100))) {
                crt.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("game.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setTitle("Game");
                stage.show();
            } else {
                error.setText("HP чи ARMORE не може бути більше за 100");
                    }

    });

        }
    }

