module com.mycompany.ejercicio1.tablademultiplicar {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejercicio1.tablademultiplicar to javafx.fxml;
    exports com.mycompany.ejercicio1.tablademultiplicar;
}
