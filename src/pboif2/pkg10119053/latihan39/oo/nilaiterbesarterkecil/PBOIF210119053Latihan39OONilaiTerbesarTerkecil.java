/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan39.oo.nilaiterbesarterkecil;

import java.util.Scanner;
import data.Nilai;
import data.Petugas;
/**
 *
 ** @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program nilai terbesar dan terkecil
 */
public class PBOIF210119053Latihan39OONilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Nilai nil = new Nilai();
        Petugas nama = new Petugas();
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukka Nama Petugas : ");
        nama.setPetugas(input.next());
        
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        nil.setnMhs(input.nextInt());
        
        for(int i=0; i<nil.getnMhs(); i++){
            System.out.print("Nilai Mahasiswa Ke-" + (i+1) + " = ");
            nil.setJumlahNilai(input.nextInt());
        }
        
        nil.tampilNilai();
        System.out.println("Petugas : " + nama.getPetugas());
    }
    
}
