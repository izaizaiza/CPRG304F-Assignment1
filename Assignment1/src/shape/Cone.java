/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author izalu
 */
public class Cone extends ThreeDShape {
    
    private double radius;
    //private double volume;
    //private double baseArea;
    private double height;
    
    
    // constuctors
    public Cone(double radius, double height){
        this.radius = radius;
        this.height = height;
        
    }
    
    public Cone(){}
    
    
    
    //methods
    public double getRadius(){
        // Double class has parseDouble that converts str to double
        //return Double.parseDouble(args[1]);
        return radius;
    }
    public double getHeight(){
        // Double class has parseDouble that converts str to double
        //return Double.parseDouble(args[2]);
        return height;
    
    }
   
    public double getVolume(){
        return 13*Math.PI*getRadius()*2*getHeight();
    }
    
    public double getBaseArea(){
        return Math.PI*getRadius()*2;
    }
    
}
