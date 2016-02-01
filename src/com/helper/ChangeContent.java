/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helper;

import com.LoginFX;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author capri
 */
public class ChangeContent {

    private LoginFX instance;
    private Stage stage;

    public ChangeContent(LoginFX instance, Stage stage) {
        this.instance = instance;
        this.stage = stage;
    }

    public void replaceSceneContent(String fxml) throws Exception {
        try {
            Parent page = (Parent) FXMLLoader.load(instance.getClass().getResource(fxml), null, new JavaFXBuilderFactory());
            Scene scene = stage.getScene();
            if (scene == null) {
                scene = new Scene(page);
                stage.setScene(scene);
            } else {
                stage.getScene().setRoot(page);
            }
            stage.sizeToScene();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
