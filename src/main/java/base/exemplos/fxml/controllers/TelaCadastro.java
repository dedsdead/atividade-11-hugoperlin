package base.exemplos.fxml.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TelaCadastro {

    @FXML
    private TextField tfPlaca;
    private TextField tfModelo;
    private TextField tfCor;
    private TextField tfFabricante;
    private TextField tfAno;

    @FXML
    private void cadastrar(ActionEvent event) {
        String placa = tfPlaca.getText();
        System.out.println(placa);

        String modelo = tfModelo.getText();
        System.out.println(modelo);

        String cor = tfCor.getText();
        System.out.println(cor);

        String fabricante = tfFabricante.getText();
        System.out.println(fabricante);

        int ano = Integer.parseInt(tfAno.getText());
        System.out.println(ano);
    }
}