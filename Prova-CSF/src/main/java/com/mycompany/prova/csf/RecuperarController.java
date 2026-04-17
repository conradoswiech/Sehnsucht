
package com.mycompany.prova.csf;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class RecuperarController{
    @FXML
    private TextField nome;
    private final ObservableList<Usuario> listaUsuario =
            FXCollections.observableArrayList();
        
  @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
    @FXML
    private void recuperar() throws IOException {
        for (int i=0;i<listaUsuario.size();i++) {
    if (listaUsuario.get(i).getNome().equals(nome.getText())) {
    alerta("Instrucoes enviadas");
}
    else{
    alertaErro("Cadastro nao encontrado");
    }
    }
    
    }
    
    @FXML
    private void alerta(String erro){
        Alert alertaERRO=new Alert(Alert.AlertType.INFORMATION);
        alertaERRO.setHeaderText("Erro");
        alertaERRO.setContentText(erro);
        alertaERRO.showAndWait();
    }
    @FXML
    private void alertaErro(String erro){
        Alert alertaERRO=new Alert(Alert.AlertType.ERROR);
        alertaERRO.setHeaderText("Erro");
        alertaERRO.setContentText(erro);
        alertaERRO.showAndWait();
    }
}
