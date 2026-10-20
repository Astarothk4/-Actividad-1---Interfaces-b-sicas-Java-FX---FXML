
package com.mycompany.ejercicio1.tablademultiplicar;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtNumero;

    @FXML
    private ListView<String> listaResultados;

    @FXML
    private void calcularTabla() {
        int numero = Integer.parseInt(txtNumero.getText());

        listaResultados.getItems().clear();

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;

            listaResultados.getItems().add(
                numero + " x " + i + " = " + resultado
            );
        }
    }

    @FXML
    private void limpiar() {
        txtNumero.clear();
        listaResultados.getItems().clear();
    }
}
