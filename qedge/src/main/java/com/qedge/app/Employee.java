package com.qedge.app;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Employee {
    private Long id;
    private String first_name;
    private String last_name;
    private String username;
    private String password;
    private String address;
    private String contact;
    
 
    protected Employee() {
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
     
    // other getters and setters are hidden for brevity
}