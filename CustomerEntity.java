package com.howtodoinjava.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class CustomerEntity {
     
    @Id
    @Column(name="ID")
    @GeneratedValue
    private Integer id;
     
    @Column(name="Imie")
    private String imie;
 
    @Column(name="Nazwisko")
    private String nazwisko;
 
    @Column(name="Email")
    private String email;
     
    @Column(name="Telefon")
    private String telefon;
     
     
    public String getEmail() {
        return email;
    }
    public String getTelephone() {
        return telefon;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelephone(String telefon) {
        this.telefon = telephone;
    }
    public String getFirstname() {
        return imie;
    }
    public String getLastname() {
        return nazwisko;
    }
    public void setFirstname(String firstname) {
        this.imie = firstname;
    }
    public void setLastname(String lastname) {
        this.nazwisko = lastname;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}