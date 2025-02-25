package mx.uacam.fi.se.javafx;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import java.io.IOException;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

public class AgregarController {

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnRegresar;

    @FXML
    private ComboBox<?> cmbRol;

    @FXML
    private ToggleGroup radSexo;

    @FXML
    private RadioButton radSexoH;

    @FXML
    private RadioButton radSexoM;

    @FXML
    private RadioButton radSexoO;

    @FXML
    private TextField txtApellido;

    @FXML
    private DatePicker txtFecha;

    @FXML
    private TextField txtNombre;

    @FXML
    void onBtnRegresarClicked (MouseEvent event) {
        // Cambia la escena para regresar al inicio
        try {
            Stage stage = (Stage)btnRegresar.getScene().getWindow();
            Parent newRoot = FXMLLoader.load(getClass().getResource("/vistas/Inicio.fxml"));
            Scene newScene = new Scene(newRoot);
            stage.setScene(newScene);
        } catch (IOException ex) {
            System.out.println("No se pudo cargar la escena:\n" + ex.getMessage());
        }
    }

}
