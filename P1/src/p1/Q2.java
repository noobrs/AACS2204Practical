/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1;

import java.util.Scanner;

/**
 *
 * @author Vin Sen
 */
public class Q2 implements TimeConvertion {
    
    Scanner scanner = new Scanner(System.in);
    
    public int promptAge(){
        System.out.print("Enter your age (years) : ");
        int age = scanner.nextInt();
        
        return age;
    }
    
    public void calculateAge(int age) {
        
        int days = age * DAY_IN_YEAR;
        int second = days * HOUR_IN_DAY * MINUTE_IN_HOUR * SECOND_IN_MINUTE;
        
        System.out.println("Age in years: " + age + " years");
        System.out.println("Age in days: " + days + " days");
        System.out.println("Age in seconds: " + second + " seconds");
    }
}
