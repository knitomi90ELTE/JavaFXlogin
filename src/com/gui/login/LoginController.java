/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui.login;

import com.LoginFX;
import com.db.LoginQuery;
import com.entity.UserEntity;
import com.security.PasswordHash;
import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

/**
 *
 * @author capri
 */
public class LoginController implements Initializable {
    
    @FXML
    private TextField email;
    @FXML
    private PasswordField password;
    @FXML
    private Label message;
    
    private LoginQuery query = new LoginQuery();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    public void loginAction(ActionEvent event) {
        
        if(email.getText().isEmpty()){
            message.setText("Nem adott meg emailt!");
            return;
        }
        if(password.getText().isEmpty()){
            message.setText("Nem adott meg jelszót!");
            return;
        }
        
        UserEntity current = query.findUser(email.getText());
        if(current != null){
            try{
                if(PasswordHash.validatePassword(password.getText(), current.getPassword())){
                    message.setTextFill(Paint.valueOf("00ff00"));
                    message.setText("Jelszó megfelelő!");
                }else{
                    message.setText("Hibás jelszó!");
                }
            }catch(NoSuchAlgorithmException | InvalidKeySpecException e){
            }
        } else {
            message.setText("Email nem létezik!");
        }
        message.setTextFill(Paint.valueOf("ff0000"));
        
    }
    
    public void changeToRegAction(ActionEvent event) throws IOException, Exception{
        LoginFX app = LoginFX.getInstance();
        app.getChangeContent().replaceSceneContent("gui/reg/Reg.fxml");
        
        
    }

}
