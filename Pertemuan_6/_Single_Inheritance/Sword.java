/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6._Single_Inheritance;

/**
 *
 * @author hp
 */
public class Sword extends Weapon{
    private double radiance;

    public double getRadiance() {
        return radiance;
    }

    public void setRadiance(double radiance) {
        this.radiance = radiance;
    }
    
    public double totalDamage(){
        double totalDamage;
        double td = (basicAttack * radiance);
        return td;
    }
}
