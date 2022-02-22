/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Arva Zeliq Pradyatma
 */
public class anak1 extends ayah{
    double nilaimax=99.9;
    String nama="Dina";
    int age=17;
    
    public void cetak(){
        System.out.println("anak ini memiliki sifat "+super.sifat);
        System.out.println("yang bernama "+nama);
        System.out.println("berumur "+age+" tahun");
        System.out.println("dengan tinggi badan "+super.TB);
        super.hobi();
    }
}
