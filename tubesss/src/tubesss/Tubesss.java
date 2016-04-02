/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesss;

/**
 *
 * @author ANZYM
 */
public class Tubesss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Username : ");
        System.out.println("Password : ");
        Dosen Dsn1 = new Dosen("Imam",1301140343);
        //Kelas Kls = new Kelas();
        Mahasiswa Mhs = new Mahasiswa("ali",1000);
        MataKuliah Mtk1 = new MataKuliah("Kalkulus","Senin");
        MataKuliah Mtk2 = new MataKuliah("FIsika","Selasa");
        
        
        System.out.println("Nama Dosen : "+Dsn1.getNamaDosen());
        System.out.println("Nama Mahasiswa : "+Mhs.getNama());
        
    }
    
}
