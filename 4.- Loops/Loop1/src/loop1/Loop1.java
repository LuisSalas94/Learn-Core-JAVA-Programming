/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop1;

import java.util.Scanner;


public class Loop1 {

    
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        /*System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        for(int i = 1; i<=10; i++)
        {
            System.out.println(num + " " +  " x " + " " + i + " = " + num*i);
        }
        */
        
        System.out.println("Enter a number: ");
        
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i = 1; i<=n; i++)
        {
            sum = sum + i;
        }
        
        System.out.println("sum is: " + sum);
        
    } 

    
    
}
