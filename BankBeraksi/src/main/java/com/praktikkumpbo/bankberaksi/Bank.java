/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikkumpbo.bankberaksi;

/**
 *
 * @author IP130-14AST A4R3
 */
public class Bank {
    int saldo;
    int saldoProses;
    
    Bank(int saldo){
        this.saldo = saldo;
        System.out.println("\n Selamat datang di bank ABC");
    }
    
    public void simpanUang(int uangMasuk){
        this.saldoProses = this.saldo +uangMasuk;
        this.saldo = this.saldoProses;
        
        System.out.println("\nSimpan Uang : Rp. " +uangMasuk);
    }
    
    public void ambilUang(int uangKeluar){
        this.saldoProses = this.saldo - uangKeluar;
        this.saldo = this.saldoProses;
        
        System.out.println("\n Ambil uang : Rp. " +uangKeluar);
    }
    public int getSaldo(){
        System.out.println("Saldo saat ini : Rp.");
        return saldo;
    }
}


