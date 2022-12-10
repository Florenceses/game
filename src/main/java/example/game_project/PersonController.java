package example.game_project;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class PersonController extends GameController {

    static String name1;
    static String damage1;
    static String healt1;
    static String armore1;

    @FXML
    public  TextField arm;

    @FXML
    private Button crt;

    @FXML
    public  TextField dmg;

    @FXML
    public  TextField hp;

    @FXML
    public  TextField name;

    @FXML
    private Label error;

    @FXML
    void initialize() {

        crt.setOnAction(actionEvent1 -> {
           name1 = name.getText().trim();
           damage1 = dmg.getText().trim();
           healt1 = hp.getText().trim();
           armore1 = arm.getText().trim();
            if (!name1.isEmpty() && !damage1.isEmpty() && !healt1.isEmpty() && !armore1.isEmpty()) {

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
            if (!(healt1 == String.valueOf(100)) && !(armore1 == String.valueOf(100))) {
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

