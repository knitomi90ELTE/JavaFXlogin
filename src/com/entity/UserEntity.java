/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author capri
 */
@Entity
@Table(name = "test2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserEntity.findAll", query = "SELECT u FROM UserEntity u"),
    @NamedQuery(name = "UserEntity.findById", query = "SELECT u FROM UserEntity u WHERE u.id = :id"),
    @NamedQuery(name = "UserEntity.findByName", query = "SELECT u FROM UserEntity u WHERE u.name = :name"),
    @NamedQuery(name = "UserEntity.findByEmail", query = "SELECT u FROM UserEntity u WHERE u.email = :email"),
    @NamedQuery(name = "UserEntity.findByPassword", query = "SELECT u FROM UserEntity u WHERE u.password = :password")})
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;

    public UserEntity() {
    }

    public UserEntity(Integer id) {
        this.id = id;
    }

    public UserEntity(Integer id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserEntity)) {
            return false;
        }
        UserEntity other = (UserEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    /*
    @Override
    public String toString() {
        return "com.entity.UserEntity[ id=" + id + " ]";
    }
    */

    @Override
    public String toString() {
        return "UserEntity{" + "id=" + id + ", name=" + name + ", email=" + email + '}';
    }
    
    
    
}
