/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

/**
 *
 * @author dlg12
 */
public class Sorts {
   
    public Sorts(){} 
    public static void quickSort(int[] arr, int low, int high) {
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

    public static void bubbleSort(int[] arr) {
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

    public static void selectSort(int[] arr) {
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

    public static void insertSort(int[] arr) {
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
    
    //Merge sort
    
    //create a merge function that merges list one and list two
    
    //one more sorting
    
}
