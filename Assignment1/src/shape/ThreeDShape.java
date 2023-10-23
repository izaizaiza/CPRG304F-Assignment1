
package shape;




/**
 *
 * @author izalu
 */
public abstract class ThreeDShape implements Comparable<ThreeDShape>{
    /*
    * abstract class as the basis of all the different shapes
    * includes instance variables for common fields like
    * height, volume and base area
    */
    
    
    public abstract double getHeight();
    public abstract double getBaseArea();
    public abstract double getVolume();
    
    
    
    
    
    // use compareTo method from Comparable to compare by height
    // since ThreeDShape class implements Comparable we can just create a method
    // that overrides the compareTo
    @Override
    public int compareTo(ThreeDShape anotherThreeD){
        return Double.compare(this.getHeight(), anotherThreeD.getHeight());
    }
    
    
} // end of ThreeDShape class
