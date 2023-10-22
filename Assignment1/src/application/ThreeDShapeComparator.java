
package application;

import java.util.Comparator;
import shape.ThreeDShape;

/**
 *
 * @author izalu
 */


public class ThreeDShapeComparator implements Comparator<ThreeDShape>{
    /**
     * this class implements the Comparator interface to allow comparing
     * three shapes based on different criteria: base area, volume
     *
     */
    
    private String comparisonType;
    
    
    // constructor
    public ThreeDShapeComparator(String comparisonType){
        this.comparisonType = comparisonType;
    }
    
    
    //override the compare method
    @Override
    public int compare(ThreeDShape threeD1, ThreeDShape threeD2){
        if(comparisonType.equalsIgnoreCase("a")){
            //compare by base area
            
            // the Double wrapper class and the compare is a static method
            // of the Double class. 
            //src: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Double.html
            // it returns an int:
            // if threeD1 is < threeD2: returns -1
            // else if threeD1 == threeD2: returns 0
            // else if threeD1 > threeD2: returns 1
            return Double.compare(threeD1.getBaseArea(), threeD2.getBaseArea());
        }
        else if (comparisonType.equalsIgnoreCase("v")){
            // compare by volumne
            
            return Double.compare(threeD1.getVolume(), threeD2.getVolume());
        }
        else{
            throw new IllegalArgumentException("Invalid comparison type: " + comparisonType);
        }
        
    }
    
}
