package SelfDrivingCar;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");

        Button btn = new Button();
        btn.setText("I'm a button");

        Image btnImage = new Image("/SelfDrivingCar/rounded_button.png");
        ImageView iv = new ImageView();
        iv.setImage(btnImage);
        btn.setGraphic(iv);

        imgButton iButton;
        iButton = new imgButton();

        Image imageDecline = new Image(getClass().getResourceAsStream("/SelfDrivingCar/rounded_button.png"));
        final Button button5 = new Button();
        button5.setGraphic(new ImageView(imageDecline));
        button5.setStyle("-fx-background-color: transparent; -fx-text-fill: white;");
        button5.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent t) {
                System.out.println("click");
                Image clicked = new Image(getClass().getResourceAsStream("/SelfDrivingCar/rounded_button_selected.png"));
                button5.setGraphic(new ImageView(clicked));
           }
        });



        StackPane root = new StackPane();
        root.getChildren().add(button5);
        root.setId("pane");

        Scene scene = new Scene(root,1280,768);
        scene.getStylesheets().add(this.getClass().getResource("style.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
