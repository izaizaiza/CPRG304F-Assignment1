
package shape;

import java.util.Comparator;


/**
 *
 * @author izalu
 */
public abstract class ThreeDShape implements Comparable<ThreeDShape>{
    
    // make the methods to get the height, volume and area be abstract because
    // it will be the basis or the common interface of ThreeDShape's subclasses
    
    public abstract double getHeight();
    public abstract double getBaseArea();
    public abstract double getVolume();
    
    
    // use compare method from Comparator to compare base area
    public static Comparator<ThreeDShape> baseAreaComparator = new Comparator<ThreeDShape>(){
    
        @Override
        public int compare(ThreeDShape threeD1, ThreeDShape threeD2){
            // the Double wrapper class and the compare is a static method
            // of the Double class.
            // it returns an int:
            // if arg1 is < arg2: returns -1
            // else if arg1 == arg2: returns 0
            // else if arg1 > arg2: returns 1
            return Double.compare(threeD1.getBaseArea(), threeD2.getBaseArea());
        }
    };
    
            
    // use compare method from Comparator to compare volume
    public static Comparator<ThreeDShape> volumeComparator = new Comparator<ThreeDShape>(){
    
        @Override
        public int compare(ThreeDShape threeD1, ThreeDShape threeD2){
            // the Double wrapper class and the compare is a static method
            // of the Double class.
            // it returns an int:
            // if arg1 is < arg2: returns -1
            // else if arg1 == arg2: returns 0
            // else if arg1 > arg2: returns 1
            return Double.compare(threeD1.getVolume(), threeD2.getVolume());
        }
    };
    
    
    // use compareTo method from Comparable to compare by height
    // since ThreeDShape class implements Comparable we can just create a method
    // that overrides the compareTo
    @Override
    public int compareTo(ThreeDShape anotherThreeD){
        return Double.compare(this.getHeight(), anotherThreeD.getHeight());
    }
    
    
} // end of ThreeDShape class
