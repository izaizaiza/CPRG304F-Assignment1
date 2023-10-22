/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;




public class Cylinder extends ThreeDShape{
    
    private double radius;
    private double height;
    
    
    // constuctors
    public Cylinder(double height, double radius){
        this.radius = radius;
        this.height = height;
    }
    
    public Cylinder(){}
    
    
    
    //methods
    
    public double getRadius(){
        // Double class has parseDouble that converts str to double
        //return Double.parseDouble(args[1]);
        return this.radius;
    }
    
    @Override
    public double getHeight(){
         // Double class has parseDouble that converts str to double
         //return Double.parseDouble(args[1]);
         return this.height;
     }
    
    @Override
    public double getBaseArea(){
        return Math.PI * this.radius *2;
    }
    
    @Override
    public double getVolume(){
        return Math.PI * this.radius *2 * this.height;
    }
}
