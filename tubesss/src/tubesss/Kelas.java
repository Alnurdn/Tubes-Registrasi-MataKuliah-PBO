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


public class Kelas {
    private MataKuliah matakuliah;
    private Dosen dosen;
    private int sks;
    private String namaKelas;
    private int maxMahasiswa;
    
    public Kelas (MataKuliah matakuliah,int sks, Dosen dosen) {
        this.matakuliah = matakuliah;
        this.sks = sks;
        this.dosen = dosen;
    }
    
    public void setDosen (Dosen D) {
       this.dosen = D;
    }
    public Dosen getDosen () {
        return dosen;
    }
    
    public void setMataKuliah (MataKuliah Mk) {
        this.matakuliah = Mk;
    }
    
    public MataKuliah getMataKuliah() {
        return matakuliah;
    }
    
}