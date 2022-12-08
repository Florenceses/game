package example.game_project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class GameController {
    @FXML
    private Button StartGame;

    @FXML
    public static TextField a;

    @FXML
    public static TextField d;

    @FXML
    public static TextField h;

    @FXML
    public static TextField n;

    @FXML
    void initialize() {
        n.setText(String.valueOf(PersonController.name));
        a.setText(String.valueOf(PersonController.arm));
        h.setText(String.valueOf(PersonController.hp));
        d.setText(String.valueOf(PersonController.dmg));


    }

}
