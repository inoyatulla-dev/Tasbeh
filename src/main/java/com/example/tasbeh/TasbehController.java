package com.example.tasbeh;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
public class TasbehController {
    @FXML
    private Label jami;
    @FXML
    private Button tasbeh;
    @FXML
    private Text tasbeh1;


    int buttonjami = 0;
    int labeljami = 0;
    int max = 33;
    String text = "/33";


    public void button_33() {
        max = 33;
        text = "/33";
        tasbeh1.setText(buttonjami + text);

    }

    public void button_99() {
        max = 99;
        text = "/99";
        tasbeh1.setText(buttonjami + text);

    }

    public void onHelloButtonClick() {
        buttonjami += 1;
        labeljami += 1;
        jami.setText(labeljami + "");
        tasbeh.setText(buttonjami+"");
        tasbeh1.setText(buttonjami + text);

        if (buttonjami > max) {
            buttonjami = 0;
            tasbeh.setText(buttonjami+"");
            tasbeh1.setText(buttonjami + text);

        }
    }


    public void reset(ActionEvent actionEvent){
        labeljami = 0;
        buttonjami = 0;
        jami.setText(labeljami + "");
        tasbeh.setText(buttonjami +"");
        tasbeh1.setText(buttonjami + text);


    }
}