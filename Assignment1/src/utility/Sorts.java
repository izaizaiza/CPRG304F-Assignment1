/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;
import shape.ThreeDShape;


/**
 *
 * @author dlg12
 */
public class Sorts<T extends Comparable>{
   
    // constructor, maybe we do not need this
    public Sorts(){} 
    
    // quick sort
    public void quickSort(T[] arr, T low, T high) {
        int p, i, j, temp;
        if (low >= high) {
            return;
        }
        p = arr[low];
        i = low;
        j = high;
        while (i < j) {
            while (arr[j] >= p && i < j) {
                j--;
            }
            while (arr[i] <= p && i < j) {
                i++;
            }

            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        arr[low] = arr[i];
        arr[i] = p;
        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);
    }
    
    //bubble sort
    public void bubbleSort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
    //seclect sort
    public void selectSort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    // insertSort    
    public void insertSort(T[] arr) {
        int i, j, k;

        for (i = 1; i < arr.length; i++) {

            for (j = i - 1; j >= 0; j--)
                if (arr[j] < arr[i])
                    break;

            if (j != i - 1) {
                int temp = arr[i];
                for (k = i - 1; k > j; k--)
                    arr[k + 1] = arr[k];
                arr[k + 1] = temp;
                
            }
        }
    }
    
    // Merge sort
    // First create a merge function that merges two arrays of Shape through
    // sorting by height
    public T[] mergeByHeight(T[] array1, T[] array2){
        T[] mergedArray;
        
        for (int i=0; i < array1.length; i++){
            for (int j=0; j < array2.length; j++){
                // compare the two array's object by height
                
                }
            }
        }
        
        return mergedArray; 
    }
    
    
    
    //one more sorting
    
} //end of Sorts Class
