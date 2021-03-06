/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db;

import com.entity.UserEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

/**
 *
 * @author capri
 */
public class LoginQuery extends DefaultDao<UserEntity> {
    
    
    public LoginQuery() {
        super(UserEntity.class);
    }
    
    public List<UserEntity> listLogin(){
        EntityManager entityManager = getEntityManager();
        return entityManager.createNamedQuery("UserEntity.findAll", UserEntity.class).getResultList();
    }
    
    public UserEntity findUser(String email){
        try{
            EntityManager entityManager = getEntityManager();
            return entityManager.createNamedQuery("UserEntity.findByEmail", UserEntity.class).setParameter("email", email).getSingleResult();
        }catch(NoResultException e){
            return null;
        }
        
    }
  
}
