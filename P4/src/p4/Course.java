/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p4;

import java.lang.reflect.Array;

/**
 *
 * @author Vin Sen
 */
public class Course {
    private String courseTitle;
    private double feesPerStudent;
    private int noOfStudents = 0;
    private String[] studentNames = new String[100];
    private static int courseCount = 0;
    
    public Course(String courseTitle, double feesPerStudent){
        this.courseTitle = courseTitle;
        this.feesPerStudent = feesPerStudent;
        courseCount++;
    }
    
    // setter
    public void setCourseTitle(String courseTitle){
        this.courseTitle = courseTitle;
    }
    
    public void setFeesPerStudent(double feesPerStudent){
        this.feesPerStudent = feesPerStudent;
    }
    
    // getter
    public String getCourseTitle(){
        return this.courseTitle;
    }
    
    public double getFeesPerStudent(){
        return this.feesPerStudent;
    }
    
    public int getNoOfStudents(){
        return this.noOfStudents;
    }
    
    public String[] getStudentNames(){
        return studentNames;
    }
    
    
    public double calcFeesCollected(){
        return feesPerStudent * noOfStudents;
    }
    
    public void addStudent(String studName){
        this.studentNames[noOfStudents] = studName;
        noOfStudents++;
    }
    
    @Override
    public String toString(){
        return "Course Title: " + courseTitle 
                + ", Fees Per Student: " + feesPerStudent 
                + ", No of Student: " + noOfStudents;
    }
}

class Main{
    public static void main(String[] args) {
        Course introToCpt = new Course("Introduction to Computers", 250);
        
        introToCpt.addStudent("Ali Said");
        introToCpt.addStudent("Wong Ken");
        introToCpt.addStudent("Peter Lim");
        
        System.out.println(introToCpt.toString());
        System.out.println("Total fees collected: " + introToCpt.calcFeesCollected());
        System.out.println("Students Enrolled");
        
        String[] studNames = introToCpt.getStudentNames();
        for(String name : studNames){
            if(name != null){
                System.out.println(name + "");
            }
        }
    }
}
