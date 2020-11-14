/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan42.tabungan;
import java.util.Scanner;

/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Tabungan
 */



public class PBOIF210119056Latihan42Tabungan {

    public static void main(String[] args) {
        
        int jumlahAmbil;
        
        Scanner input=new Scanner(System.in);
        System.out.println("program");
        System.out.print("masukan :");
        
        Tabungan tabungan1=new Tabungan(input.nextInt());
        System.out.print("Jumlah Uang yang Diambil : ");
        jumlahAmbil=tabungan1.ambilUang(input.nextInt());
        
        System.out.println("saldo sekarang : "+jumlahAmbil);
        
        
    }
    
}
