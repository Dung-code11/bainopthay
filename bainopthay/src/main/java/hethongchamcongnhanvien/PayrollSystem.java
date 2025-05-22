/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hethongchamcongnhanvien;

/**
 *
 * @author DUNG LE
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new FullTimeEmployee("Dung", 1600000);
        employees[1] = new PartTimeEmployee(4, 23000, "Quynh");
        employees[2] = new Intern(600000, "Phuong Anh");
        employees[3] = new PartTimeEmployee(60, 95000,"Daisy");
        employees[4] = new FullTimeEmployee("Ethan", 18000000);
        double totalPayroll = 0;
        System.out.println("   Payroll Sumary    ");
        for (Employee emp : employees) {
            double salary = emp.calculateSalary();
            System.out.println("Name: " + emp.getName());
            System.out.println("Type: " + emp.getType());
            System.out.println("Salary: " + salary + " VND");

            if (emp instanceof Intern) {
                ((Intern) emp).attendTraining();
            }

            if (emp instanceof PartTimeEmployee) {
                System.out.println("Hours Worked: " + ((PartTimeEmployee) emp).getHourWorked());
            }

            System.out.println("----------------------------");
            totalPayroll += salary;
        }

        System.out.println("Total Payroll Cost: " + totalPayroll + " VND");
    }
    }

