/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6._Single_Inheritance;

/**
 *
 * @author hp
 */
public class MainWeapon {
    public static void main(String[] args){
        Sword sw = new Sword();
        sw.basicAttack = 100.22;
        sw.setRadiance(45.7);
        
        System.out.println("Basic Attack    : "+ sw.basicAttack);
        System.out.println("Radiance        : "+ sw.getRadiance());
        System.out.println("Total Damage    : "+ sw.totalDamage());
    }
}
