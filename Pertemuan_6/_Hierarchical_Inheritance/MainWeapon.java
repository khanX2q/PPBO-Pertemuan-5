/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6._Hierarchical_Inheritance;

/**
 *
 * @author hp
 */
public class MainWeapon {
    public static void main(String[] args){
        Sword sw = new Sword();
        sw.basicAttack =14.7;
        sw.setRadiance(15.3);
        
        System.out.println("*********Sword Properties*********");
        System.out.println("Basic Attack    : "+ sw.basicAttack);
        System.out.println("Radiance        : "+ sw.getRadiance());
        System.out.println("Total Damage    : "+ sw.totalDamage());
        System.out.println("==================================");
        
        System.out.println("");
        
        Spear sp = new Spear();
        sp.setAura(28);
        sp.basicAttack = 17.4;
        
        System.out.println("*********Spear Properties*********");
        System.out.println("Basic Attack    : "+ sp.basicAttack);
        System.out.println("Aura            : "+ sp.getAura());
        System.out.println("Spear Hit       : "+ sp.spearHit());
        System.out.println("==================================");
    }
}
