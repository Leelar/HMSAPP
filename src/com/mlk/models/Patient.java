/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mlk.models;

import java.util.Date;

/**
 *
 * @author nnp1
 */
public class Patient {
    /* ===== composition ===== */
    private String code;
    private String name;
    private String surname;
    private String gender;
    private Date DOB;
    private String telephone;
    private String number;
    private String occupation;
    private String nationality;
    private String province;
    private String district;
    private String village;
    /*===== end of composition =====*/
    
    /*===== association =====*/
    /*===== end of association =====*/
    
    //constructor
    public Patient(){
    }
    public Patient(String code, String name, String surname, String gender, Date dob, String telephone, String number, String occupation, String nationality, String province, String district, String village){
        this.code = code;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.DOB = dob;
        this.telephone = telephone;
        this.number = number;
        this.occupation = occupation;
        this.nationality = nationality;
        this.province = province;
        this.district = district;
        this.village = village;
    }
    //getters

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public Date getDOB() {
        return DOB;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getNumber() {
        return number;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getNationality() {
        return nationality;
    }

    public String getProvince() {
        return province;
    }

    public String getDistrict() {
        return district;
    }

    public String getVillage() {
        return village;
    }
    //setters

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setVillage(String village) {
        this.village = village;
    }
    
}
