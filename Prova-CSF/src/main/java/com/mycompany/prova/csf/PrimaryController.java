package com.mycompany.prova.csf;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
@FXML
    private TextField nome;
    @FXML
    private TextField senha;
    
    private final ObservableList<Usuario> listaUsuario =
            FXCollections.observableArrayList();
    
    @FXML
    private Label mensagem;
    
    
    @FXML
    private void switchToSecondary() throws IOException {
    if(nome.getText().isBlank()||senha.getText().isBlank()){
        mensagem.setStyle("-fx-text-fill: red;");
        mensagem.setText("senha ou usuario vazios");
    }
    else{
    for (int i=0;i<listaUsuario.size();i++) {
    if (listaUsuario.get(i).getNome().equals(nome.getText()) && listaUsuario.get(i).getSenha().equals(senha.getText())) {
    App.setRoot("secondary");
}
    else{
        mensagem.setStyle("-fx-text-fill: red;");
        mensagem.setText("senha ou usuario incorretos");
    }
    }
    }
    }
    
    
    
    @FXML
    private void cadastro() throws IOException {
        App.setRoot("cadastro");
    }
    
    @FXML
    private void rec() throws IOException {
        App.setRoot("recuperar");
    }
       
    }




