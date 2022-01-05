package org.abel;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class FileChoose {
    FileChooser fileChooser;

    public FileChoose(String title) {
        fileChooser = new FileChooser();
        fileChooser.setTitle(title);
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("aria2c file","*.txt")
        );
    }

    public File openFile() {
        return fileChooser.showOpenDialog(new Stage());
    }
}
