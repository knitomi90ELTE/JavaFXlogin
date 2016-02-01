/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui.reg;

import com.LoginFX;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

/**
 * FXML Controller class
 *
 * @author capri
 */
public class RegController implements Initializable {

    @FXML
    TextField nameField;
    @FXML
    TextField emailField;
    @FXML
    TextField pwd1Field;
    @FXML
    TextField pwd2Field;
    @FXML
    Label message;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void backToLogin(ActionEvent event) throws Exception{
        LoginFX.getInstance().getChangeContent().replaceSceneContent("gui/login/Login.fxml");
    }
    
    public void regAction(ActionEvent event){
        
    }
    
    private boolean isValidEmailAddress(String email) {
        boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        } catch (AddressException ex) {
            result = false;
        }
        return result;
    }

}
