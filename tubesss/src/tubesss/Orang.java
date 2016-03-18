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
public abstract class Orang {
   private String nama;
   private Long id;
   
   public Orang (String nama, long id) {
       this.nama = nama;
       this.id = id;
   }
   
   public void setNama (String nama) {
       this.nama = nama;
   }
   
   public void setId (Long id) {
       this.id = id;
   }
   
   public Long getId () {
       return id;
   }
   
   public String getNama () {
       return nama;
   }
}