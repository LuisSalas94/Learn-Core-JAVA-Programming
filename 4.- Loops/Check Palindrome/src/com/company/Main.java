package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int reverse = 0;
        int remainder;
        int temp = n;

        while(n > 0)
        {
            remainder = n%10;
            reverse = reverse * 10 + remainder;
            n = n/10;
        }

        if(reverse == temp)
        {
            System.out.println("Its a palindrome");
        }
        else
        {
            System.out.println("its not a palindrome");
        }

    }
}
