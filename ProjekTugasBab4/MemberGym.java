/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjekTugasBab4;

import ProjekTugas.*;

/**
 *
 * @author Putra Anand Noor R
 */
public class MemberGym {
    private String idMember;
    private String nama;
    private String levelMembership;

    public MemberGym(String nama, String idMember, String levelMembership) {
        this.nama = nama;
        this.idMember = idMember;
        this.levelMembership = levelMembership;
    }
    // Setter (untuk mengisi data)
    public void setIdMember(String idMember) {
        this.idMember = idMember;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setLevelMembership(String levelMembership) {
        this.levelMembership = levelMembership;
    }

    // Getter (untuk mengambil data)
    public String getIdMember() {
        return idMember;
    }

    public String getNama() {
        return nama;
    }

    public String getLevelMembership() {
        return levelMembership;
    }
    
    public void upgradeMembership(String newLevel) {
        this.levelMembership = newLevel;
        System.out.println("Membership berhasil diupgrade ke level " + newLevel);
    }
   public String getMembershipInfo() {
        return "Informasi Membership:\n"
             + "Nama: " + nama + "\n"
             + "ID Membership: " + idMember + "\n"
             + "Level Membership: " + levelMembership;
        }
}
    

