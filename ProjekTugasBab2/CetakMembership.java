/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjekTugasBab2;

import java.util.Scanner;

/**
 *
 * @author Putra Anand Noor R
 */
public class CetakMembership {
    
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek GymMembership dengan data awal
        GymMembership member1 = new GymMembership("John Doe", "ID12345", "Silver");

        while (true) {
            System.out.println("\n=== Gym Membeship Menu ===");
            System.out.println("1. Lihat Membership");
            System.out.println("2. Upgrade Membership");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (choice) {
                case 1:
                    member1.displayMembership();
                    break;
                case 2:
                    System.out.print("Masukkan level baru (Silver/Gold/Platinum): ");
                    String newLevel = scanner.nextLine();
                    member1.upgradeMembership(newLevel);
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan layanan Gym Center!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
   }
