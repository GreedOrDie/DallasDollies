package com.dallasdollies.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by darionmoore on 3/13/17.
 */
@Entity(name = "packages")
public class Package {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String packageName;

    @Column(nullable = false)
    private String packageTan;

    @Column(nullable = false)
    private String packageMonthlyTanCount;

    @Column
    private String packageAddOn1;

    @Column
    private String packageAddOn2;

    @Column
    private String packageAddOn3;

    @Column
    private String packageAddOn4;

    @Column
    private String packageAddOn5;

    @Column(nullable = false)
    private String packageDescription;

    @Column(nullable = false)
    private String packagePrice;

    public Package() {
    }

    public Package(String packageName, String packageTan, String packageDescription, String packagePrice) {
        this.packageName = packageName;
        this.packageTan = packageTan;
        this.packageDescription = packageDescription;
        this.packagePrice = packagePrice;
    }

    public Package(String packageName, String packageTan, String packageMonthlyTanCount, String packageAddOn1, String packageDescription, String packagePrice) {
        this.packageName = packageName;
        this.packageTan = packageTan;
        this.packageMonthlyTanCount = packageMonthlyTanCount;
        this.packageAddOn1 = packageAddOn1;
        this.packageDescription = packageDescription;
        this.packagePrice = packagePrice;
    }

    public Package(String packageName, String packageTan, String packageMonthlyTanCount, String packageAddOn1, String packageAddOn2, String packageDescription, String packagePrice) {
        this.packageName = packageName;
        this.packageTan = packageTan;
        this.packageMonthlyTanCount = packageMonthlyTanCount;
        this.packageAddOn1 = packageAddOn1;
        this.packageAddOn2 = packageAddOn2;
        this.packageDescription = packageDescription;
        this.packagePrice = packagePrice;
    }

    public Package(String packageName, String packageTan, String packageMonthlyTanCount, String packageAddOn1, String packageAddOn2, String packageAddOn3, String packageDescription, String packagePrice) {
        this.packageName = packageName;
        this.packageTan = packageTan;
        this.packageMonthlyTanCount = packageMonthlyTanCount;
        this.packageAddOn1 = packageAddOn1;
        this.packageAddOn2 = packageAddOn2;
        this.packageAddOn3 = packageAddOn3;
        this.packageDescription = packageDescription;
        this.packagePrice = packagePrice;
    }

    public Package(String packageName, String packageTan, String packageMonthlyTanCount, String packageAddOn1, String packageAddOn2, String packageAddOn3, String packageAddOn4, String packageDescription, String packagePrice) {
        this.packageName = packageName;
        this.packageTan = packageTan;
        this.packageMonthlyTanCount = packageMonthlyTanCount;
        this.packageAddOn1 = packageAddOn1;
        this.packageAddOn2 = packageAddOn2;
        this.packageAddOn3 = packageAddOn3;
        this.packageAddOn4 = packageAddOn4;
        this.packageDescription = packageDescription;
        this.packagePrice = packagePrice;
    }

    public Package(String packageName, String packageTan, String packageMonthlyTanCount, String packageAddOn1, String packageAddOn2, String packageAddOn3, String packageAddOn4, String packageAddOn5, String packageDescription, String packagePrice) {
        this.packageName = packageName;
        this.packageTan = packageTan;
        this.packageMonthlyTanCount = packageMonthlyTanCount;
        this.packageAddOn1 = packageAddOn1;
        this.packageAddOn2 = packageAddOn2;
        this.packageAddOn3 = packageAddOn3;
        this.packageAddOn4 = packageAddOn4;
        this.packageAddOn5 = packageAddOn5;
        this.packageDescription = packageDescription;
        this.packagePrice = packagePrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageTan() {
        return packageTan;
    }

    public void setPackageTan(String packageTan) {
        this.packageTan = packageTan;
    }

    public String getPackageMonthlyTanCount() {
        return packageMonthlyTanCount;
    }

    public void setPackageMonthlyTanCount(String packageMonthlyTanCount) {
        this.packageMonthlyTanCount = packageMonthlyTanCount;
    }

    public String getPackageAddOn1() {
        return packageAddOn1;
    }

    public void setPackageAddOn1(String packageAddOn1) {
        this.packageAddOn1 = packageAddOn1;
    }

    public String getPackageAddOn2() {
        return packageAddOn2;
    }

    public void setPackageAddOn2(String packageAddOn2) {
        this.packageAddOn2 = packageAddOn2;
    }

    public String getPackageAddOn3() {
        return packageAddOn3;
    }

    public void setPackageAddOn3(String packageAddOn3) {
        this.packageAddOn3 = packageAddOn3;
    }

    public String getPackageAddOn4() {
        return packageAddOn4;
    }

    public void setPackageAddOn4(String packageAddOn4) {
        this.packageAddOn4 = packageAddOn4;
    }

    public String getPackageAddOn5() {
        return packageAddOn5;
    }

    public void setPackageAddOn5(String packageAddOn5) {
        this.packageAddOn5 = packageAddOn5;
    }

    public String getPackageDescription() {
        return packageDescription;
    }

    public void setPackageDescription(String packageDescription) {
        this.packageDescription = packageDescription;
    }

    public String getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(String packagePrice) {
        this.packagePrice = packagePrice;
    }
}
