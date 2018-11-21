package com.dao;
// Generated Oct 8, 2018 6:36:55 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Person generated by hbm2java
 */
public class Person  implements java.io.Serializable {


     private int id;
     private String name;
     private String lastname;
     private Set jokes = new HashSet(0);

    public Person() {
    }

	
    public Person(int id) {
        this.id = id;
    }
    public Person(int id, String name, String lastname, Set jokes) {
       this.id = id;
       this.name = name;
       this.lastname = lastname;
       this.jokes = jokes;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public Set getJokes() {
        return this.jokes;
    }
    
    public void setJokes(Set jokes) {
        this.jokes = jokes;
    }




}

