/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1;

/**
 *
 * @author Vin Sen
 */
public class P1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Q1 q1 = new Q1();
//        
//        q1.dialogMsg();

//        Q2 q2 = new Q2();
//        int age = q2.promptAge();
//        q2.calculateAge(age);


        Q3 q3 = new Q3();
        
        int cardNum = q3.promptCardNumber();
        if(q3.verifyCardNumber(cardNum)){
            System.out.println("Your credit card number is valid");
        }else{
            System.out.println("Your credit card number is invalid");
        }
    }
    
}
