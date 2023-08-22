/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p4;

import java.util.Scanner;

/**
 *
 * @author Vin Sen
 */
public class CarRegistration {
    private static int initialNo = 1000;
    private int regNo;
    Owner owner;
    Car car;
    private String plateNo;
    private String color;
    private String year;
    
    public CarRegistration(){
        this("", "", "", "", "", "", "", 0.0);
        regNo = ++initialNo;
    }
    
    public CarRegistration(String name, String icNo, String plateNo,
            String color, String year, String make, String model, double capacity){
        owner = new Owner(name, icNo);
        this.plateNo = plateNo;
        this.color = color;
        this.year = year;
        car = new Car(make, model, capacity);
        regNo = ++initialNo;
    }
    
    public int getRegNo(){
        return this.regNo;
    }
    
    public String getOwnerName(){
        return owner.getName();
    }
    
    public void setName(String name){
        owner.setName(name);
    }
    
    public String getICNo(){
        return owner.getICNo();
    }
    
    public void setICNo(String iCNo){
        owner.setICNo(iCNo);
    }
    
    public String getPlateNo(){
        return this.plateNo;
    }
    
    public void setPlateNo(String plateNo){
        this.plateNo = plateNo;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getYear(){
        return this.year;
    }
    
    public void setYear(String year){
        this.year = year;
    }
    
    public String getMake(){
        return car.getMake();
    }
    
    public void setMake(String make){
        car.setMake(make);
    }
    
    public String getModel(){
        return car.getModel();
    }
    
    public void setModel(String model){
        car.setModel(model);
    }
    
    public double getCapacity(){
        return car.getCapacity();
    }
    
    public void setCapacity(double capacity){
        car.setCapacity(capacity);
    }
    
    @Override
    public String toString(){
        return owner.toString() + " " + plateNo + " " + color + car.toString();
    }
}

class Owner{
    private String name;
    private String icNo;
    
    public Owner(String name, String icNo){
        this.name = name;
        this.icNo= icNo;
    }

    public Owner(){
        this("", "");
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setICNo(String icNo){
        this.icNo = icNo;
    }
    
    public String getName(){
        return this.name;
    }
    public String getICNo(){
        return this.icNo;
    }
    
    @Override
    public String toString(){
        return "Name: " + name + ", IC No: " + icNo;
    }
}

class Car{
    private String make;
    private String model;
    private double capacity;
    
    public Car(){
        this("", "", 0.0);
    }
    
    public Car(String make, String model, double capacity){
        this.make = make;
        this.model = model;
        this.capacity = capacity;
    }

    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setCapacity(double capacity){
        this.capacity = capacity;
    }

    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    public double getCapacity(){
        return this.capacity;
    }
    
    @Override
    public String toString(){
        return "Make: " + make + ", Model: " + model + ", Capacity: " + capacity;
    }
}

class Main{
   
    public static void main(String[] args) {
           
        Car[] carType = new Car[]{
            new Car("Toyota", "Vios", 1.5),
            new Car("Nissan", "Teana", 2.0),
            new Car("Honda", "City", 1.5)
        };
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Number of registration data: ");
        int n = scanner.nextInt();
        //scanner.nextLine();
        
        if(n > 0){
            CarRegistration[] cr = new CarRegistration[n];
            
            for(int i = 0; i < n; i++){
                System.out.println("1. " + carType[0].toString());
                System.out.println("2. " + carType[1].toString());
                System.out.println("3. " + carType[2].toString());
                
                System.out.print("\nEnter Name: ");
                scanner.nextLine();
                String name = scanner.nextLine();
                
                System.out.print("Enter IC No: ");
                String iCNo = scanner.next();
                
                System.out.print("Enter Plate No: ");
                String plateNo = scanner.next();
                
                System.out.print("Enter Color: ");
                String color = scanner.next();
                
                System.out.print("Enter Year: ");
                String year = scanner.next();
                
                System.out.print("Enter Car Type Option: ");
                int opt = scanner.nextInt();
                
                
                cr[i] = new CarRegistration(name, iCNo, plateNo, color, year
                , carType[opt - 1].getMake(), carType[opt - 1].getModel()
                        , carType[opt - 1].getCapacity());
            }
            
            System.out.println("\n\n\n\t\tCar Registration Listing");
            System.out.printf("%-8s %-15s %-15s %-10s %-6s %-5s %-8s %-6s %s\n", 
                    "Reg No.", "Name", "IC No.", "Plate No.", "Color", "Year"
                    , "Make", "Model", "Capacity");
            
            for(int i = 0; i < n; i++){
                System.out.printf("%-8d %-15s %-15s %-10s %-6s %-5s %-8s %-6s %.1f\n",
                        cr[i].getRegNo(), cr[i].getOwnerName(), cr[i].getICNo(), cr[i].getPlateNo()
                        , cr[i].getColor(), cr[i].getYear(), cr[i].getMake(), cr[i].getModel(), cr[i].getCapacity());
            }
        }      
    }
}