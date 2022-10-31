/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.praktikkumpbo.projecttitik;

import static java.time.Clock.system;
import java.util.*;

/**
 *
 * @author IP130-14AST A4R3
 */
public class ProjectTitik {

    public static void main(String[] args) {
        
        Scanner masukan = new Scanner(System.in);
        Titik titik = new Titik();
        int x, y, skalar;
        boolean lanjut = true;
        
        do{
            System.out.println("MENU OPERASI TITIK");
            System.out.println("[1] INISIALISASI TITIK");
            System.out.println("[2] TAMPIL TITIK");
            System.out.println("[3] PERKALIAN SKALAR TITIK");
            System.out.println("[4] PENCERMINAN TERHADAP SUMBU X");
            System.out.println("[5] PENCERMINAN TERHADAP SUMBU Y");
            System.out.println("[6] JARAK ANTARA DUA TITIK");
            System.out.println("[0] KELUAR");
            
            System.out.print("MASUKKAN PILIHAN :");
            int opsi = masukan.nextInt();
            
            switch (opsi){
                case 1:
                    System.out.print("Masukan titik X :");
                    x = masukan.nextInt();
                    System.out.print("Masukan titik Y :");
                    y = masukan.nextInt();
                    
                    titik.inisialisasiTitik(x,y);
                break;
                
                case 2:
                    titik.tampilTitik();
                    break;
                   
                case 3:
                    System.out.print("Masukan nilai skalar :");
                    skalar = masukan.nextInt();
                    titik.perkalianSkalar(skalar);
                    break;
                    
                case 4:
                    titik.PencerminanSumbuX();
                    break;
                    
                case 5:
                    titik.PencerminanSumbuY();
                    break;
                    
                case 6:
                    System.out.print("Masukan titik X2 :");
                    x = masukan.nextInt();
                    System.out.print("Masukan titik Y2 :");
                    y = masukan.nextInt();
                    
                    Titik titik2 = new Titik();
                    titik2.inisialisasiTitik(x,y);
                    System.out.println(titik.jarak(titik2));
                    break;
                    
                case 0:
                    System.out.println("\n Exiting program...\n");
                    lanjut = false;
                    break;
                    
                default :
                    System.out.println("Pilihan tidak ada");
                    
                         
                    
                    
                    
            }
        } while (lanjut);
    }
}
