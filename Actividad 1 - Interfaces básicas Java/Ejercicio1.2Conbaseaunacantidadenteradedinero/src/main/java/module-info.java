module com.mycompany.ejercicio1.conbaseaunacantidadenteradedinero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejercicio1.conbaseaunacantidadenteradedinero to javafx.fxml;
    exports com.mycompany.ejercicio1.conbaseaunacantidadenteradedinero;
}
