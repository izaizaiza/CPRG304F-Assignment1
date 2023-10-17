/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment1;

import static assignment1.ArraySorter.bubbleSort;
import java.util.Scanner;

/**
 *
 * @author dlg12
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] sortArr = {1, 9, 3, 35, 17, 2, 31, 4};
        //ArraySorter arraysorter = new ArraySorter();

        System.out.println("Please choose a sort algorithm");
        System.out.println("1. quickSort");
        System.out.println("2. bubbleSort");
        System.out.println("3. insertSort");
        System.out.println("4. selectSort");
        int index = new Scanner(System.in).nextInt();
        switch (index) {
            case 1 -> ArraySorter.quickSort(sortArr, 0, sortArr.length - 1);
            case 2 -> ArraySorter.bubbleSort(sortArr);
            case 3 -> ArraySorter.insertSort(sortArr);
            case 4 -> ArraySorter.selectSort(sortArr);
        }
        System.out.println("sorted:");
        for (int j : sortArr) {
            System.out.println(j);
        }
        // TODO code application logic here
    }
    
}
