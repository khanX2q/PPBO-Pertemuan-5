/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6._Multiple_Inheritance;

/**
 *
 * @author hp
 */
public class MainSpecialSkill {
    public static void main(String[] args){
        SpecialSkill sk = new SpecialSkill(){
            @Override
            public void namaSkill(){
                System.out.println("Skill One Hit Skill");
            }
            
            @Override
            public void namaQuest(){
                System.out.println("Super Hard Quest");
            }
            
            @Override
            public void namaTrigger(){
                System.out.println("Jam 12 Siang");
            }
        };
        
        sk.namaSkill();
        sk.namaQuest();
        sk.namaTrigger();
    }
}
