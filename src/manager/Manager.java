/*
 */
package manager;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author daniildeveloper
 */
public class Manager extends Application {

    private ResourceBundle resourceBundle;

    @Override
    public void start(Stage primaryStage) {
        try {
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("mainwindow/MainWindow.fxml"));

            Scene scene = new Scene(root, 1280, 700);

//            resourceBundle = ResourceBundle.getBundle("bundles.MainBundle", new Locale("en", "EN"));

//            String title = resourceBundle.getString("appTitle");

            primaryStage.setTitle("Daniildeveloper Manager");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getCause());

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
