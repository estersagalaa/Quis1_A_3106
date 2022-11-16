/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikkumpbo.quis1_a_3106;

/**
 *
 * @author Ester Anastasya Sagala
 */
public class Nelayan_3106 extends Penduduk_3106 {
    int jmlhBeratIkan_3106, jmlhSolar_3106;
    double pendapatanNelayan_3106;
    String NIK_3106;
    
    public double totalPendapatanNelayan(){
        return pendapatanNelayan_3106 = (jmlhBeratIkan_3106*8000) - (jmlhSolar_3106*10000);
    }
    public void tampilDataNelayan(){
        tampilDataPenduduk();
        System.out.println("Berat Ikan   : "+jmlhBeratIkan_3106);
        System.out.println("Jumlah Solar : "+jmlhSolar_3106);
        System.out.println("");
    }

    public void tampilDataPenduduk() {
        throw new UnsupportedOperationException("Not supported yet."); 
    // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
