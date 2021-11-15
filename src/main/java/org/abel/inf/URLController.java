package org.abel.inf;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import org.abel.JsonUtil;
import org.abel.Operative;

import java.io.IOException;

public class URLController {

    @FXML
    private Button getBack;

    @FXML
    private Button submit;

    @FXML
    private TextArea urlText;

    @FXML
    void handleBack(ActionEvent event) {
        Main.changeInterface(FileLocate.PRIMAL.toString());
    }

    @FXML
    void handleSubmit(ActionEvent event) throws IOException, InterruptedException {
        JsonUtil.getJson();
        Operative operative = new Operative();
        operative.addCommand(urlText.getText());
        operative.run();
    }

}
