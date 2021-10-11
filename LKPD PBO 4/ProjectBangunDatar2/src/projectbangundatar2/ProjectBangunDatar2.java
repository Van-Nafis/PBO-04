/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author Acer
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Persegi Panjang
        System.out.println(persegiPanjang.hitungLuas(5.6,8.8));
        System.out.println(persegiPanjang.hitungKeliling(5.6,8.8));
        
        //Persegi
        System.out.println(persegi.hitungLuas(4.5));
        System.out.println(persegi.hitungKeliling(7));
        
        //Lingkaran
        System.out.println(lingkaran.hitungLuas(5));
        System.out.println(lingkaran.hitungKeliling(7.4));
        
        //Segitiga Siku
        System.out.println(segitigaSiku.hitungLuas(8,11.5));
        System.out.println(segitigaSiku.hitungKeliling(13.9,20.7));
    }
    
}
