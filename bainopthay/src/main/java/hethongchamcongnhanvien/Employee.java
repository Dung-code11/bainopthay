/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hethongchamcongnhanvien;

/**
 *
 * @author DUNG LE
 */
public class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }
    public double calculateSalary(){
        return 0;
    };
    public String getType(){
        return "General Employee";
    }
    public String getName() {
        return name;
    }
}
