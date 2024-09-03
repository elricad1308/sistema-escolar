/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.uacam.fi.tipcalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author jcagu
 */
public class TipCalculator extends Application {
    
    @Override
    public void start (Stage stage) throws Exception {
        Parent root = FXMLLoader.load(
          getClass().getResource("/TipCalculator.fxml")
        );
        
        Scene escena = new Scene(root);
        
        stage.setScene(escena);
        
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
