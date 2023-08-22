/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p4;

/**
 *
 * @author Vin Sen
 */
public class Student {
    private String studentID, name;
    private int quizTaken;
    private double totalQuizScore;
    
    private static double contribution;
    
    public static void setContribution(double contribution){
        Student.contribution = contribution;
    }
    public static double getContribution(){
        return Student.contribution;
    }
    
    public Student(){
        this("","");
    }
    
    public Student(String studentID, String name){
        this.studentID = studentID;
        this.name = name;
        quizTaken = 0;
        totalQuizScore = 0.0;
    }
    
    public void setStudentID(String studentID){
        this.studentID = studentID;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getStudentID(){
        return studentID;
    }
    public String getName(){
        return name;
    }
    public int getQuizTaken(){
        return quizTaken;
    }
    public double getTotalQuizScore(){
        return totalQuizScore;
    }
    
    public void addQuiz(double score){
        totalQuizScore += score;
        quizTaken++;
    }
    
    public double getAverageScore(){
        return totalQuizScore/quizTaken;
    }
  
    // Q3
    public void modifiedAddScore(double score){
        totalQuizScore += score;
        quizTaken++;
    }    
    
    public static double calculateCWMark(double contribution, double totalscore, int quizTaken){
        return (totalscore/ (quizTaken*10)) * contribution;
    }

}
