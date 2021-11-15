package org.abel.inf;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class InterfaceController {

    @FXML
    private Button fromURL;

    @FXML
    private Button fromFile;

    @FXML
    void handleURLButton(ActionEvent event) {
        Main.changeInterface(FileLocate.URLDOWN.toString());
    }

    @FXML
    void handleFileButton(ActionEvent event) {
        System.out.println(getClass());
    }

}
