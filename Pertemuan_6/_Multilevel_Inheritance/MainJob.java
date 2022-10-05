/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6._Multilevel_Inheritance;

/**
 *
 * @author hp
 */
public class MainJob {
    public static void main(String[] args){
        MartialArt mr = new MartialArt();
        mr.basicDamage = 11.7;
        mr.powerPunch = 8;
        mr.setDoubleHit(405.66);
        
        System.out.println("Basic Damage    : "+ mr.basicDamage);
        System.out.println("Power Punch     : "+ mr.powerPunch);
        System.out.println("Total Damage    : "+ mr.totalDamage());
    }
}
