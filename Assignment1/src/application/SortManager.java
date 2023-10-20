/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;
import shape.ThreeD;

/**
 *
 * @author izalu
 * This class is responsible for directing what is to be done given the args
 * in the command line
 */
public class SortManager {
    
    // file name
    
    private String fileName; // name of the file
    private char compareType; // 'v'(volume) or 'h'(height), or 'a'(base area)
    private char sortType; // 'b' (bubble sort) or 's' (selection), or 'i' (insertion)
    // or 'm' (merge) or 'q' (quicksort) or z (some other sorting algo)
    
    
    
    
    /*
    * this method will take the arguments and sort and compare the file
    */
    public SortManager(String[] args){
        
        // for recognizing the fileName args
        if(args[0].toLowerCase().startsWith("-f") ||
                args[0].toLowerCase().startsWith("-F")){
            fileName = args[0].substring(2);    
        }
        else if(args[1].toLowerCase().startsWith("-f") ||
                args[1].toLowerCase().startsWith("-F")){
            fileName = args[1].substring(2);
        }
        else if(args[2].toLowerCase().startsWith("-f") ||
                args[2].toLowerCase().startsWith("-F")){
            fileName = args[2].substring(2);
        }
        
        // for recognizing the compareType args: either volume (v),
        // height (h), or base area (a)
        if(args[0].toLowerCase().startsWith("-t") ||
                args[0].toLowerCase().startsWith("-T")){
            fileName = args[0].substring(2);    
        }
        else if(args[1].toLowerCase().startsWith("-t") ||
                args[1].toLowerCase().startsWith("-T")){
            fileName = args[1].substring(2);
        }
        else if(args[2].toLowerCase().startsWith("-t") ||
                args[2].toLowerCase().startsWith("-T")){
            fileName = args[2].substring(2);
        }
        
        // for recognizing the sortType args: 'b' or 's' or 'i' or 'm' or 'q' or
        // 'z'
        if(args[0].toLowerCase().startsWith("-s")){
            fileName = args[0].substring(2);    
        }
        else if(args[1].toLowerCase().startsWith("-s")){
            fileName = args[1].substring(2);
        }
        else if(args[2].toLowerCase().startsWith("-s")){
            fileName = args[2].substring(2);
        }
        
        //fillThreeDArray();
        //sortThreeD();
        
        
    }// end of SortManager method
    
    
    // method to populate the ThreeD Array
    private void fillThreeDArray(){
        // read from data file and populate the shapes array
        //1. new instance of the ThreeD
        //threeD = new ThreeD[//first value from file];
        
    }
    
    
    // method to sort the ThreeD array
    private void sortThreeD(){
        if (sortType== 'b' || sortType== 'B'){
            // sort the file by bubble sort
        }
        else if (sortType== 's' || sortType== 'S'){
            // sort the file by selection sort
        }
        else if (sortType== 'i' || sortType== 'I'){
            // sort the file by insertion sort
        }
        else if (sortType== 'm' || sortType== 'M'){
            // sort the file by merge sort
        }
        else if (sortType== 'q' || sortType== 'Q'){
            // sort the file by quick sort
        }
        else if (sortType== 'z' || sortType== 'Z'){
            // sort the file by the other sort
        }
    }
    
    
    
    
    
}// end of SortManager class
