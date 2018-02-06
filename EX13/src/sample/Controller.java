package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class Controller {
    public int score = 0;
    @FXML
    Button nupp;
    public void initialize(){
        nupp.setGraphic(new ImageView(new Image("Cookie.png")));
        nupp.setStyle("-fx-background-color: transparent;");
    }
    public void buttonClicked(){
        score += 1;
        System.out.println(score);
    }
}
