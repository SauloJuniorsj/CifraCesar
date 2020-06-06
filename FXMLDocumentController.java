/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifracesar;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Saulo Jr
 */
public class FXMLDocumentController implements Initializable {
    
   
    @FXML
    private TextField texto;
   @FXML
    private TextField texto2;
   @FXML
    private Button botao;
   
    Decifra de = new Decifra();
    @FXML
    private void codifica(){
       String a = texto.getText();
        texto2.setText(de.codifica(a,13).toString());
    }
    @FXML
    private void decodifica(){
        String b = texto2.getText();
        texto.setText(de.decodifica(b,13).toString());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
