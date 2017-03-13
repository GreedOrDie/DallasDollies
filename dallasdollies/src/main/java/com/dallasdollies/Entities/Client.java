package com.dallasdollies.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by darionmoore on 3/13/17.
 */
@Entity(name = "clients")
public class Client {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String clientFirstName;

    @Column(nullable = false)
    private String clientLastName;

    @Column(nullable = false)
    private String clientEmail;

    @Column(nullable = false)
    private String clientPhoneNumber;

    @Column(nullable = false)
    private String clientUsername;

    @Column(nullable = false)
    private String clientPassword;

    public Client() {
    }

    public Client(String clientUsername, String clientPassword) {
        this.clientUsername = clientUsername;
        this.clientPassword = clientPassword;
    }

    public Client(String clientFirstName, String clientLastName, String clientEmail, String clientPhoneNumber, String clientUsername, String clientPassword) {
        this.clientFirstName = clientFirstName;
        this.clientLastName = clientLastName;
        this.clientEmail = clientEmail;
        this.clientPhoneNumber = clientPhoneNumber;
        this.clientUsername = clientUsername;
        this.clientPassword = clientPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public void setClientPhoneNumber(String clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }

    public String getClientUsername() {
        return clientUsername;
    }

    public void setClientUsername(String clientUsername) {
        this.clientUsername = clientUsername;
    }

    public String getClientPassword() {
        return clientPassword;
    }

    public void setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
    }
}
