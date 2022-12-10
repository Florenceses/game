package example.game_project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static example.game_project.PersonController.*;

public class GameController {
    @FXML
    private Button StartGame;

    @FXML
    public TextField a;

    @FXML
    public TextField d;

    @FXML
    public TextField h;

    @FXML
    public TextField n;

    @FXML
    void initialize() {
        n.setText( name1);
        d.setText( damage1);
        h.setText( healt1);
        a.setText( armore1);


    }

}
