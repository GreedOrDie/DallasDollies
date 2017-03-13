package com.dallasdollies.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by darionmoore on 3/13/17.
 */
@Entity(name = "tans")
public class Tan {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String lifeCycle;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String price;

    public Tan() {
    }

    public Tan(String type, String lifeCycle, String description, String price) {
        this.type = type;
        this.lifeCycle = lifeCycle;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLifeCycle() {
        return lifeCycle;
    }

    public void setLifeCycle(String lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
