/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db;

import com.entity.UserEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

/**
 *
 * @author capri
 */
public class LoginQuery {
    
    EntityManager em;
    EntityManagerFactory emf;

    public LoginQuery() {
        emf = Persistence.createEntityManagerFactory("LoginFXPU");
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }
    
    public List<UserEntity> listLogin(){
        return em.createNamedQuery("UserEntity.findAll", UserEntity.class).getResultList();
    }
    
    public UserEntity findUser(String email){
        try{
            return em.createNamedQuery("UserEntity.findByEmail", UserEntity.class).setParameter("email", email).getSingleResult();
        }catch(NoResultException e){
            return null;
        }
        
    }
    
}
