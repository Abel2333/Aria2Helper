package org.abel.inf;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import org.abel.GlobalConfig;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    static private Stage primaryStage;
    static private String interfaceName;
    static final int width = 699;
    static final int height = 572;

    @Override
    public void init() throws Exception {
        super.init();
        setInterfaceName(FileLocate.PRIMAL.toString());
    }

    static private @NotNull Scene generateScene(double width, double height) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource(interfaceName)));
        return new Scene(root, width, height);
    }

    static void takeStageCenter(@org.jetbrains.annotations.NotNull Stage stage) {
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        stage.setX((screenBounds.getWidth()- stage.getWidth())/2);
        stage.setY((screenBounds.getHeight()-stage.getHeight())/2);
    }

    @Override
    public void start(Stage stage) {
        try {
            primaryStage = stage;
            primaryStage.setTitle("Aria2Helper");
            primaryStage.setScene(generateScene(width, height));
            primaryStage.show();
            takeStageCenter(primaryStage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void changeInterface(String SceneName) {
        try {
            setInterfaceName(SceneName);
            if (SceneName.equals(FileLocate.PRIMAL.toString())) {
                primaryStage.setScene(generateScene(699, 572));
            } else
                primaryStage.setScene(generateScene(800, 750));
        } catch (IOException e) {
            e.printStackTrace();
        }
        takeStageCenter(primaryStage);
    }

    static void infoStage() {

    }

    static void setInterfaceName(String newName) {
        interfaceName = newName;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
