package mx.uacam.fi.tipcalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class TipCalculatorController {

    @FXML
    private TextField amountTxt;

    @FXML
    private Button calculateBtn;

    @FXML
    private Label percentageLbl;

    @FXML
    private Slider percentageSld;

    @FXML
    private TextField tipTxt;

    @FXML
    private TextField totalTxt;

    @FXML
    void calculateButtonPressed(ActionEvent event) {

    }

}
