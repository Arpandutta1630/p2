package com.company;
import java.util.*;
public class p3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the temp in farenheit ");
        double far = sc.nextInt();
        double cel = ((far - 32) / 9)*5;
        System.out.println("The temperature in celsius is : " + cel);
    }
}

