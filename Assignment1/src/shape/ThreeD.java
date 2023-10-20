package shape;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Comparator;
package assignment1;

public abstract class ThreeD implements Comparable<ThreeD>{
    //field
    double height;
    double volume;
    double area;
    
    String shape;
    
    @Override
    public int compareTo(ThreeD anotherThreeD){
        if(this.height == anotherThreeD.height){
            System.out.printf("The two 3D objects have the same height of %.2f%n", this.height);
            return 0;
        }
        else if (this.height < anotherThreeD.height){
            System.out.printf("""
                              The shape's height is less than the other shape's height 
                              this shape's height is %.2f%n 
                              while the other shape's height is %.2f%n""", this.height, anotherThreeD.height);
            return -1;
        }
        else {
            System.out.printf("""
                              The shape's height is greater than the other shape's height 
                              this shape's height is %.2f%n 
                              while the other shape's height is %.2f%n""", this.height, anotherThreeD.height);
            return 1;
        }
        
       
        @Override
        public int compare(ThreeD t1, ThreeD t2) {
            switch (1) {
            case 1 -> quickSort(sortArr, 0, sortArr.length - 1);
            case 2 -> bubbleSort(sortArr);
            case 3 -> insertSort(sortArr);
            case 4 -> selectSort(sortArr);
        }
        }
    
        
}
}
