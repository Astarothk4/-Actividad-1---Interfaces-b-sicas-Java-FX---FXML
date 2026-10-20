package com.mycompany.ejercicio1.cifrasydivisores;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtNumero;
    @FXML
    private TextField txtCantidad;
    @FXML
    private TextField txtImpares;
    @FXML
    private TextField txtPares;
    @FXML
    private TextField txtSuma;
    @FXML
    private TextField txtMayor;
    @FXML
    private TextField txtMenor;
    @FXML
    private ListView<String> listaDivisores;
    @FXML
    private void analizar() {

        int numero = Integer.parseInt(txtNumero.getText());
        String cifras = String.valueOf(numero);

        int cantidad = cifras.length();
        int sumaImpares = 0;
        int sumaPares = 0;
        int sumaTotal = 0;
        int mayor = 0;
        int menor = 9;

        for (int i = 0; i < cifras.length(); i++) {

            int cifra = Character.getNumericValue(cifras.charAt(i));

            sumaTotal = sumaTotal + cifra;

            if (cifra % 2 == 0) {
                sumaPares = sumaPares + cifra;
            } else {
                sumaImpares = sumaImpares + cifra;
            }

            if (cifra > mayor) {
                mayor = cifra;
            }

            if (cifra < menor) {
                menor = cifra;
            }
        }

        txtCantidad.setText(String.valueOf(cantidad));
        txtImpares.setText(String.valueOf(sumaImpares));
        txtPares.setText(String.valueOf(sumaPares));
        txtSuma.setText(String.valueOf(sumaTotal));
        txtMayor.setText(String.valueOf(mayor));
        txtMenor.setText(String.valueOf(menor));

        listaDivisores.getItems().clear();

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                listaDivisores.getItems().add(String.valueOf(i));
            }
        }
    }

    @FXML
    private void limpiar() {

        txtNumero.clear();
        txtCantidad.clear();
        txtImpares.clear();
        txtPares.clear();
        txtSuma.clear();
        txtMayor.clear();
        txtMenor.clear();

        listaDivisores.getItems().clear();
    }
}
