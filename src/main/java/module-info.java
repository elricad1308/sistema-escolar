module SistemaEscolar {
    // Declara que la aplicación necesita los componentes de JavaFX para funcionar
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.desktop;
    requires java.logging;

    // Otorga permiso a las clases de JavaFX de ejecutar las clases de
    // nuestro paquete 'ejemplo'
    opens mx.uacam.fi.se.javafx to javafx.fxml, javafx.graphics;
    opens mx.uacam.fi.se.modelos to com.google.gson;
    opens mx.uacam.fi.se.data to com.google.gson, javafx.base;
}