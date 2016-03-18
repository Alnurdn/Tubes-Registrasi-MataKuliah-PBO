/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesss;

/**
 *
 * @author Rizaldi
 */
public class Tubesss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen Dsn = new Dosen("Imam",1301140343);
        //Kelas Kls = new Kelas();
        Mahasiswa Mhs = new Mahasiswa("ali",1000);
        MataKuliah Mtk = new MataKuliah("Kalkulus","Senin");
        
        
        System.out.println("Nama Dosen : "+Dsn.getNamaDosen();
        System.out.println("Nama Mahasiswa : "+Mhs.getNama());
        
    }
    
}
