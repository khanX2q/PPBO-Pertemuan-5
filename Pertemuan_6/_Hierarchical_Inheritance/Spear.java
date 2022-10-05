/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6._Hierarchical_Inheritance;


/**
 *
 * @author hp
 */
public class Spear extends Weapon{
    private int aura;

    public int getAura() {
        return aura;
    }

    public void setAura(int aura) {
        this.aura = aura;
    }
    
    
    public double spearHit(){
        double spearHit;
        double sh = basicAttack + aura;
        return sh;
    }
}
