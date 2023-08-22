/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p2;

import java.util.Arrays;

/**
 *
 * @author Vin Sen
 */
public class P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        q1();
        
//        // Q2
//        for(int i = 1; i <= 10; i++){
//            System.out.printf("i = %d \tSquare Root = %.8f\n", i,sqrt(i));
//        }
        
        // Q3
        System.out.printf("%-15s %-15s %-15s %-15s\n", "Inches", "Centimeters", "Centimeters", "Inches");
        for(double i = 1, cm = 5; i <= 10; i++, cm+=5){
            System.out.printf("%-15.1f %-15.2f %-15.1f %-15.2f\n", i, inchToCentimeter(i), cm, centimeterToInch(cm));
            
        }
    }
    
    // Q1
    public static void q1(){
        System.out.println("Number     SquareRoot");
        for(int i = 0; i <= 20; i+=2){
            System.out.printf("%-10d %.4f\n", i, Math.sqrt(i));
        }
    }
    
    // Q2
    public static double sqrt(double x){
                
        double lowerLimit, upperLimit, midPoint, sqMid;
        
        if(x == 1 || x == 0){
          return x;  
        }else if(x < 0){
            System.out.println("Cannot less than 0 !!");
            return x;
        }else if(x > 1){
            lowerLimit = 1;
            upperLimit = x;
        } else {
            upperLimit = 1;
            lowerLimit = x;
        }
        
        while( Math.abs((lowerLimit - upperLimit)/lowerLimit) >=1.0e-8) {
             midPoint=(lowerLimit+upperLimit) / 2;
             sqMid=midPoint*midPoint;
              if(sqMid>x){
                upperLimit=midPoint;
              }else{
                lowerLimit=midPoint;
            }
       }
        
        return (lowerLimit+upperLimit)/2;
    }
    
    
    // Q3
    final static double IN_TO_CM_RATE = 2.54;
    
    public static double inchToCentimeter(double in){
        return in * IN_TO_CM_RATE;
    }
    public static double centimeterToInch(double cm){
        return cm / IN_TO_CM_RATE;
    }
    
    
}
