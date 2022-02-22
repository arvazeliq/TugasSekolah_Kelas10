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
public class persegi extends bangundatar{
    float sisi;
    
    public void luas(){
        float luas=sisi*sisi;
        System.out.println("luas persegi adalah "+luas);
    }
    public void keliling(){
        float keliling=4*sisi;
        System.out.println("keliling persegi adalah "+keliling);
    }
}
