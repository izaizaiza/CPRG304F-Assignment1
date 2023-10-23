/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author izalu
 */
public class TriangularPrism extends ThreeDShape {
    /**
     * The Prism class inherits some methods from ThreeDShape class
     * this handles properties for any of the prism shape
     */
    
    private double height;
    private double side;
    
    //constructors
    public TriangularPrism(){}
    
    public TriangularPrism(double height, double side){
        this.height = height;
        this.side = height;
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
        // formula from assignment instructions
        
        double baseArea = this.getSide()*2*Math.sqrt(3)*4; //not sure if this is correct?
        return baseArea;
        
    }
    
    @Override
    public double getVolume(){
    // formula from assignment instructions
    double volume = this.getBaseArea()*this.getHeight(); //double check
    return volume;
    }
}
