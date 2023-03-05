/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap4;

/**
 *
 * @author Admin
 */
public class Circle {
    public double radius;
    public String color ;
    
    public Circle(double radius, String color){
        this.radius = radius ;
        this.color = color ;
    }

    Circle() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //getter 
    public double getRadius(){
        return this.radius;
    }
    //setter 
    public void setRadius(double vradius){
        this.radius = vradius;
    }
    //getter
    public String getColor (){
        return this.color;
    }
    //setter
    public void setColor(String vColor){
        this.color = vColor;
    }
    public double getArea(){
        return radius*radius*3.14;
    }
    public String toString(){
        return "ban kinh la: "+radius+"color la: "+color+"Dien tich la: "+getArea();
    }
}
