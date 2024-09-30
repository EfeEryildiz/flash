package Flashcardstudytool;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the Main Dashboard FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/MainDashboard.fxml"));
            Parent root = loader.load();

            // Set the Scene with the root (the dashboard)
            Scene scene = new Scene(root);

            // Configure the primaryStage (main window)
            primaryStage.setTitle("Flashcard Study Tool");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }
}
