/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p5;

import java.util.Scanner;

/**
 *
 * @author Vin Sen
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        System.out.println("Modified string: " + 
                modifyString(str));
    }
    
    public static String modifyString(String s){
        
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        s = s.toUpperCase();
        
        for(char vowel : vowels){
            s = s.replace(vowel, 'x');
        }
        
        return s;
    }
}
