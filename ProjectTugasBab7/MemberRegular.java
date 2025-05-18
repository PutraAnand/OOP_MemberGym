/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectTugasBab7;

import ProjektugasBab6.*;

/**
 *
 * @author Putra Anand Noor R
 */
public class MemberRegular extends MemberGym {
    private String trainer;

    public MemberRegular(String nama, String idMember, String levelMembership, String trainer) {
        super(nama, idMember, levelMembership);
        this.trainer = trainer;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    @Override
    public String getMembershipInfo() {
        return super.getMembershipInfo() + "\nTrainer: " + trainer;
    }
}
