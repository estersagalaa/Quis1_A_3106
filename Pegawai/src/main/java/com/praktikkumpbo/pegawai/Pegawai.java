/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.praktikkumpbo.pegawai;

/**
 *
 * @author Ester Anastasya Sagala
 */
import java.util.Scanner;
public class Pegawai {

    public static void main(String[] args) {
      Pegawai tetap;
      tetap = new Pegawai();
      
        System.out.println();
        
        Scanner inputBilangan = new Scanner(System.in);
        Scanner inputKalimat = new Scanner(System.in);
        
        System.out.println("Masukkan NIP");
        tetap.setNIP(inputKalimat.nextLine());
        
        System.out.println("Masukkan nama :");
        tetap.setNama(inputKalimat.nextLine());
        
        System.out.println("Masukkan alamat :");
        tetap.setAlamat(inputKalimat.nextLine());
        
        System.out.println("Masukkan jumlah hari lembur :");
        tetap.setJumlahHariLembur(inputBilangan.nextInt());
        
        System.out.println("Gaji Pokok :");
        tetap.setGajiPokok(inputBilangan.nextInt());
        
        tetap.setInfo();
        
        tetap.cetak();
        
        
    }

    private void cetak() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setGajiPokok(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setJumlahHariLembur(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setAlamat(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setNama(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setNIP(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
