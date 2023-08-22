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
public class Q1 {
    Scanner scanner = new Scanner(System.in);
    
    public void dialogMsg() {
               
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your year of study: ");
        int studyYear = scanner.nextInt();
        System.out.print("What is your targer GPA for this semester? ");
        double targetGPA = scanner.nextDouble();
        
        System.out.println("Welcome " + name + "!");
        System.out.println("Work hard to achieve your targer GPA of " + targetGPA + " this semester of your Year " + studyYear);
        
    }
}
