/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_3;

/**
 *
 * @author LENOVO
 */
public class Anak_1 extends Ayah_1{
    double nilaimax=99.9;
    String nama;
    int age = 15;
    
    public void setnama(String nama){
        this.nama=nama;
    }
    public void Cetak_1(){
        System.out.println("Anak ini memiliki sifat "+super.Sifat);
        System.out.println("yang bernama "+nama);
        System.out.println("berumur "+age+"tahun");
        System.out.println("dengan tinggi Badan "+super.TB);
        super.hobbi();
    }
    
}


