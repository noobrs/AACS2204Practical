/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p5;

import java.util.Scanner;

/**
 *
 * @author Vin Sen
 */
public class P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(validateID("H2ruegaeg"));
    }
    
    public static boolean validateUsername(){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter User name: ");
	String name = scanner.nextLine();

	return (name.length() >= 6 && name.indexOf(' ') == -1);
    }
    public static boolean validateCreditCardNumber(String creditCardNumber){
        if(creditCardNumber.length() == 16){
            for(int i = 0; i < creditCardNumber.length(); i++){
                if(!Character.isDigit(creditCardNumber.charAt(i) ))
                    return false;
            }
        }
        else return false;
        
        return true;
    }
    
    public static boolean validateID(String loginID){
        int digit = 0, lowerCase = 0;
        
        if((loginID.length() >= 6 && loginID.length() <=10) &&
                Character.isUpperCase(loginID.charAt(0))){    
            for(int i = 0; i < loginID.length(); i++){
                if(Character.isDigit(loginID.charAt(i))){
                    digit++;
                }else if(Character.isLetter(loginID.charAt(i))){
                    if(Character.isLowerCase(loginID.charAt(i)))
                        lowerCase++;
                }
                else return false;
            }
        }
        else return false;
        
        return (digit > 0 && lowerCase > 0);
    }
    
}
