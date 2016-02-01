/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db;

import com.entity.UserEntity;
import com.panemu.tiwulfx.common.TableCriteria;
import com.panemu.tiwulfx.common.TableData;
import com.panemu.tiwulfx.table.TableController;
import java.util.List;
import javafx.scene.control.TableColumn;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author capri
 */
public class TableQuery extends TableController<UserEntity>{
    
    EntityManager em;
    EntityManagerFactory emf;

    public TableQuery() {
        emf = Persistence.createEntityManagerFactory("LoginFXPU");
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }
    
    @Override
    public TableData<UserEntity> loadData(int i, List<TableCriteria> list, List<String> list1, List<TableColumn.SortType> list2, int i1) {
        List<UserEntity> listUser = em.createNamedQuery("UserEntity.findAll", UserEntity.class).getResultList();
        return new TableData<>(listUser, false, listUser.size());
    }
    
    
    
    
}
