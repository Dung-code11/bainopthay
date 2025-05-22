/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hethongchamcongnhanvien;

/**
 *
 * @author DUNG LE
 */
public class FullTimeEmployee extends Employee{
    private double monthlySalary;
    public FullTimeEmployee(String name,double monthlySalary){
        super(name);
        this.monthlySalary = monthlySalary;
    }
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public String getType() {
        return "Full-time";
    }
    
}
