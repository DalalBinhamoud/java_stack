package com.dalal.relationships.models;




import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="persons")
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    @OneToOne(mappedBy="person", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private License license;
    
    public Person() {
        
    }

 public Person(String firstName, String lastName ) {
	 this.firstName = firstName;
	 this.lastName = lastName;
        
    }
    public Long getId() {
   	 return this.id;
    }
    
    public void setId(Long id) {
      	  this.id = id;
       }
    public String getFirstName() {
      	 return this.firstName;
       }
    
    public String getLastName() {
     	 return this.lastName;
      }
    
    public void setFirstName(String firstName) {
     	  this.firstName = firstName;
      }
   
   public void setLastName(String lastName) {
    	  this.lastName = lastName;
     }
   
   @PrePersist
   protected void onCreate(){
       this.createdAt = new Date();
   }
   @PreUpdate
   protected void onUpdate(){
       this.updatedAt = new Date();
   }
}