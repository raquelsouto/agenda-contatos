/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadecontatosjfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Raquel
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblAdicionar;
    private Button btSalvar;
    
    @FXML
    private void clicouSalvar(ActionEvent event) {
        lblAdicionar.setText("Contato salvo!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
