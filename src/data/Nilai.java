/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Dean
 */
public class Nilai {
    private int BanyakMhs;
    private ArrayList nilai = new ArrayList();
    
    public void setnMhs(int BanyakMhs){
        this.BanyakMhs = BanyakMhs;
    }

    public int getnMhs() {
        return BanyakMhs;
    }

    public void setJumlahNilai(int nilai) {
        this.nilai.add(nilai);
    }
    
    public int nilaiTerbesar(){
        return (int) Collections.max(nilai);
    }
    
    public int nilaiTerkecil(){
        return (int) Collections.min(nilai);
    }

    public void tampilNilai(){
        System.out.println("");
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        for (int i=0; i < nilai.size(); i++){
            System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " = " + nilai.get(i));
        }
        
        System.out.println("\nNilai Terbesar adalah " + nilaiTerbesar());
        System.out.println("Nilai Terkecil adalah " + nilaiTerkecil());
    }
}