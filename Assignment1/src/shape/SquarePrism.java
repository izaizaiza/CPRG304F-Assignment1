/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author izalu
 */
public class SquarePrism extends ThreeDShape {
    /**
     * The Prism class inherits some methods from ThreeDShape class
     * this handles properties for any of the prism shape
     */
    
    private double height;
    private double side;
    
    
    //constructors
    public SquarePrism(){}
    
    public SquarePrism(double height, double side){
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
        // formular from assignment instructions
        
        double baseArea = this.getSide()*2; //not sure if this is correct?
        return baseArea;
    }
    
    @Override
    public double getVolume(){
    
        // use volume for triangle prism
        double volume = this.getBaseArea()*this.getHeight();
        return volume;
        
    }
    
}
