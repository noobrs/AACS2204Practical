/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2;

/**
 *
 * @author Vin Sen
 */
public class testAvg {
    public static void main(String[] args) {
        Average avg = new Average();
        
        System.out.println("Average for 2 int parameters: " + avg.calculateAverage(2, 5));
        System.out.println("Average for 3 int parameters: " + avg.calculateAverage(2, 5, 9));
        System.out.println("Average for 2 double parameters: " + avg.calculateAverage(2.00, 5.50));
        System.out.println("Average for 3 double parameters: " + avg.calculateAverage(2.60, 5.0, 9.20));
    }
}
