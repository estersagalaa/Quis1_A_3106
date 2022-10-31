/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikkumpbo.projecttitik;

/**
 *
 * @author IP130-14AST A4R3
 */
public class Titik {
    public int x, y;
    public Titik(){
        
    }
    public void inisialisasiTitik(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void tampilTitik(){
        System.out.println("Titik X :" +x);
        System.out.println("Titik Y :" +y);
    }
    
    public void perkalianSkalar(int skalar){
        int hasilX;
        int hasilY;
        hasilX = this.x * skalar;
        hasilY = this.y * skalar;
        
        System.out.println("Hasil kali skalar");
        System.out.println("X :" +hasilX);
        System.out.println("Y :" +hasilY);
    }
    
    public void pencerminanSumbuX(){
        int hasilCermin;
        hasilCermin = y * -1;
        System.out.println("Pencerminan sumbu X");
        System.out.println("X :" +x);
        System.out.println("Y " +hasilCermin);
    }
    
    public void pencerminanSumbuY(){
        int hasilCermin;
        hasilCermin = x * -1;
        System.out.println("Pencerminan sumbu Y");
        System.out.println("X :" +hasilCermin);
        System.out.println("Y :" +y);
    }
    
    public double jarak(Titik t2){
        System.out.println("\n X1 : " +this.x);
        System.out.println("X2 : " +t2.x);
        System.out.println("Y1 :" +this.y);
        System.out.println("Y2 : " +t2.y);
        
        double jarak, hasilX, hasilY;
        hasilX = Math.pow((t2.x - this.x), 2);
        hasilY = Math.pow((t2.y - this.y), 2);
        jarak = Math.sqrt((hasilX+hasilY));
        
        System.out.println("Jarak :");
        return jarak;
        
    }

    void PencerminanSumbuX() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void PencerminanSumbuY() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
