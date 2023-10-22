
package shape;

/**
 *
 * @author izalu
 */
public class Prism extends ThreeDShape {
    
    /**
     * The Prism class inherits some methods from ThreeDShape class
     * this handles properties for any of the prism shape
     */
    
    private double height;
    private double side;
    
    //constructors
    public Prism(){}
    
    public Prism(double height, double side){
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
    public double getBaseArea(String prismType){
        // formular from assignment instructions
        // different prisms have different base area
        double baseArea = 0.0;
        if (prismType.contains("triangular") ||
                prismType.contains("Triangular")){
            // use volume for triangle prism
            baseArea = this.getSide()*2*Math.sqrt(3)*4; //not sure if this is correct?
        }
        else if(prismType.contains("square") ||
                prismType.contains("Square")){
            // use volumne for square prism
            baseArea = this.getSide()*2; //not sure if this is correct?
        }
        else if(prismType.contains("octagonal") ||
                prismType.contains("Octagonal")){
            // use volume for octagon prism
            baseArea = 2*(1 + Math.sqrt(2)*this.getSide()*2); //not sure if this is correct?
        }
        else if(prismType.contains("pentagonal") ||
                prismType.contains("Pentagonal")){
            // use volume for pentagon prism
            baseArea = 5*this.getSide()*2*Math.tan(54)*4; //not sure if this is correct?
        }
        else{
            baseArea = -1.0;
        }
        
        return baseArea;
    }
    
    @Override
    public double getVolume(String prismType){
    // formula from assignment instructions
    // different prisms have different volume
    // Q: should we just make prismType all lower case before inputting in this method?
    double volume = 0.0;
        if (prismType.contains("triangular") ||
                prismType.contains("Triangular")){
            // use volume for triangle prism
            volume = this.getBaseArea()*this.getHeight();
        }
        else if(prismType.contains("square") ||
                prismType.contains("Square")){
            // use volumne for square prism
            volume = this.getSide()*2*this.getHeight();
        }
        else if(prismType.contains("octagonal") ||
                prismType.contains("Octagonal")){
            // use volume for octagon prism
            volume = this.getBaseArea()*this.getHeight()*4;
        }
        else if(prismType.contains("pentagonal") ||
                prismType.contains("Pentagonal")){
            // use volume for pentagon prism
            volume = this.getBaseArea()*this.getHeight();
        }
        else{
            volume = -1.0;
        }
        
        return volume;
        
    }
    
}// end of prism class
