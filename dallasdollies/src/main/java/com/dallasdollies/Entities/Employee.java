package com.dallasdollies.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by darionmoore on 3/13/17.
 */
@Entity(name = "employees")
public class Employee {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String empFirstName;

    @Column(nullable = false)
    private String empLastName;

    @Column(nullable = false)
    private String empEmail;

    @Column(nullable = false)
    private String empPhoneNumber;

    @Column(nullable = false)
    private String empUsername;

    @Column(nullable = false)
    private String empPassword;

    public Employee() {
    }

    public Employee(String empUsername, String empPassword) {
        this.empUsername = empUsername;
        this.empPassword = empPassword;
    }

    public Employee(String empFirstName, String empLastName, String empEmail, String empPhoneNumber, String empUsername, String empPassword) {
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.empEmail = empEmail;
        this.empPhoneNumber = empPhoneNumber;
        this.empUsername = empUsername;
        this.empPassword = empPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpPhoneNumber() {
        return empPhoneNumber;
    }

    public void setEmpPhoneNumber(String empPhoneNumber) {
        this.empPhoneNumber = empPhoneNumber;
    }

    public String getEmpUsername() {
        return empUsername;
    }

    public void setEmpUsername(String empUsername) {
        this.empUsername = empUsername;
    }

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }
}
