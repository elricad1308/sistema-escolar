module TipCalculator {    
// Declara que la aplicación necesita los componentes de JavaFX para funcionar
    requires javafx.controls;
    requires javafx.fxml;

    // Otorga permiso a las clases de JavaFX de ejecutar las clases de
    // nuestro paquete 'ejemplo'
    opens mx.uacam.fi.tipcalculator to javafx.fxml, javafx.graphics;
}