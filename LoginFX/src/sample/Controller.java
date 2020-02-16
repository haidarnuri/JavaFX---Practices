package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;

public class Controller {
    @FXML
    private Label lblStatus;
    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtPassword;

    public void login(ActionEvent event){

        if(txtUsername.getText().equals("user") && txtPassword.getText().equals("pass")){
            lblStatus.setText("Login Success");
        } else{
            lblStatus.setText("Login failed");
        }


    }



}
