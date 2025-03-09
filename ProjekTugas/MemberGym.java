/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjekTugas;

/**
 *
 * @author Putra Anand Noor R
 */
public class MemberGym {
    String idMember, Nama, jenisKelamin, levelMembership, alamat;// Deklarasi Object
    
    //Deklarasi Method
    void dataIDMember(String idMember){
        this.idMember = idMember;
    }    
    void dataNama(String nama){
        this.Nama = nama;
    }

    void dataLevelMembership(String levelMembership){
        this.levelMembership = levelMembership;
    }

    
    String cetakIDMember(){
        return idMember;
    }
    String cetakNama(){
        return Nama;
    }
   
    String cetakLevelMembership(){
        return levelMembership;
    }
}
    

