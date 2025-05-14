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
public class solonnhat {
    public static void main(String[] args) {
        Scanner nhap =new Scanner(System.in);
        System.out.println("Nhap so : ");
        int number = nhap.nextInt();
        int max = 0;
        while(number > 0 ){
            int digit = number % 10;
            if(digit > max ){
                max = digit; 
            }
              number /=10;
        }
        System.out.printf("Số lớn nhất trong dãy số: %d \n ", max);
    }
}
