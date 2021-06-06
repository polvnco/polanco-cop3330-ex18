/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Polanco
 */
package Assignment1.example;


import java.util.Scanner;

@SuppressWarnings("ALL")
public class ex18
{
    public static void main( String[] args )
    {
        System.out.println( "Press C to convert from Fahrenheit to Celsius." );
        System.out.println( "Press F to convert from Celsius to Fahrenheit." );

        String unit;
        Scanner scan = new Scanner(System.in);
        unit = scan.nextLine();
        if (unit.equals("f") || unit.equals("F")) {
            System.out.println("Your choice: " + unit);
            System.out.print("Please enter the temperature in Fahrenheit: ");
            Scanner temp = new Scanner(System.in);
            String fromTemp = temp.nextLine();
            int Fahrenheit = Integer.parseInt(fromTemp);
            int F = (Fahrenheit - 32) * (5/9);
            System.out.print("The temperature in Celsius is ");
            System.out.printf("%d", F);
            System.out.print(".");

        } else if (unit.equals("c") || unit.equals("C") ) {
            System.out.println("Your choice: " + unit);
            System.out.print("Please enter the temperature in Celsius: ");
            Scanner temp = new Scanner(System.in);
            String fromTemp = temp.nextLine();
            int Celsius = Integer.parseInt(fromTemp);
            int C = (Celsius * (5/9)) + 32;
            System.out.print("The temperature in Fahrenheit is ");
            System.out.printf("%d", C);
            System.out.print(".");
        }
    }
}
