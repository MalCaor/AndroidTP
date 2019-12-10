package com.example.android;

import java.util.Date;

public class eleve {
    // Var
    private int num;
    private String nom;
    private String prenom;
    private int age;
    private String adresse;
    private Date datenaisse;

    // Constructeur
    public eleve(int vnum, String vnom, String vprenom, int vage, String vadresse, Date vdate) {
        num = vnum;
        nom = vnom;
        prenom = vprenom;
        age = vage;
        adresse = vadresse;
        datenaisse = vdate;
    }

    // Geter
    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public int getAge() {
        return this.age;
    }

    public int getNum() {
        return this.num;
    }

    public Date getDatenaiss() {
        return this.datenaisse;
    }

    // Seter
    public void setNum(int num) {
        this.num = num;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setDatenaiss(Date datenaisse) {
        this.datenaisse = datenaisse;
    }
}
