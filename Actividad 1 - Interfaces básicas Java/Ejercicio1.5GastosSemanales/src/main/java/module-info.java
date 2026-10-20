module com.mycompany.ejercicio1.gastossemanales {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejercicio1.gastossemanales to javafx.fxml;
    exports com.mycompany.ejercicio1.gastossemanales;
}
