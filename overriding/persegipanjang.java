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
public class persegipanjang extends bangundatar{
    float panjang,lebar;
    
    public void luas(){
        float luas=panjang*lebar;
        System.out.println("luas persegi panjang : "+luas);
    }
    public void keliling(){
        float keliling=2*(panjang+lebar);
        System.out.println("keliling persegi panjang "+keliling);
    }
}
