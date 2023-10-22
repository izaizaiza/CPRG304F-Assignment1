
package shape;




public class Cylinder extends ThreeDShape{
    
    /**
    * The Cylinder class inherits ThreeDShape and
    * override the methods for getting the base area, volume and height
    * as computing the those are different from other 3D shapes
    */
    
    private double radius;
    private double height;
    
    
    // constuctors
    public Cylinder(double height, double radius){
        this.radius = radius;
        this.height = height;
    }
    
    public Cylinder(){}
    
    
    
    //methods
    
    public double getRadius(){
        // Double class has parseDouble that converts str to double
        //return Double.parseDouble(args[1]);
        return this.radius;
    }
    
    @Override
    public double getHeight(){
         // Double class has parseDouble that converts str to double
         //return Double.parseDouble(args[1]);
         return this.height;
     }
    
    @Override
    public double getBaseArea(){
        return Math.PI * this.radius *2;
    }
    
    @Override
    public double getVolume(){
        return Math.PI * this.radius *2 * this.height;
    }
}
