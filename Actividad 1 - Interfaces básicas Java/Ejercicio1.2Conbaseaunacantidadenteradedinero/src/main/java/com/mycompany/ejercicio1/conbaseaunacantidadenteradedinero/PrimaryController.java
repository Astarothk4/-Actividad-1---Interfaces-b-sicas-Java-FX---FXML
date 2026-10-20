package com.mycompany.ejercicio1.conbaseaunacantidadenteradedinero;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtDinero;
    @FXML
    private Label lbl500;
    @FXML
    private Label lbl200;
    @FXML
    private Label lbl100;
    @FXML
    private Label lbl50;
    @FXML
    private Label lbl20;
    @FXML
    private Label lbl10;
    @FXML
    private Label lbl5;
    @FXML
    private Label lbl2;
    @FXML
    private Label lbl1;
    @FXML
    private void desglosarDinero() {

        int dinero = Integer.parseInt(txtDinero.getText());
        int billetes500 = dinero / 500;
        dinero = dinero % 500;
        int billetes200 = dinero / 200;
        dinero = dinero % 200;
        int billetes100 = dinero / 100;
        dinero = dinero % 100;
        int billetes50 = dinero / 50;
        dinero = dinero % 50;
        int billetes20 = dinero / 20;
        dinero = dinero % 20;
        int monedas10 = dinero / 10;
        dinero = dinero % 10;
        int monedas5 = dinero / 5;
        dinero = dinero % 5;
        int monedas2 = dinero / 2;
        dinero = dinero % 2;
        int monedas1 = dinero;

        lbl500.setText(String.valueOf(billetes500));
        lbl200.setText(String.valueOf(billetes200));
        lbl100.setText(String.valueOf(billetes100));
        lbl50.setText(String.valueOf(billetes50));
        lbl20.setText(String.valueOf(billetes20));
        lbl10.setText(String.valueOf(monedas10));
        lbl5.setText(String.valueOf(monedas5));
        lbl2.setText(String.valueOf(monedas2));
        lbl1.setText(String.valueOf(monedas1));
    }

    @FXML
    private void limpiar() {
        txtDinero.clear();
        lbl500.setText("—");
        lbl200.setText("—");
        lbl100.setText("—");
        lbl50.setText("—");
        lbl20.setText("—");
        lbl10.setText("—");
        lbl5.setText("—");
        lbl2.setText("—");
        lbl1.setText("—");
    }
}