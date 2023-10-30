
package utility;

import shape.ThreeDShape;
import application.ThreeDShapeComparator;

/**
 *
 * @author dlg12, izalu
 */
public class Sorts2 {
    
    /**
     * this class holds all the sorting algorithms used to sort a list of ThreeDShape
     * in the Assignment the shapes are to be sorted from largest to smallest (in descending order)
     */
    
    
    public Sorts2(){};
    
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
                //double maxValue = shapes[i].getHeight();

                for(int j= i+1; j < n; j++){
                    //compare the height of the threeDShapes using compareTo
                    if(shapes[j].compareTo(shapes[i])<0){
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
         * 1. begin at index 1 to examine the value to the left.
         * 2. place the value of index 1 at a temp var.
         * 3. compare: if value of index to the left is less than temp var value, move the value of index to the right. (recall we are sorting in descending order)
         * 4. if the value of index in the left is no longer less than temp var value, we stop and insert the temp var value to the "empty" index. 
         * 4. once we run out of values to compare with on the left of that index. we move the pointer 1 to the right and repeat the process
         * Notice that the array to be compared get smaller; as we go through the array, step by step the values in the left is getting sorted.
         * 
         */
        
        // compare either by height, base area or volume
        
        if(comparisonType.equalsIgnoreCase("h")){
            int n = shapes.length;
            for (int i=1; i< n; i++){
                ThreeDShape tempShapeHolder = shapes[i]; // store thre first element to be inserted.
                //compare height so use compareTo
                // we are only shifting the values to the right if they are less than the element to be inserted 
                // and while we go from the current index to 0 (the first) element
                int j = i;
                while(j > 0 && shapes[j-1].compareTo(tempShapeHolder) < 0){
                    shapes[j] = shapes[j-1];
                    j--; // keep going left until tempShapeHolder's height is no longer less then the current shape
                }
                // when the while condition is no longer true; i.e., we reached the point where there no value that is less and to be shifted to th right
                // insert the value of tempShapeHolder to the current index.
                shapes[j] = tempShapeHolder;
                }
                
        }
        
        else if (comparisonType.equalsIgnoreCase("v") || comparisonType.equalsIgnoreCase("a")){
            //comapre by volume or base area so use compare from ThreeDShapeComparator
            ThreeDShapeComparator comparator = new ThreeDShapeComparator(comparisonType);
            int n = shapes.length;

            //same as above
            for(int i=1; i<n; i++){
                ThreeDShape tempShapeHolder = shapes[i];
                int j=i;
                while(j>0 && comparator.compare(shapes[j-1], tempShapeHolder) < 0){
                    shapes[j] = shapes[j-1];
                    j--;
                }
                shapes[j] = tempShapeHolder;
            }

        }
        
        
    }
        
        
    
    
    
    
    
    // Quick Sort
    /**
     * 
     * @param shapes - array of ThreeDShape objects to be sorted
     * @param comparisonType - string specifying whether to sort by height, volume or base area
     * @param low - index of the first element in the current subarray
     * @param high -index of the last element in the current subarray
     */
    public static void quickSort(ThreeDShape[] shapes, String comparisonType, int low, int high){
        
        /**
         * quick sort algorithm:
         * 1. start with a pivot element; let's choose the low element initially -> shape pivot
         * 2. have two pointers that start at low and high
         * 3. split the array
         * 4. while pointer that's initially "low" is less than pointer high,
         * move pointer high to the left until the current shape its pointing  is less than or equal to the shape pivot
         * move pointer low to the right until the current shape its pointing is greater than or equal to the shape pivot
         * 5. swap the pivot element / shape pivot with the shape pointer low is on to place the pivot
         * 6. then repeat the process until the entire array is sorted.
         */
        
        int p = low; //pivot
        int i = low; //pointer 1
        int j = high; // pointer 2
        ThreeDShape tempShapeHolder;


        //compare either by height,volume or area
        if(comparisonType.equalsIgnoreCase("h")){
            //sort by height, in descending order
            while(i<j){
                while(i < high && shapes[j].compareTo(shapes[p]) <=0){
                    j--;
                }
                while(i < j && shapes[i].compareTo(shapes[p]) >=0){
                    i++;
                }
                
                tempShapeHolder = shapes[j];
                shapes[j] = shapes[i];
                shapes[i] = tempShapeHolder;
                
                quickSort(shapes, comparisonType, low, i-1); // sort the half that is left of i
                quickSort(shapes, comparisonType, i+1, high); // sort the half that right of i 
            }
            
            
        }
        else if(comparisonType.equalsIgnoreCase("v") || comparisonType.equalsIgnoreCase("a")){
            //sort by volume or base area in descending order
            ThreeDShapeComparator comparator = new ThreeDShapeComparator(comparisonType);
            while(i<j){
                while(i < high && comparator.compare(shapes[j], shapes[p]) <=0){
                    j--;
                }
                while(i < j && comparator.compare(shapes[i],shapes[p])>=0){
                    i++;
                }
                
                tempShapeHolder = shapes[j];
                shapes[j] = shapes[i];
                shapes[i] = tempShapeHolder;
                
                quickSort(shapes, comparisonType, low, i-1); // sort the half that is left of i
                quickSort(shapes, comparisonType, i+1, high); // sort the half that right of i 
            }
            
        }
    
    
    }
    
    
    
    
    
    // Merge Sort
    public static void mergeSort(ThreeDShape[] shapes, String comparisonType){
        
        /**
         * merge sort algorithm:
         * 1. assume that the array has more than 1 element.
         * 
         * // put this in a helper method
         * 2. divide the sorted array into two halves by finding the middle point: mid = (low + high)/2
         * where low is the starting index and high is the last index
         * 3. apply the split again until the left and right arrays cannot be divided anymore.
         * // put this in another helper method?
         * 4. to merge we initialize two pointers: one for  the left and one for the right array.
         * 5. compare the elements pointed by the pointers. whichever is larger, take it and place in the result array (descending order)
         * keep comparing the elements in the sub arrays until all are compared. add the last remaining to the array.
         * 
         */
    
    
    }
    
    //helper function
    private static void mergeSort(ThreeDShape[] shapes, String comparisonType, int low, int high){
        
        if (low < high){
            int mid = (low + high) /2 ;
            
            //recursively sort the sub array into more subarrays
            mergeSort(shapes, comparisonType,low, mid);
            mergeSort(shapes, comparisonType,mid + 1, high);
            
            //merge the sorted halves in descending order
            merge(shapes,comparisonType, low, mid, high);
        
        }
    
    }
    
    // helper function merge in descending order
    private static void merge(ThreeDShape[] shapes, String comparisonType, int low, int mid, int high){
        ThreeDShape[] tempShapeArray = new ThreeDShape[high-low+1];
        
        //pointers
        int i = low; //left pointer at the start of left array
        int j = mid + 1; // right pointer at the start of right array
        int k = 0;
        
        boolean condition=false;
        
        if(comparisonType.equalsIgnoreCase("h")){
            // use compareTo
            condition = shapes[i].compareTo(shapes[j]) >= 0;
            
        }
        else if (comparisonType.equalsIgnoreCase("v") || comparisonType.equalsIgnoreCase("a")){
            //use compare
            ThreeDShapeComparator comparator = new ThreeDShapeComparator(comparisonType);
            condition = comparator.compare(shapes[i], shapes[j]) >= 0;
            
        }
        
        while (i <=mid && j <=high){
            if(condition){
                tempShapeArray[k] = shapes[i];
                i++;
            }
            else{
                tempShapeArray[k] = shapes[j];
                j++;
            }
            k++;
        }
        
        
        
        while( i <= mid){
            tempShapeArray[k] = shapes[i];
            i++;
            k++;
        }
        
        while(j <=high){
            tempShapeArray[k] = shapes[j];
            j++;
            k++;
        }
        
        //copy sorted eles back to the org array
        for (k = 0; k < tempShapeArray.length; k++){
            shapes[low + k] = tempShapeArray[k];
        }
    }
    
    
    
    /**
     * heapSort
     * @param shapes
     * @param comparisonType
     */
    public void heapSort(ThreeDShape[] shapes, String comparisonType) {
        int n = shapes.length;

        // Constructing a Maximum Heap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(shapes, n, i, comparisonType);

        // Take out the biggest number one by one, then rearrange the heap.
        for (int i = n - 1; i > 0; i--) {
            ThreeDShape temp = shapes[0];
            shapes[0] = shapes[i];
            shapes[i] = temp;

            heapify(shapes, i, 0, comparisonType);
        }
    }

    private void heapify(ThreeDShape[] shapes, int n, int i, String comparisonType) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (comparisonType.equals("h")) {
            if (left < n && shapes[left].compareTo(shapes[largest]) > 0)
                largest = left;
            if (right < n && shapes[right].compareTo(shapes[largest]) > 0)
                largest = right;
        } else {
            double largestValue = getValue(shapes[largest], comparisonType);
            if (left < n && getValue(shapes[left], comparisonType) > largestValue)
                largest = left;
            if (right < n && getValue(shapes[right], comparisonType) > largestValue)
                largest = right;
        }

        if (largest != i) {
            ThreeDShape swap = shapes[i];
            shapes[i] = shapes[largest];
            shapes[largest] = swap;

            heapify(shapes, n, largest, comparisonType);
        }
    }

    private double getValue(ThreeDShape shape, String comparisonType) {
        if (comparisonType.equals("v")) {
            return shape.getVolume();
        } else {
            return shape.getBaseArea();
        }
    }
    
}// end of Sorts class
