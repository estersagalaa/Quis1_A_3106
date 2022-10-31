/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.praktikkumpbo.bankberaksi;

/**
 *
 * @author IP130-14AST A4R3
 */
public class BankBeraksi {

    public static void main(String[] args) {
       Bank nasabah = new Bank(100000);
        System.out.println(nasabah.getSaldo());
        
        nasabah.simpanUang(500000);
        System.out.println(nasabah.getSaldo());
        
        nasabah.ambilUang(150000);
        System.out.println(nasabah.getSaldo());
    }
}
