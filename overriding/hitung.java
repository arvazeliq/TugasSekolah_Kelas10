/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author Arva Zeliq Pradyatma
 */
public class hitung {
    public static void main(String[] args) {
        bangundatar bangun=new bangundatar();
        
        persegi kotak=new persegi();
        kotak.sisi=8;
        
        persegipanjang buku=new persegipanjang();
        buku.lebar=11;
        buku.panjang=2;
        
        bangun.luas();
        bangun.keliling();
        
        kotak.luas();
        kotak.keliling();
        
        buku.luas();
        buku.keliling();
    }
}
