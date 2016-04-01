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
public class Dosen extends Orang {
    private String namaDosen;
    private int idDosen;
    
    public Dosen (String nama, int id) {
        super(nama,id);
    }

    public void setNamaDosen (String namaDosen) {
        this.namaDosen = namaDosen;
    }
    
    public void setIdDosen (int idDosen) {
        this.idDosen = idDosen;
    }
    
    public String getNamaDosen () {
        return namaDosen;
    }
    
    public int getIdDosen () {
        return idDosen;
    }
}