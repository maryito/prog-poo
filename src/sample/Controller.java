package sample;

import herencia.Perro;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    public Button bt_correr;
    public TextField txa_resuultado;
    @FXML
    private Button bt_comer;
    Perro pepito = new Perro();

    public void evento(Event e) {
//        System.out.println("Click.....");
        if( e.getSource() == bt_comer) {
            pepito.comer();
            txa_resuultado.setText("Zzzzz");

        }

        if( e.getSource() == bt_correr) {
            pepito.correr();


            txa_resuultado.setText( pepito.ladre() );
        }
    }
}
