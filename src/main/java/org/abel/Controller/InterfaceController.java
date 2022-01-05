package org.abel.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.abel.FileLocate;
import org.abel.view.Main;

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
        Main.changeInterface(FileLocate.FILEDOWN.toString());
    }

}
