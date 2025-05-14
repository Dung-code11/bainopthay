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
public class sodoixung {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập số nguyên: ");
        int number = nhap.nextInt();
        int sothuc = number;
        int reversed = 0;
        while(number !=0 ){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        if (sothuc == reversed){
            System.out.println("Đây là số đối xứng");
        }
        else{
            System.out.println("Đây không phải là số đối xứng");
        }
    }
}
