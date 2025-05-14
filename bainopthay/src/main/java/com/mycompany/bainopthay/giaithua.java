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
public class giaithua {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhâp số nguyên dương");
        int number = nhap.nextInt();
        if(number < 0){
            System.out.println("Số âm không tính được");
        }
        else{
            long giaithua = 1;
            for (int i = 1; i <= number; i++) {
                giaithua *=i;
            }
            System.out.printf("Giai thua của %d là: %d \n", number, giaithua);
        }
        
    }
}
