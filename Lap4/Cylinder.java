/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap4;

/**
 *
 * @author Admin
 */
public class Cylinder extends Circle {
    public double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight (double vHeight ){
        this.height = height;
    }
    public double getVolume(){
        return getArea() * height;
    }
}
 