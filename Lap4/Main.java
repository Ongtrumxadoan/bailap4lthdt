/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap4;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
      Cylinder lopcon = new Cylinder(4,"den", 4);
      
      System.out.println("Ban kinh la: "+lopcon.radius+"\nColor la: "+lopcon.color+"\nHeight la: "+lopcon.height); 
      System.out.println("Dien tich la: "+lopcon.getArea()+"\nChu vi la:"+lopcon.getVolume());
 
     
    }
    
}
