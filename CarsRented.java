/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 *
 * @author student
 */
public class CarsRented {

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    private  boolean available;

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String CarName) {
        this.CarName = CarName;
    }

    public String getCarType() {
        return CarBrand;
    }

    public void setCarType(String CarType) {
        this.CarBrand = CarType;
    }

    public Date getDueDate() {
        return RentalPeriod;
    }

    public void setDueDate(Date date) {
        this.RentalPeriod = date;
    }
    String CarName;
    String CarBrand;
    Date RentalPeriod;

    /*
    To be completed
     */
    public CarsRented(String CarName, String CarType, Date borrowStartTime, boolean available) {
        this.CarName = CarName;
        this.CarBrand = CarType;
        this.RentalPeriod = borrowStartTime;
        this.available=available;
    }

    
}