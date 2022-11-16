/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikkumpbo.quis1_a_3106;

/**
 *
 * @author Ester Anastasya Sagala
 */


public class Dokter_3106 extends Penduduk_3106 {
    int jmlhPasien_3106, jmlhObat_3106;
    double pendapatanDokter_3106;
    String NIK_3106;
    
    public double totalPendapatanDokter(){
        return (jmlhPasien_3106*50000)+(jmlhObat_3106*10000);
    }
    public void tampilDataDokter(){
        tampilDataPenduduk();
        System.out.println("Jumlah Pasien: "+jmlhPasien_3106);
        System.out.println("Jumlah Obat  : "+jmlhObat_3106);
        System.out.println("");
    }
}
