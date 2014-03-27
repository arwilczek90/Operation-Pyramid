package SelfDrivingCar;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseDragEvent;
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



        Image buttonUnselected = new Image(getClass().getResourceAsStream("/SelfDrivingCar/rounded_button.png"));
        final Button button = new Button();
        button.setGraphic(new ImageView(buttonUnselected));
        button.setStyle("-fx-background-color: transparent; -fx-text-fill: white;");


        button.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("click");
                Image clicked = new Image(getClass().getResourceAsStream("/SelfDrivingCar/rounded_button_selected.png"));
                button.setGraphic(new ImageView(clicked));
            }
        });
        button.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("click");
                Image clicked = new Image(getClass().getResourceAsStream("/SelfDrivingCar/rounded_button.png"));
                button.setGraphic(new ImageView(clicked));
            }
        });




        StackPane root = new StackPane();
        root.getChildren().add(button);
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
