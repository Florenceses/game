package example.game_project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.io.IOException;
import static example.game_project.PersonController.*;


public class GameController {
    @FXML
    private Label a;

    @FXML
    private Label a1;

    @FXML
    private Label h;

    @FXML
    private Label h1;

    @FXML
    private Button hitB;

    @FXML
    private Label n;

    @FXML
    private Label n1;


    String firstName = String.valueOf(n1);
    int firstDMG = Integer.parseInt(String.valueOf(a1));
    int firstHealth = Integer.parseInt(String.valueOf(h1));

    @FXML
    void initialize() throws IOException {
        n.setText( name1);
        h.setText( healt1);
        a.setText( armore1);
        T_INFO firstcard = new T_INFO(firstName, firstDMG, firstHealth);



        n1.setText(firstcard.getName());
        h1.setText(String.valueOf(firstcard.getHealthPoint()));
        a1.setText(String.valueOf(firstcard.getArmore()));

                }

}

