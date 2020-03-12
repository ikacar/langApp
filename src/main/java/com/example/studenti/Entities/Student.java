package com.example.studenti.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String surname;
    private String br_indeksa;

    public Student(String name, String surname, String br_indeksa) {
        this.name = name;
        this.surname = surname;
        this.br_indeksa = br_indeksa;
    }

    public Student() {
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBr_indeksa() {
        return br_indeksa;
    }

    public void setBr_indeksa(String br_indeksa) {
        this.br_indeksa = br_indeksa;
    }
}
