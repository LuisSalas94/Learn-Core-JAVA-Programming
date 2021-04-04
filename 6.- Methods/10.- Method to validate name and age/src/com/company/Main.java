package com.company;

public class Main {

    boolean validate(String name)
    {
        return name.matches("[a-zA-Z\\s]+");
    }

    boolean validate(int age)
    {
        return  age>=3 && age<=15;
    }

    int reverse(int n)
    {
        int rev = 0;
        while(n>0)
        {
            rev = rev*10+n%10;
            n = n/10;
        }
        return rev;
    }


    public static void main(String[] args) {


    }
}
