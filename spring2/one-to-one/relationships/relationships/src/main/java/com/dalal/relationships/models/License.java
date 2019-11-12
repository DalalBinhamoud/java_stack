package com.dalal.relationships.models;




//import java.sql.Date;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

//...
@Entity
@Table(name="licenses")
public class License {
 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String number;
 @DateTimeFormat(pattern= "yyy-MM-dd")
 private Date expirationDate;
 private String state;
 @Column(updatable=false)
 private Date createdAt;
 private Date updatedAt;
 @OneToOne(fetch=FetchType.LAZY)
 @JoinColumn(name="person_id")
 private Person person;
 
 
 public License() {
     
 }
 

 
// public License(Date expirationDate, String state ,Person person ) {
//	 this.number = "0000"+ this.id;
//	 this.expirationDate = expirationDate;
//	 this.state = state;
//	 this.person = person;
//    }
    public Long getId() {
   	 return this.id;
    }
    public String getNumber() {
      	 return this.number;
       }
    
    public String getState() {
     	 return this.state;
      }
    
    public Date getExpirationDate() {
    	 return this.expirationDate;
     }
   
   public void setExpirationDate(Date expirationDate) {
    	  this.expirationDate = expirationDate;
     }
   
    public void setNumber(String number) {
     	  this.number = number;
      }
   
   public void setState(String state) {
    	  this.state = state;
     }
   public Person getPerson() {
       return person;
   }

   public void setPerson(Person person) {
       this.person = person;
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

