/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author izalu
 */
public class OctagonalPrism extends ThreeDShape {
    /**
     * 
     */
    
    
    private double height;
    private double side;
    
    //constructors
    public OctagonalPrism(){}
    
    public OctagonalPrism(double height, double side){
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
        
        // use volume for octagon prism
        double baseArea = 2*(1 + Math.sqrt(2)*this.getSide()*2); //not sure if this is correct?
        return baseArea;
    }
    
    @Override
    public double getVolume(){
    // formula from assignment instructions
        // use volume for octagon prism
        double volume = this.getBaseArea()*this.getHeight()*4;
        return volume;
        
    }
    
}
