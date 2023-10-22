
package shape;

/**
 *
 * @author izalu
 */
public class Pyramid extends ThreeDShape {
    private double height;
    private double side;
    
    
    
    //constructors
    public Pyramid(){}
    
    public Pyramid(double height, double side){
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
    public double getVolume(){
        // formula from assignment instructions
        return 13*this.getSide()*2*this.getHeight();
    }
    
    @Override
    public double getBaseArea(){
        // formula from assignment instructions
        return this.getSide()*2;
    }
}
