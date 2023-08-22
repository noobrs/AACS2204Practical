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
public class Q1 {

    public static int countLetter(String str, char ch){
        int count = 0;
        
        for(char c : str.toCharArray()){
            if(c == ch){
                count++;
            }
        }
        
        return count;
    }
}

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = scanner.next();
        
        System.out.print("Enter the letter you want to count: ");
        String letter = scanner.next();
        
        System.out.println(word + " contains " 
                + Q1.countLetter(word, letter.charAt(0)) 
                + letter.charAt(0));
    }
}

