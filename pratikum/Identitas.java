/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum;

/**
 *
 * @author LENOVO
 */
public class Identitas extends gaji {

    /**
     * @param args the command line arguments
     */
        String nama,jenisK;
        int nomorP=999;
  
    public void setnama(String nama){
        this.nama=nama;
    }public void setjenisK(String jenisK){
        this.jenisK=jenisK;
    }
    
    public void cetak(){
        System.out.println("Berikut data Pegawai");
        System.out.println("=========================");
        System.out.println("Nama = "+nama);
        System.out.println("Jenis Kelamin = "+jenisK);
        System.out.println("Nomor pegawai = "+nomorP);
        super.ket(); //To change body of generated methods, choose Tools | Templates.
        super.ket2();
        super.ket3();
    }
    
}
       