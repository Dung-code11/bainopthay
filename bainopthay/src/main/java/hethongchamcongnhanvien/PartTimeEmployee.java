/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hethongchamcongnhanvien;

/**
 *
 * @author DUNG LE
 */
public class PartTimeEmployee extends Employee{
    private int hourWorked;
    private double hourlyRate;

    public PartTimeEmployee(int hourWorked, double hourlyRate, String name) {
        super(name);
        this.hourWorked = hourWorked;
        this.hourlyRate = hourlyRate;
    }
    public double calculateSalary(){
        return hourWorked * hourlyRate;
    }
    public String getType(){
        return "Part-time";
    }

    public int getHourWorked() {
        return hourWorked;
    }
    
}
