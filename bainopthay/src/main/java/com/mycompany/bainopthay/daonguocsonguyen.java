/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bainopthay;

/**
 *
 * @author DUNG LE
 */
//import java.util.Scanner;
//
//public class daonguocsonguyen {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Nhập số nguyên: ");
//        int number = scanner.nextInt();
//
//        int reversed = 0;
//
//        while (number != 0) {
//            int digit = number % 10;            // lấy chữ số cuối
//            reversed = reversed * 10 + digit;   // thêm vào số đảo
//            number /= 10;                       // bỏ chữ số cuối
//        }
//
//        System.out.println("Số đảo ngược là: " + reversed);
//    }
//}
import java.util.Scanner;

public class daonguocsonguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên: ");
        int number = scanner.nextInt();

        String reversed;

        if (number < 0) {
            reversed = "-" + new StringBuilder(Integer.toString(-number)).reverse().toString();
        } else {
            reversed = new StringBuilder(Integer.toString(number)).reverse().toString();
        }

        System.out.println("Số đảo ngược là: " + reversed);
    }
}


