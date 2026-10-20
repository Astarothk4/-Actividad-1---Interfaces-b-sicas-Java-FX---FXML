module com.mycompany.ejercicio1.edaddeunapersona {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejercicio1.edaddeunapersona to javafx.fxml;
    exports com.mycompany.ejercicio1.edaddeunapersona;
}
