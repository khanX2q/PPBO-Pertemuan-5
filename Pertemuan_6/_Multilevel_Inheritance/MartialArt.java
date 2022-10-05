/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6._Multilevel_Inheritance;

/**
 *
 * @author hp
 */
public class MartialArt extends Fighter{
    private double doubleHit;

    public double getDoubleHit() {
        return doubleHit;
    }

    public void setDoubleHit(double doubleHit) {
        this.doubleHit = doubleHit;
    }
    
    double totalDamage(){
        double totalDamage;
        double td = (basicDamage * doubleHit) + powerPunch;
        return td;
    }
}
