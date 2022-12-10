package example.game_project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static example.game_project.PersonController.*;

public class GameController {
    @FXML
    public Label a;
    @FXML
    public Label h;
    @FXML
    public Label n;
    @FXML
    void initialize() {
        n.setText( name1);
        h.setText( healt1);
        a.setText( armore1);


    }

}
