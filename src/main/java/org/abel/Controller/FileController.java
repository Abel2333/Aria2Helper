package org.abel.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import org.abel.FileChoose;
import org.abel.JsonUtil;
import org.abel.Operative;
import org.abel.FileLocate;
import org.abel.view.Main;

import java.io.IOException;

public class FileController {
    String fileName;

    @FXML
    private Button getBack;

    @FXML
    private Button submit;

    @FXML
    private TextArea urlText;

    @FXML
    private Button Chooser;

    @FXML
    void handleBack(ActionEvent event) {
        Main.changeInterface(FileLocate.PRIMAL.toString());
    }

    @FXML
    void handleSubmit(ActionEvent event) throws IOException, InterruptedException {
        JsonUtil.getJson();
        Operative operative = new Operative();
        operative.addCommand("--input-file=" + '\"' + fileName + '\"');
        operative.run();
    }

    @FXML
    void handleFileChoose(ActionEvent event) {
        FileChoose fileChoose = new FileChoose("test");
        fileName = fileChoose.openFile().getPath();
    }
}
