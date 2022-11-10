package GUI;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Spinner;

public class Controller {
    @FXML
    private Spinner<Integer> numberTCP;

    @FXML
    private Button pause;

    @FXML
    private ProgressBar progressbar;

    @FXML
    private Button resume;

    @FXML
    private Button start;
}
