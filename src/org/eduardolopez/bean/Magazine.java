/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eduardolopez.bean;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author programacion
 */
public class Magazine extends Publication{
    private int id;
    
    public Magazine(String title, Date edititionDate, String editorial) {
        super(title, edititionDate, editorial);
    }

    public int getId() {
        return id;
    }
    
    public String toString(){
        return "Magazine: " + this.getTitle() + "-" + this.getEditorial();
    }
    public static ArrayList<Magazine>makeMagazineList(){
        return null;
    }
    
}
