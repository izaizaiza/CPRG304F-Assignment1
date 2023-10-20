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
    private double height;
    
    
    // constuctors
    public Cone(double height, double radius){
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
    
    @Override
    public double getHeight(){
        // Double class has parseDouble that converts str to double
        // from: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Double.html
        //return Double.parseDouble(args[2]);
        return height;
    
    }
    
   @Override
    public double getVolume(){
        return 13*Math.PI*getRadius()*2*getHeight();
    }
    
    @Override
    public double getBaseArea(){
        return Math.PI*getRadius()*2;
    }
    
}
