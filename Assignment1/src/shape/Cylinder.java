/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;
import ThreeD.*;



public class Cylinder {
    public double getRadius(){
        // Double class has parseDouble that converts str to double
        //return Double.parseDouble(args[1]);
        return radius;
    }
   public double getHeight(){
        // Double class has parseDouble that converts str to double
        //return Double.parseDouble(args[1]);
        return height;
    }
    public double baseArea(){
    return Math.PI * this.radius *2;
    }
    public double volume(){
        return Math.PI * this.radius *2 * this.height;
    }
}
