package com.agenda.entities;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table (name = "persona")
public abstract class Persona implements Serializable {



    private  int id;

    private String name;

    private String lastName;

    private String email;



    // Getters & Setters


    public String getName() {return name;}



    public void setName(String name) {this.name = name;}



    public String getLastName() {return lastName;}



    public void setLastName(String lastName) {this.lastName = lastName;}



    public String getEmail() {return email;}



    public void setEmail(String email) {this.email = email;}
}
