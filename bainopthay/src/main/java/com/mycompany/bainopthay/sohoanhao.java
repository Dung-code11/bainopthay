/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bainopthay;

import java.util.Scanner;

/**
 *
 * @author DUNG LE
 */
public class sohoanhao {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương lớn hơn 0.");
            return;
        }

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println(number + " là số hoàn hảo.");
        } else {
            System.out.println(number + " không phải là số hoàn hảo.");
        }
    }
}
