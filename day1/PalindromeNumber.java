/*
Day 1 - Java Basics
Program: Palindrome Number
Description: Checks whether a given number is palindrome
*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("enter the number to check weather the number is palindrome or not ");
        int temp,rem,rev=0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//taking a input from user 
        temp=num;
        while(num!=0){//the main logic 
            rem=num%10;
            rev=rem+rev*10;
            num=num/10;
        }
        if(rev==temp)//dispaling the result
        System.out.println("yes! your number is palindrome number ");
        else 
        System.out.println("your number is not a palindrome number ");
    }
}
