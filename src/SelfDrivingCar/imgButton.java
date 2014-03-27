package SelfDrivingCar;

import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * Created by alexchase on 3/20/14.
 */
public class imgButton extends Parent {
    private static final Image image_up = new Image("/SelfDrivingCar/rounded_button.png");
    private static final Image image_down = new Image("/SelfDrivingCar/rounded_button_selected.png");

    private final ImageView iv;

    public imgButton()
    {
        this.iv = new ImageView(image_up);
        this.getChildren().add(iv);
        this.iv.setOnMousePressed(new EventHandler<MouseEvent>() {

            public void handle(MouseEvent mouseEvent) {
                iv.setImage(image_down);
            }
        });
    }
}
