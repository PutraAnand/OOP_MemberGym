/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjekTugasBab4;

import ProjekTugasBab3.*;

/**
 *
 * @author Putra Anand Noor R
 */
class Trainer extends MemberGym {
    private String trainer; // gunakan camelCase

    public Trainer(String name, String id, String membershipLevel, String trainer) {
        super(name, id, membershipLevel);
        this.trainer = trainer;
    }

    // Getter & Setter untuk field trainer
    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    // Menampilkan info lengkap member + trainer
    public String getMembershipInfo() {
        return super.getMembershipInfo() + "\nTrainer Pribadi: " + trainer;
    }
}