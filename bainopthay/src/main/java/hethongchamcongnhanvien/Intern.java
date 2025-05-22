/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hethongchamcongnhanvien;

/**
 *
 * @author DUNG LE
 */
public class Intern extends Employee{
    private double allowance;

    public Intern(double allowance, String name) {
        super(name);
        this.allowance = allowance;
    }
    public double calculateSalary(){
        return allowance;
    }
    public String getType(){
        return "Intern";
    }
    public void attendTraining(){
        System.out.println(name+ "is attending training");
    }
}
