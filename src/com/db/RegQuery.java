/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db;

import com.entity.UserEntity;

/**
 *
 * @author capri
 */
public class RegQuery extends DefaultDao<UserEntity> {

    public RegQuery() {
        super(UserEntity.class);
    }
    
    public void addUser(UserEntity user){
        create(user);
    }
    
    
}
