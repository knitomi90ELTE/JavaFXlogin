/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui.admin;

import com.db.TableQuery;
import com.entity.UserEntity;
import com.panemu.tiwulfx.common.TableData;
import com.panemu.tiwulfx.table.TableControl;
import com.panemu.tiwulfx.table.TableController;
import com.panemu.tiwulfx.table.TextColumn;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author capri
 */
public class AdminController implements Initializable {

    
    private TableQuery controller;
    @FXML
    private TableControl<UserEntity> tableControl;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initTable();
    }
    
    private void initTable(){
        
        controller = new TableQuery();
        tableControl.setController(controller);
        tableControl.setRecordClass(UserEntity.class);
        tableControl.reloadFirstPage();
        
    }
    
}
