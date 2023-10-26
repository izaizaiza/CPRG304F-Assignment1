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
        return radius;
    }
    
    @Override
    public double getHeight(){
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
