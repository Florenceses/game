package example.game_project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class PersonController {

    static String name1;
    static String healt1;
    static String armore1;

    public String extName;
    public int extDamage;
    public int extHealth;

    @FXML
    public TextField arm;
    @FXML
    private Button crt;
    @FXML
    public TextField hp;
    @FXML
    public TextField name;
    @FXML
    private Label error;
    @FXML
    private Button str;
    @FXML
    private TableView<T_INFO> tableinfo = new TableView<T_INFO>();

    @FXML
    private TableColumn<T_INFO, Integer> tarm;

    @FXML
    private TableColumn<T_INFO, Integer> thp;

    @FXML
    private TableColumn<T_INFO, String> tname;

    ObservableList<T_INFO> list = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        List<Object> chooseList = new ArrayList<>();

        crt.setOnAction(actionEvent1 -> {
            name1 = name.getText().trim();
            healt1 = hp.getText().trim();
            armore1 = arm.getText().trim();


            tname.setCellValueFactory(new PropertyValueFactory<T_INFO, String>("Name"));
            thp.setCellValueFactory(new PropertyValueFactory<T_INFO, Integer>("HealthPoint"));
            tarm.setCellValueFactory(new PropertyValueFactory<T_INFO, Integer>("Armore"));


            String names = name.getText().trim();
            int health = Integer.parseInt(hp.getText().trim());
            int armore = Integer.parseInt(arm.getText().trim());
            tableinfo.setItems(list);
            list.add(new T_INFO(names, health, armore));

    });
        str.setOnAction(actionEvent1 -> {
            str.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("fight.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Fight!");
            stage.show();
        });
    }
}

