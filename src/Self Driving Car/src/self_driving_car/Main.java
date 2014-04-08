package self_driving_car;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Operation Pyramid");



        Image buttonUnselected = new Image(getClass().getResourceAsStream("/self_driving_car/Resources/Images/rounded_button.png"));
        final Button button = new Button();
        button.setGraphic(new ImageView(buttonUnselected));
        button.setStyle("-fx-background-color: transparent; -fx-text-fill: white;");


        button.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("click");
                Image clicked = new Image(getClass().getResourceAsStream("/self_driving_car/Resources/Images/rounded_button_selected.png"));
                button.setGraphic(new ImageView(clicked));
            }
        });
        button.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("click");
                Image clicked = new Image(getClass().getResourceAsStream("/self_driving_car/Resources/Images/rounded_button.png"));
                button.setGraphic(new ImageView(clicked));
            }
        });


        Image road = new Image(getClass().getResourceAsStream("/self_driving_car/Resources/Images/road_view.png"));
        ImageView roadView = new ImageView(road);
        roadView.setTranslateX(-140.0);
        roadView.setTranslateY(-10);

        Image sidePane =  new Image(getClass().getResourceAsStream("/self_driving_car/Resources/Images/side_pane.png"));
        ImageView sideView = new ImageView(sidePane);
        sideView.setTranslateX(-480);
        sideView.setTranslateY(-16);

        //Image controls = new Image(getClass().getResourceAsStream("/SelfDrivingCar/side_pane.png"));

        StackPane root = new StackPane();
        root.getChildren().add(roadView);
        root.getChildren().add(sideView);
        root.setId("pane");


        Scene scene = new Scene(root,1280,768);
        scene.getStylesheets().add(this.getClass().getResource("/self_driving_car/Resources/CSS/style.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
