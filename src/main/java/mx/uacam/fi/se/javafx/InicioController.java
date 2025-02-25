package mx.uacam.fi.se.javafx;

import javafx.application.Application;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;

public class InicioController extends Application {

    @FXML
    private Button btnAcerca;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnVer;

    @FXML
    void onBtnAgregarClicked(MouseEvent event) {
        // Cambia la escena
        try {
            Stage stage = (Stage) btnAgregar.getScene().getWindow();
            Parent newRoot = FXMLLoader.load(getClass().getResource("/vistas/Agregar.fxml"));
            Scene newScene = new Scene(newRoot);
            stage.setScene(newScene);
        } catch (IOException ex) {
            System.out.println("No se pudo cargar la nueva escena:\n" + ex.getMessage());
        }
    }

    @FXML
    void onBtnVerClicked(MouseEvent event) {

    }

    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/vistas/Inicio.fxml"));
            Scene escena = new Scene(root);
            stage.setTitle("Sistema Escolar");
            stage.setScene(escena);
            stage.show();
        } catch (IOException ex) {
            System.out.println("No se pudo cargar la clase Inicio:\n" + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
