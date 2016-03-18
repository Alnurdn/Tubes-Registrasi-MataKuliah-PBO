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
public class MataKuliah {
    private String namaMK;
    private String jadwal;
    
    public MataKuliah (String namaMK, String jadwal) {
        this.namaMK = namaMK;
        this.jadwal = jadwal;
    }
    
    public void setNamaMK (String namaMK) {
        this.namaMK = namaMK;
    }
    
    public void setJadwal (String jadwal) {
        this.jadwal = jadwal;
    }
    
    public String getJadwal() {
        return jadwal;
    }
    
    public String getNamaMK() {
        return namaMK;
    }
}