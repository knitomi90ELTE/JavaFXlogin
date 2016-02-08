package com.db;

import com.entity.PersistentEntity;
import java.util.*;


/**
 *
 * @author bpzykn
 */
public interface GenericDao<T extends PersistentEntity> {

    public void create(T entity);

    public void update(T entity);

    public void delete(T entity);

    public List<T> findAll();

    public T findById(Integer id);

}
