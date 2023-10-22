/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package application;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import shape.ThreeDShape;
import shape.Cone;
import shape.Cylinder;


/**
 *
 * @author dlg12
 */
public class AppDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
       /**
        * this method reads a text file of unsorted shapes
        * and add them to an array
        */ 
       
       // command line args; initialized with some value; to be changed later
       String fileName = "";
       String comparisonType = "";
       String sortingAlgo = "";
       
       
       // Parse command line args
       for (int i=0; i < args.length; i++){
           if(args[i].toLowerCase().startsWith("-f")){
               fileName = args[i].substring(2);
           }
           else if(args[i].toLowerCase().startsWith("-t")){
               comparisonType = args[i].substring(2);
           }
           else if(args[i].toLowerCase().startsWith("-t")){
               sortingAlgo = args[i].substring(2).toLowerCase(); // make them all lower case for easier handling
           }
       }
       
       // just in case the filename is not entered
       if (fileName.isEmpty() || comparisonType.isEmpty() || !isValidSortingAlgo(sortingAlgo)){
           System.out.println("Use the command: java AppDriver -f<file name> -t<comparison type> -s<sorting algorithm>");
           System.exit(1); // failed run and terminate
       }
       
       
       ////////// reading the file
       
       // create an array to store the threeD shapes
       ThreeDShape[] shapes3D = new ThreeDShape[100]; // size will be changed later
       
       
       // Read the shapes from the given file and add to the array
       try{
           //create scanner to read the texts
           Scanner scanner = new Scanner(new File(fileName));
           
           // Read the shapes from the file and add them to the list
           int shape3DCount = 0;
           while (scanner.hasNext()) {
               // recall that the very first text/token is the num of shapes
               int numOfShapes = Integer.parseInt(scanner.next());
               // the next thing would then be a shapeType
               String shapeType = scanner.next();
               // find out what 3D shape it is to create it and add to the list
               if(shapeType.equalsIgnoreCase("Cylinder")){
                   double height = scanner.nextDouble();
                   double radius = scanner.nextDouble();
                   shapes3D[shape3DCount] = new Cylinder(height, radius);
               }
               else if(shapeType.equalsIgnoreCase("Cone")){
                   //handle Cone
               }
               else if(shapeType.equalsIgnoreCase("Pyramid")){
                   //handle Pyramid
               }
               else if(shapeType.equalsIgnoreCase("Prism") || 
                       shapeType.contains("Prism")){
                   // handle Prism
               }
           }
           
           //close scanner
           scanner.close();
       }
       catch (FileNotFoundException e){
           System.out.println("Error reading the file: " + e.getMessage());
           System.exit(1); // run is failed so terminate
       }

       
        
        
    }// end of main method
    
    
    //create isValidSortingAlgo method to help manage the command line args
    private static boolean isValidSortingAlgo(String algo){
        if (algo.equalsIgnoreCase("b") || 
                algo.equalsIgnoreCase("s") || 
                algo.equalsIgnoreCase("i") ||
                algo.equalsIgnoreCase("q") ||
                algo.equalsIgnoreCase("m") ||
                algo.equalsIgnoreCase("z")){
            return true;
        }
        else{
            return false;
        }            
    }
    
} // end of AppDriver class
