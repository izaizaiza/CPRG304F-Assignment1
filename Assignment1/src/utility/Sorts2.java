
package utility;

import shape.ThreeDShape;
import application.ThreeDShapeComparator;

/**
 *
 * @author dlg12
 */
public class Sorts2 {
    
    /**
     * this class holds all the sorting algorithms used to sort a list of ThreeDShape
     * in the Assignment the shapes are to be sorted from largest to smallest (in descending order)
     */
    
    /**
     * @param shapes an array of ThreeDShape objects
     * @param comparisonType h (height) or v (volume) or a (base area)
     * 
     */
    //Bubble Sort but descending order
    public static void bubbleSort(ThreeDShape[] shapes, String comparisonType){
    
        /**
         * bubble sort algorithm:
         * 1. Start with an unsorted array. Go through the array and compare the elements by pairs.
         *    Let's call going through the list as a round. 
         * 2. compare the first two elements.
         *    If the 1st element is smaller than the second, swap them so that the bigger element is the first element.
         *    If the second is smaller then do nothing.
         * 3. Repeat the process of 2. to the next elements until reached the element before the last one.
         * 4. when there no swapping occurred during a round then the array is sorted or when there were array.length - 1 round done.
         * 
         */
        
        if (comparisonType.equalsIgnoreCase("h")){
            int n = shapes.length; // size of shapes array
            boolean isSwapped; // for tracking if there is a swapping that occurred during a round

            for(int i=0; i < n - 1; i++){
                isSwapped = false;

                for (int j=0; j < n - 1 - i; j++){
                    //swap if height of first element is smaller than second
                    if(shapes[j].compareTo(shapes[j+1]) < 0){
                        // swap
                        ThreeDShape tempShapeHolder = shapes[j];
                        shapes[j] = shapes[j+1];
                        shapes[j+1] = tempShapeHolder;
                        isSwapped = true; // so a swap happened this round;
                    }
                }
                
                // if no swapping occured during the current round a.k.a "i"
                if (!isSwapped){
                    break;
                }
            }
        }
        else if (comparisonType.equalsIgnoreCase("v") || 
                comparisonType.equalsIgnoreCase("a")){
            int n = shapes.length; // size of shapes array
            boolean isSwapped; // for tracking if there is a swapping that occurred during a round
            // initialize custom comparator
            ThreeDShapeComparator comparator = new ThreeDShapeComparator(comparisonType);
            for(int i=0; i < n - 1; i++){
                
                isSwapped = false;
                for (int j=0; j < n - 1 - i; j++){
                    //swap if height of first element is smaller than second
                    if(comparator.compare(shapes[j], shapes[j+1]) < 0){
                        // swap
                        ThreeDShape tempShapeHolder = shapes[j];
                        shapes[j] = shapes[j+1];
                        shapes[j+1] = tempShapeHolder;
                        isSwapped = true; // so a swap happened this round;
                    }
                }
                
                // if no swapping occured during the current round a.k.a "i"
                if (!isSwapped){
                    break;
                }
            }
        } 
    }
    
    
    
    // Selection Sort
    public static void selectionSort(ThreeDShape[] shapes, String comparisonType){
        
        /**
         * selection sort algorithm in descending order:
         * 1. Instead of selecting the minimum value in the array, select the maximum value.
         *    starting with an unsorted array, make an empty sorted portion.
         *    For this round, find the maximum element in the array and put it as the first element.
         * 2. start at the beginning of the list, compare first to second, whichever is bigger,
         *    assign it as the current maximum value.
         * 3. Then once the round is done, swap the value at the current i index to the max value, before doing the next round.
         * 4. Repeat the process until the second to last element is reached and checked the next two which is the bigger value.
         * 
         */
        
        // if comparisonType = "h"
        if(comparisonType.equalsIgnoreCase("h")){
            int n = shapes.length;
            for (int i=0; i < n-1; i++){
                // just assign the first element as the current maxIndex and maxValue;
                int maxIndex = i;
                double maxValue = shapes[i].getHeight();

                for(int j= i+1; j < n; j++){
                    //compare the height of the threeDShapes using compareTo
                    if(shapes[j].getHeight() > maxValue){
                        maxIndex = j;
                    }
                }

                //swap the maxValue element with the element we started with
                ThreeDShape tempShapeHolder = shapes[i];
                shapes[i] = shapes[maxIndex];
                shapes[maxIndex] = tempShapeHolder;
            }
        }
        else if(comparisonType.equalsIgnoreCase("v") || 
                comparisonType.equalsIgnoreCase("a")){
            
            // initialize custom comparator
            ThreeDShapeComparator comparator = new ThreeDShapeComparator(comparisonType);
            
            int n = shapes.length;
            for (int i=0; i < n-1; i++){
                // just assign the first element as the current maxIndex and maxValue;
                int maxIndex = i;
                double maxValue = shapes[i].getHeight();

                for(int j= i+1; j < n; j++){
                    //compare the v or a of the threeDShapes using compare
                    // if v or a of shape[j] > shapes[j+1] then the greater value is the first element
                    if(comparator.compare(shapes[j], shapes[j+1]) > 0){
                        maxIndex = j;
                    }
                }

                //swap the maxValue element with the element we started with
                ThreeDShape tempShapeHolder = shapes[i];
                shapes[i] = shapes[maxIndex];
                shapes[maxIndex] = tempShapeHolder;
            }
        }
        
        
    
    
    }
    
    
    // Insertion Sort
    public static void insertionSort(ThreeDShape[] shapes, String comparisonType){
        
        /**
         * insertion sort algorithm:
         * 1.
         * 2.
         * 3.
         * 
         */
    
    
    }
    
    
    // Quick Sort
    public static void quickSort(ThreeDShape[] shapes, String comparisonType){
        
        /**
         * quick sort algorithm:
         * 1.
         * 2.
         * 3.
         * 
         */
    
    
    }
    
    
    
    // Merge Sort
    public static void mergeSort(ThreeDShape[] shapes, String comparisonType){
        
        /**
         * selection sort algorithm:
         * 1.
         * 2.
         * 3.
         * 
         */
    
    
    }
    
    
    
    // Fast Sort
    public static void fastSort(ThreeDShape[] shapes, String comparisonType){
        
        /**
         * fast sort algorithm:
         * 1.
         * 2.
         * 3.
         * 
         */
        
        
        
    
    
    }
    
    
    
}// end of Sorts class
