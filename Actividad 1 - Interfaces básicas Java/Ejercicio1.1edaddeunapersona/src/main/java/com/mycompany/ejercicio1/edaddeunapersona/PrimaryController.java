
package com.mycompany.ejercicio1.edaddeunapersona;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtFecha;

    @FXML
    private Label lblResultado;

    @FXML
    private void calcularEdad() {
        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/uuuu");

        LocalDate nacimiento =
                LocalDate.parse(txtFecha.getText(), formato);

        LocalDate hoy = LocalDate.now();

        Period edad = Period.between(nacimiento, hoy);

        lblResultado.setText(
                "Tienes " + edad.getYears() + " años con "
                + edad.getMonths() + " meses"
        );
    }

    @FXML
    private void limpiar() {
        txtFecha.clear();
        lblResultado.setText("Aquí aparecerá tu edad");
    }
}
