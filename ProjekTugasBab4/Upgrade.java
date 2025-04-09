/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjekTugasBab4;
import ProjekTugasBab3.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Putra Anand Noor R
 */
public class Upgrade extends MemberGym {
    private List<String> riwayatUpgrade;

     public Upgrade(String nama, String idMember, String levelMembership) {
        super(nama, idMember, levelMembership);
        this.riwayatUpgrade = new ArrayList<>();
    }

    // Override method upgradeMembership
    @Override
    public void upgradeMembership(String newLevel) {
        String riwayat = getLevelMembership() + " -> " + newLevel;
        riwayatUpgrade.add(riwayat);

        // Panggil method parent
        super.upgradeMembership(newLevel);
    }

    // Tampilkan riwayat upgrade
    public void tampilkanRiwayatUpgrade() {
        System.out.println("Riwayat Upgrade Membership untuk " + getNama() + ":");
        for (String riwayat : riwayatUpgrade) {
            System.out.println(riwayat);
        }
    }

    public List<String> getRiwayatUpgrade() {
        return riwayatUpgrade;
    }
}
