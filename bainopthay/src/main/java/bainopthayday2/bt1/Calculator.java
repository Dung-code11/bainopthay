/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bainopthayday2.bt1;

/**
 *
 * @author DUNG LE
 */
public class Calculator {
    public static int add(int a,int b){
        return a+b ;
    }
    public static int subtract(int a,int b){
        return a - b;
    }
    public static int multiply(int a,int b){
        return a * b;
    }
    public static int divide(int a,int b){
        if(b == 0){
            throw new ArithmeticException("Loi: Khong the chia cho 0!");
        }
        return a/b;
    }
    public static void main(String[] args) {
        System.out.println("5 + 3 = " +Calculator.add(5, 3));
        System.out.println("5 - 3 = " +Calculator.subtract(5, 3));
        System.out.println("5 * 3 = "+Calculator.multiply(5, 3));
        try {
            System.out.println("5 / 0 = " +Calculator.divide(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("5 / 0 = " +e.getMessage());
        }
        System.out.println("10 /2 = " +Calculator.divide(10, 2));
    }
}
