package com.dalal.authentication.models;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.data.annotation.Transient;
//import java.beans.Transient;


@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    @Transient
    private String passwordConfirmation;
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
    public User() {
    }
    
    
    public Long getId() {
    	return this.id;
    }
    
    public String getPassword() {
    	return this.password;
    }
    
    public String getPasswordConfirmation() {
    	return this.passwordConfirmation;
    }
    
    
    public void setPasswordConfirmation(String passwordConfirmation) {
   	 this.passwordConfirmation=passwordConfirmation;
   }
    public String getEmail() {
    	return this.email;
    }
    
    
    public void setId(Long id) {
    	 this.id=id;
    }
    
    public void setPassword(String password) {
    	 this.password=password;
    }
    
    public void setEmail(String email) {
    	 this.email=email;
    }
   
    
    // other getters and setters removed for brevity
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}
