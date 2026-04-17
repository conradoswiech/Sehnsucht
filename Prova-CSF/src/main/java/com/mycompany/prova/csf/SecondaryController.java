package com.mycompany.prova.csf;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SecondaryController {
@FXML
    private ImageView imagem;
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
    @FXML
    public void initialize(){
        Image image=new Image(getClass().getResourceAsStream("cadastro.png"));
        imagem.setImage(image);
    }
    
}