/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author dlg12
 */
public class EquilateralTrianglePrism extends ThreeDShape{
    
    private double height;
    private double side;
    
    
    //constructors
    public EquilateralTrianglePrism(){}
    
    public EquilateralTrianglePrism(double height, double side){
        this.height = height;
        this.side = side;
        
    }
    
    
    //methods
    
    public double getSide(){
        return this.side;
    }
    
    
    @Override
    public double getHeight(){
        return this.height;
    }
    
    @Override
    public double getBaseArea(){
        
        double baseArea = (Math.pow(this.getSide(), 2) * Math.sqrt(3)) / 4;
        return baseArea;
    }
    
    @Override
    public double getVolume(){
    // use volume for Equilateral Triangle Prism
        double volume = this.getBaseArea()*this.getHeight();
        return volume;
        
    }
    
}
