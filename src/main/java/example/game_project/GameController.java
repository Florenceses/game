package example.game_project;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.shape.Circle;

import java.io.IOException;
import java.util.Vector;

import static example.game_project.PersonController.*;

public class GameController {
    @FXML
    public Label a;
    @FXML
    public Label h;
    @FXML
    public Label n;
    @FXML
    private ImageView pers1;

    @FXML
    private ImageView pers2;


    @FXML
    void initialize() throws IOException {
        n.setText( name1);
        h.setText( healt1);
        a.setText( armore1);
        }

    public void key(KeyEvent evt) throws IOException{
        if (evt.getCode() == KeyCode.W){
        pers1.relocate(0,-5);
        }
        if (evt.getCode() == KeyCode.S){
            pers1.relocate(pers1.getLayoutX()-5, pers1.getLayoutY()-5);
        }
        if (evt.getCode() == KeyCode.A){
            pers1.relocate(pers1.getLayoutX()-5, pers1.getLayoutY()-5);
        }
        if (evt.getCode() == KeyCode.D){
            pers1.relocate(pers1.getLayoutX()-5, pers1.getLayoutY()-5);
            System.out.println("test");
        }
    }
}

