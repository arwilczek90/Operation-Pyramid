package SelfDrivingCar;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.collections.ListChangeListener;
import javafx.collections.MapChangeListener;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaView;
import javafx.scene.media.Track;
import javafx.stage.FileChooser;
import java.io.File;



public class Main extends Application {

/*    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }*/

    Media media1;
   // private static final String MEDIA_URL = "{__DIR__}bluedevils-large.mp4";
    private static String arg1;

    @Override public void start(Stage stage) {
        stage.setTitle("Media Player");

        String path = chooseFile();
// Create media player
        media1 = new Media(path);
        javafx.scene.media.MediaPlayer mediaPlayer = new javafx.scene.media.MediaPlayer(media1);
        mediaPlayer.setAutoPlay(true);
        mediaPlayer.setCycleCount(javafx.scene.media.MediaPlayer.INDEFINITE);


// Print track and metadata information
        media1.getTracks().addListener(new ListChangeListener<Track>() {
            public void onChanged(Change<? extends Track> change) {
                System.out.println("Track> "+change.getList());
            }
        });
        media1.getMetadata().addListener(new MapChangeListener<String,Object>() {
            public void onChanged(MapChangeListener.Change<? extends String, ? extends Object> change) {
                System.out.println("Metadata> "+change.getKey()+" -> "+change.getValueAdded());
            }
        });
        mediaPlayer.setVolume(1.00);
        Group root = new Group();
        Scene playVideo = new Scene(root,800,450);
// Add media display node to the scene graph
        MediaControl mediaControl = new MediaControl(mediaPlayer);
        playVideo.setRoot(mediaControl);



      
        stage.setScene(playVideo);
        stage.show();
    }

    private String chooseFile()
    {
        FileChooser fileChooser = new FileChooser();

//Extention filter
        fileChooser.getExtensionFilters().addAll(
              //  new FileChooser.ExtensionFilter("Text Files", "*.txt"),
                new FileChooser.ExtensionFilter("Video Files (*.mp4", "*.mp4"),

                new FileChooser.ExtensionFilter("Audio Files (*.mp3,*.aac)", "*.mp3", "*.aac")
            //    new FileChooser.ExtensionFilter("All Files", "*.*")
             );

//Set to user directory or go to default if cannot access
        String userDirectoryString = System.getProperty("user.home");
        File userDirectory = new File(userDirectoryString);
        if(!userDirectory.canRead()) {
            userDirectory = new File("c:/");
        }
        fileChooser.setInitialDirectory(userDirectory);

//Choose the file
        File chosenFile = fileChooser.showOpenDialog(null);
//Make sure a file was selected, if not return default
        String path;
        if(chosenFile != null) {
            path = chosenFile.toURI().toASCIIString();
        } else {
            //default return value
            path = null;
        }
        return path;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
