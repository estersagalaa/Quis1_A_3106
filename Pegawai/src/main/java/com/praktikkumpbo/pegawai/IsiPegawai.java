/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikkumpbo.pegawai;

/**
 *
 * @author Ester Anastasya Sagala
 */
public class IsiPegawai {
    //atribut
    private String NIP;
    private String nama;
    private String alamat;
    private int JumlahHariLembur;
    private double GajiPokok;
    private double TotalGaji;
    
    //method
    public IsiPegawai(){
    }
    
    public String getNIP() {
        return NIP;
    }
    
    public void setNIP(String NIP){
        this.NIP=NIP;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    
    public int getJumlahHariLembur(){
        return JumlahHariLembur;
    }
    
    public void setJumlahHariLembur(int JumlahHariLembur){
        this.JumlahHariLembur=JumlahHariLembur;
    }
    
    public double getGajiPokok(){
        return GajiPokok;
    }
    
    public void setGajiPokok(float GajiPokok){
        this.GajiPokok=GajiPokok;
    }
    
    public double getTotalGaji(){
        return TotalGaji;
    }
    
    public void setTotalGaji(double TotalGaji){
        this.TotalGaji = TotalGaji;
    }
    
    public void setInfo(){
        this.TotalGaji=GajiPokok + (GajiPokok * JumlahHariLembur * 0.01);
    }
    
    public void cetak(){
        System.out.println("NIP : " +this.NIP);
        System.out.println("Nama Pegawai : " +this.nama);
        System.out.println("Alamat :" +this.alamat);
        System.out.println("Jumlah Hari Lembur : " +this.JumlahHariLembur);
        System.out.println("Gaji Pokok : " +this.GajiPokok);
        System.out.println("Total Gaji :" +this.GajiPokok);
    }
}
