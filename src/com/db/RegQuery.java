/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db;

import com.entity.UserEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author capri
 */
public class RegQuery {
    EntityManager em;
    EntityManagerFactory emf;

    public RegQuery() {
        emf = Persistence.createEntityManagerFactory("LoginFXPU");
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }
    
    public void addUser(UserEntity user){
        em.persist(user);
        em.getTransaction().commit();
    }
    
    
}
