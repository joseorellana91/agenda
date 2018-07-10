package com.agenda.entities;


import javax.persistence.Entity;

@Entity
public class Contact extends Persona {

    private String direccion;

    private String telefono;

    private byte[] userImage;




    //Contact Getter & Setters



    public String getDireccion() {return direccion;}



    public void setDireccion(String direccion) {this.direccion = direccion;}



    public String getTelefono() {return telefono;}



    public void setTelefono(String telefono) {this.telefono = telefono;}



    public byte[] getUserImage() {return userImage;}



    public void setUserImage(byte[] userImage) {this.userImage = userImage;}
}
