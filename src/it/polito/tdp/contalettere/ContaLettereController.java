package it.polito.tdp.contalettere;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ContaLettereController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnConta;

    @FXML
    private TextArea txtRisposta;

    @FXML
    void doConta(ActionEvent event) {
    	
    	// System.out.println("CLICK!") ;
    	String parola = txtParola.getText() ;
    	int lun = parola.length() ;
    	String messaggio = "La parola " + parola + " ha " + lun + " lettere" ;
    	txtRisposta.setText(messaggio);
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'ContaLettere.fxml'.";
        assert btnConta != null : "fx:id=\"btnConta\" was not injected: check your FXML file 'ContaLettere.fxml'.";
        assert txtRisposta != null : "fx:id=\"txtRisposta\" was not injected: check your FXML file 'ContaLettere.fxml'.";

    }
}


