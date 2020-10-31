/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119049.latihan22.perhitunganlingkaran;
import java.util.Scanner;
/**
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : program untuk mencari nilai jari-jari, luas dan lingkaran
 */
public class PBOIF210119049Latihan22PerhitunganLingkaran {
     public static Scanner scan = new Scanner(System.in);
    
    public static double setDiameterLingkaran (double diameter){
        //init vars
        boolean isDouble = false;
        String tempValue;
        
        System.out.println("=======Perhitungan Lingkaran=======");
        
        do{
            System.out.print("Masukkan nilai diameter lingkaran : ");        
            tempValue = scan.nextLine();
            
            if(tempValue.matches("[0-9]*")) {
                diameter = Double.parseDouble(tempValue);
                isDouble = true;
            }
            else{
                System.out.println("Nilai Diameter tidak sesuai");
                isDouble = false;
            }
           }
        while(!isDouble);
        
        return diameter;
    }
    
    public static double getJariJari(double diameter){
        return diameter/2;
    }
    
    public static double getLuas(double diameter){
        return Math.PI * diameter/2 * diameter/2;
    }
    
    public static double getKeliling(double diameter){
        return 2 * Math.PI * (diameter/2);
    }
    
    public static void getTampilHasil(double diameter){
        double nilaiJariJari = getJariJari(diameter);
        double nilaiLuas = getLuas(diameter);
        double nilaiKeliling = getKeliling(diameter);
        
        System.out.println("Jari - Jari Lingkaran = " + nilaiJariJari + " cm");
        System.out.printf("Luas Lingkaran = %.2f cm%n",nilaiLuas);
        System.out.printf("Keliling Lingkaran = %.2f cm%n", nilaiKeliling);
    }
    
    public static void main(String[] args) {
        double diameter = 0;
        diameter = setDiameterLingkaran(diameter);
        getTampilHasil(diameter);
          
    }
    
}
