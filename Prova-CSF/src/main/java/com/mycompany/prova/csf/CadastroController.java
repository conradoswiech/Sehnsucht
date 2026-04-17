
package com.mycompany.prova.csf;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CadastroController{
    @FXML
    private TextField nome;
    
    @FXML
    private TextField senha;
    
    @FXML
    
    private ChoiceBox <String> perfil;
    @FXML
    private CheckBox termos;
    private final ObservableList<Usuario> listaUsuario =
            FXCollections.observableArrayList();
    
    @FXML
    private Label mensagem;
    
   @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
    @FXML
    public void initialize(){
        perfil.getItems().addAll("Administrador", "Comum");
    }
    
    @FXML
    private void adicionar(){
        if(termos.isSelected()){
        String nomeAdicionado = nome.getText();
        String senhaAdicionado = senha.getText();
        String perfilselec = perfil.getValue();
        if(senha.getText().isBlank()||nome.getText().isBlank()){
        mensagem.setStyle("-fx-text-fill: red;");
        mensagem.setText("campos vazios"); 
        }
        else{
        Usuario usuario = new Usuario(nomeAdicionado, senhaAdicionado,perfilselec);
        listaUsuario.add(usuario);
        }
        }
        else{
        mensagem.setStyle("-fx-text-fill: red;");
        mensagem.setText("Termos de uso não aceitos");
        }
    }
}
