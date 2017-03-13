package com.dallasdollies.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by darionmoore on 3/13/17.
 */
@Entity(name = "admins")
public class Administrator {
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String adminFirstName;

    @Column(nullable = false)
    private String adminLastName;

    @Column(nullable = false)
    private String adminEmail;

    @Column(nullable = false)
    private String adminPhoneNumber;

    @Column(nullable = false)
    private String adminUsername;

    @Column(nullable = false)
    private String adminPassword;

    @Column(nullable = false)
    private String adminPassword2;

    public Administrator() {
    }

    public Administrator(String adminUsername, String adminPassword) {
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
    }

    public Administrator(String adminFirstName, String adminLastName, String adminEmail, String adminPhoneNumber, String adminUsername, String adminPassword) {
        this.adminFirstName = adminFirstName;
        this.adminLastName = adminLastName;
        this.adminEmail = adminEmail;
        this.adminPhoneNumber = adminPhoneNumber;
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdminFirstName() {
        return adminFirstName;
    }

    public void setAdminFirstName(String adminFirstName) {
        this.adminFirstName = adminFirstName;
    }

    public String getAdminLastName() {
        return adminLastName;
    }

    public void setAdminLastName(String adminLastName) {
        this.adminLastName = adminLastName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminPhoneNumber() {
        return adminPhoneNumber;
    }

    public void setAdminPhoneNumber(String adminPhoneNumber) {
        this.adminPhoneNumber = adminPhoneNumber;
    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminPassword2() {
        return adminPassword2;
    }

    public void setAdminPassword2(String adminPassword2) {
        this.adminPassword2 = adminPassword2;
    }
}
