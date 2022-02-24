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
import java.util.ArrayList;

/**
 *
 * @author student
 */
class UserInfo {
    /*to be completed
    For now, we just add book info to make the example work. This class must be completed in future
    */
    private ArrayList <CarsRented> carsrented= new ArrayList<>();
    public void addBook(CarsRented cars){
        carsrented.add(cars);
    }
    public ArrayList<CarsRented> getBookBorrowed(){
        return carsrented;
    }
    
}