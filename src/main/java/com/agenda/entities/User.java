package com.agenda.entities;

import javax.persistence.Entity;

@Entity
public class User extends Persona{




    private String username;

    private String password;






    //User Getters & Setters



    public String getUsername() {return username;}



    public void setUsername(String username) {this.username = username;}



    public String getPassword() {return password;}



    public void setPassword(String password) {this.password = password;}
}
