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

    /**
     * Metodo "event handler" associato alla gestione dell'evento ACTION
     * (cioè la pressione del bottone) sul bottone {@code btnConta}.\
     * Questo metodo viene chiamato automaticamente, ogni volta che il
     * bottone "Conta" viene premuto.
     * 
     * In questo esercizio, il metodo {@code doConta} raccoglie il testo che
     * l'utente ha inserito nella {@link TextField} di nome {@code txtParola},
     * ne calcola la lunghezza e stampa il risultato nella {@link TextArea}
     * di nome {@code txtRisposta}. 
     * 
     * @param event
     */
    @FXML
    void doConta(ActionEvent event) {
    	
    	// Estrae il valore corrente dell'attributo Text del TextField
    	// (cioè il testo scritto dall'utente)
    	String parola = txtParola.getText() ;
    	
    	int lun = parola.length() ;
    	String messaggio = "La parola " + parola + " ha " + lun + " lettere" ;
    	
    	// Imposta il contenuto della TextArea (rimpiazzando quello precedente)
    	txtRisposta.setText(messaggio);
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'ContaLettere.fxml'.";
        assert btnConta != null : "fx:id=\"btnConta\" was not injected: check your FXML file 'ContaLettere.fxml'.";
        assert txtRisposta != null : "fx:id=\"txtRisposta\" was not injected: check your FXML file 'ContaLettere.fxml'.";

    }
}


