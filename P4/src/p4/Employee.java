/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p4;

/**
 *
 * @author Vin Sen
 */
public class Employee {
    private String name;
    private double salary;
        
    // Q1(c)
    // Constructor 
    public Employee(){
        name = "";
        salary = 0.0;
    }
    
    public Employee(String employeeName){
        name = employeeName;
        salary = 0.0;
    }
    
    public Employee(String employeeName, double currentSalary){
        name = employeeName;
        salary = currentSalary;
    }
    
    // Q1(b)
    // setters
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    // getters
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    
    public void raiseSalary(double percent){
        salary = salary + (salary * percent / 100.0);
    }
}
