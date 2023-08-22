/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p4;

/**
 *
 * @author Vin Sen
 */
public class P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Q2(b)
        Student s1 = new Student();
        s1.setName("Michelle");
        s1.setStudentID("12WMD34567");
        Student s2 = new Student("22WMD03343", "Vinsen");
        
        Student.setContribution(20);
        
        s1.addQuiz(8);
        s1.addQuiz(10);
        s1.addQuiz(6);
        
        System.out.println("Student " + s1.getName() + ", " + s1.getStudentID());
        System.out.println("===========================================");
        System.out.println("Total quizzes taken: " + s1.getQuizTaken()); 
        System.out.println("Total marks: " + s1.getTotalQuizScore() + "/" + s1.getQuizTaken() *10.0);
        System.out.println("Average marks: " + s1.getAverageScore());
        // Q3
        System.out.println("Coursework mark: " + 
                Student.calculateCWMark(Student.getContribution(), s1.getTotalQuizScore(), 
                        s1.getQuizTaken()) + "/" + Student.getContribution());
        
        s2.addQuiz(9);
        s2.addQuiz(7);
        s2.addQuiz(5);
        System.out.println("\n\nStudent " + s2.getName() + ", " + s2.getStudentID());
        System.out.println("===========================================");
        System.out.println("Total quizzes taken: " + s2.getQuizTaken()); 
        System.out.println("Total marks: " + s2.getTotalQuizScore() + "/" + s2.getQuizTaken() *10.0);
        System.out.println("Average marks: " + s2.getAverageScore());
        // Q3
        System.out.println("Coursework mark: " + 
                Student.calculateCWMark(Student.getContribution(), s2.getTotalQuizScore(), 
                        s2.getQuizTaken()) + "/" + Student.getContribution());

    }
    
    
    
    
}


                
//        // Q1(a)
//        Employee emp = new Employee("Bryan Brian", 3000);
//        System.out.println("Before : " + emp.salary);
//        emp.raiseSalary(8);
//        System.out.println("After : " + emp.salary);


//        // Q1(b)
//        Employee emp = new Employee("Bryan chan", 2500.50);
//        System.out.println("Before : " + emp.getSalary());
//        emp.raiseSalary(8);
//        System.out.println("After : " + emp.getSalary());


//        // Q1(c)
//        Employee emp1 = new Employee();
//        emp1.setName("Godzilla King Kong");
//        emp1.setSalary(2000.0);
//        
//        Employee emp2 = new Employee("Adam Brooker");
//        emp2.setSalary(2000.1);
//        
//        double totalSalary = emp1.getSalary() + emp2.getSalary();
//        
//        System.out.println("Employee with higher salary is " + 
//                ((emp1.getSalary() > emp2.getSalary())? emp1.getName():emp2.getName()));
//        System.out.println("Total salary is " + totalSalary);

        
        // Q4
        
        
