module com.mycompany.ejercicio1.cifrasydivisores {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejercicio1.cifrasydivisores to javafx.fxml;
    exports com.mycompany.ejercicio1.cifrasydivisores;
}
