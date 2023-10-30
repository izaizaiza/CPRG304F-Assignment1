
package shape;

/**
 *
 * @author izalu
 */
public class PentagonalPrism extends ThreeDShape {
    /**
     * The Prism class inherits some methods from ThreeDShape class
     * this handles properties for any of the prism shape
     */
    
    private double height;
    private double side;
    
    
    //constructors
    public PentagonalPrism(){}
    
    public PentagonalPrism(double height, double side){
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
        // use volume for pentagon prism
        double baseArea = 5*this.getSide()*2*Math.tan(54)*4; //not sure if this is correct?
        
        
        return baseArea;
    }
    
    @Override
    public double getVolume(){
        // use volume for pentagon prism
        double volume = this.getBaseArea()*this.getHeight();
        return volume;
        
    }
}
