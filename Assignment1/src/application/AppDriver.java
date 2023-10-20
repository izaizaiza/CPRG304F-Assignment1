/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package application;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
    public static void main(String[] args) throws FileNotFoundException {
        //int[] sortArr = {1, 9, 3, 35, 17, 2, 31, 4};
        //ArraySorter arraysorter = new ArraySorter();

        //System.out.println("Please choose a sort algorithm");
        //System.out.println("1. quickSort");
        //System.out.println("2. bubbleSort");
        //System.out.println("3. insertSort");
        //System.out.println("4. selectSort");
        //int index = new Scanner(System.in).nextInt();
        //switch (index) {
        //    case 1 -> Sorts.quickSort(sortArr, 0, sortArr.length - 1);
        //    case 2 -> Sorts.bubbleSort(sortArr);
        //   case 3 -> Sorts.insertSort(sortArr);
        //    case 4 -> Sorts.selectSort(sortArr);
        //}
        //System.out.println("sorted:");
        //for (int j : sortArr) {
        //    System.out.println(j);
        //}
        
        String fileName = args[1];
        // we need this to count the number of shapes in the file
        int numShapes = 0;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            numShapes = Integer.parseInt(reader.readLine());
            ThreeDShape[] shapes = new ThreeDShape[numShapes];

            for (int i = 0; i < numShapes; i++) {
                String line = reader.readLine();
                String[] tokens = line.split(" ");

                if (tokens.length < 3) {
                    System.out.println("Invalid shape data: " + line);
                    continue;
                }

                String shapeType = tokens[0];
                double value1 = Double.parseDouble(tokens[1]);
                double value2 = Double.parseDouble(tokens[2]);

                // Create shape objects based on the shapeType
                ThreeDShape shape = createThreeDShape(shapeType, value1, value2);

                if (shape != null) {
                    shapes[i] = shape;
                }
            }
            // Now you have an array of shape objects
            for (ThreeDShape shape : shapes) {
                if (shape != null) {
                    System.out.println("Shape: " + shape.getClass().getSimpleName());
                    System.out.println("Height: " + shape.getHeight());
                    System.out.println("Base Area: " + shape.getBaseArea());
                    System.out.println("Volume: " + shape.getVolume());
                    System.out.println();
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }        
    } //end of main method
    
    
    //createThreeDShape

    /**
     *
     * @param shapeType
     * @param value1
     * @param value2
     * @return
     */
    public static ThreeDShape createThreeDShape(String shapeType, double value1, double value2) {
        switch (shapeType) {
            case "Cylinder":
                return new Cylinder(value1, value2);
            case "Cone":
                return new Cone(value1, value2);
            // Add cases for other prism types as needed
            default:
                System.out.println("Unknown shape type: " + shapeType);
                return null;
        }
    }// end of createThreeDShape
    
} // end of AppDriver class
