/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Garrett Adams
 */

package Exercise05;

//Sets up scanner
import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {

        //Initializes Scanner
        Scanner ScanWord = new Scanner(System.in);
        //Declares Ints we will be using
        int Num1;
        int Num2;
        int Add;
        int Minus;
        int Multiply;
        int Divide;

        //Asks user for input
        System.out.println("What is the first number?");
        //Scans users 1st Num
        Num1 = ScanWord.nextInt();
        //Asks user for input
        System.out.println("What is the second number?");
        //Scans Users 2d Num
        Num2 = ScanWord.nextInt();
        //Calculates Addition
        Add = Num1 + Num2;
        //Calculates Subtraction
        Minus = Num1 - Num2;
        //Calculates Multiplication
        Multiply = Num1 * Num2;
        //Calculates Division
        Divide = Num1 / Num2;

        //Prints out final statement
        System.out.println("" + Num1 + " + " + Num2 + " = " + Add + "\n" + Num1 + " - " + Num2 + " = " + Minus +
                "\n" + Num1 + " * " + Num2 + " = " + Multiply + "\n" + Num1 + " / " + Num2 + " = " + Divide);
    }
}
