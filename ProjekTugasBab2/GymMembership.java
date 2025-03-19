/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjekTugasBab2;

/**
 *
 * @author Putra Anand Noor R
 */
  
public class GymMembership {
        private String nama;
    private String idMembership;
    private String levelMembership;

    // Konstruktor
    public GymMembership(String nama, String idMembership, String levelMembership) {
        this.nama = "Putra";
        this.idMembership = "UID001";
        this.levelMembership = "Silver";
    }
    public void displayMembership() {
        System.out.println("\nInformasi Membership:");
        System.out.println("Nama: " + nama);
        System.out.println("ID Membership: " + idMembership);
        System.out.println("Level Membership: " + levelMembership);
    }
    
     public void upgradeMembership(String newLevel) {
        this.levelMembership = newLevel;
        System.out.println("Membership berhasil diupgrade ke level " + newLevel);
    }
}
