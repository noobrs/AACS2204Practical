/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p3;

import java.util.Scanner;

/**
 *
 * @author Vin Sen
 */
public class P3 {

    public static void main(String[] args) {
        
        // Q1
        processQuizScores();

        // Q2
        System.out.println(smallestIndex(new int[]{1, 2, 3, 5, 9, 1, 0, 1, 2}));


//        // Q3
//        breakdownBanknotes();
    }
    
    
    // Q1
    public static void processQuizScores(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of quiz scores to process: ");
        int n = scanner.nextInt();

        if(n > 0){
            double sum = 0, avg = 0;
            int aboveAvg = 0, belowAvg = 0;
            int[] scores = new int[n];
            
            for(int i = 0; i < n; i++){
                System.out.print("Score " + (i+1) + ": ");
                scores[i] = scanner.nextInt();
                sum += scores[i];
            }
            avg = sum/n;
            for(int i = 0; i < n; i++){
                if(scores[i] >= avg){
                    aboveAvg++;
                }else{
                    belowAvg++;
                }
            }
            
            System.out.println("Results");
            System.out.println("=======");
            System.out.println("Average is " + avg);
            System.out.println("Number of scores above or equal to the average is " + aboveAvg);
            System.out.println("Number of scores below the average is "+ belowAvg);
        }else{
            System.out.println("Invalid Number Input!");
        }
    }
    
    
    // Q2 
    public static int smallestIndex(int[] nums){
        
        int smallest = nums[0], smallestIndex = 0;
        
        if(nums.length == 1){
            return 0;
        }else{
            for(int i = 0; i < nums.length; i++){
                if(smallest > nums[i]){
                    smallestIndex = i;
                }
            }
        }
        
        return smallestIndex;
    }
    
    
    // Q3
    public static void breakdownBanknotes(){
        
        int[] denominations = new int[]{100, 50, 20, 10, 5, 1};
        int[] quantities = new int[denominations.length];
        int[] sum = new int[denominations.length];
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("%-20s\t%-10s\n", "Denomination (RM)", "Quantity");
        
        for(int i = 0; i < denominations.length; i++){
            System.out.printf("%10d %20s", denominations[i], " ");
            quantities[i] = scanner.nextInt();
            
            sum[i] = denominations[i] * quantities[i];
            total += sum[i];
        }
        
        System.out.printf("%-20s\t%-10s\t%-10s\n", "Denomination (RM)", "Quantity", "Value (RM)");
        
        for(int i = 0; i < denominations.length; i++){
            if(quantities[i] > 0){
                System.out.printf("%16d\t%7d\t%18d\n", denominations[i], quantities[i], sum[i]);
            }
        }
        
        System.out.println("Total = RM " + total);
    }
}
