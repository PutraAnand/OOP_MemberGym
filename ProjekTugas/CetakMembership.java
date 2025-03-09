/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjekTugas;

/**
 *
 * @author Putra Anand Noor R
 */
public class CetakMembership {
    public static void main(String[] args) {
        MemberGym mem = new MemberGym(); //Menginisialisasikan Class
        
        // Input data member
        mem.dataNama("Putra Anand Noor Rachmad");
        mem.dataIDMember("001");
        mem.dataLevelMembership("Silver");
        
        // Cetak kartu member
        System.out.println("\n==============================");
        System.out.println("        KARTU MEMBER GYM");
        System.out.println("==============================");
        System.out.println("Nama          : " + mem.cetakNama());
        System.out.println("ID Member     : " + mem.cetakIDMember());
        System.out.println("Membership    : " + mem.cetakLevelMembership());
        System.out.println("==============================");
        System.out.println("Terima kasih telah bergabung dengan gym kami!"); 
    }
    
}
