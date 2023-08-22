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
public class Q3 {
    
    Scanner scanner = new Scanner(System.in);
    
    public int promptCardNumber(){
        System.out.print("Enter Credit Card Number : ");
        
        return scanner.nextInt();
    }
    
    public boolean verifyCardNumber(int cardNum){

        if((cardNum >= 10000000) && (cardNum <= 99999999)){
            int[] num = new int[8];
            int sum = 0;
            
            for(int i = 0, power = 7; i < 8; i++, power--){
                num[i] = (int) (cardNum / Math.pow(10, power)) % 10;
                
                if(i % 2 != 0){
                    sum += num[i];
                } else{
                    sum += (num[i] * 2) % 10;
                    sum += (num[i] * 2) / 10;
                }
            }
            return (sum % 2 == 0);
            
        } else 
            return false;
    }
}
