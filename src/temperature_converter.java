/*
* Author: Kevin Wahome
* Date: 7/4/24
* Status: Completed
*
* Purpose of program
* Ask the user whether they want to convert the temperature from Celsius to Fahrenheit
* or from Fahrenheit to Celsius and depending on the user choice will display the result
* with 2 decimal precision. If the user wants to begin another conversion they are allowed.
* */

import java.util.Scanner;
public class temperature_converter {
    private static double convert_to_celsius(double fahrenheit) {
        // formula
        double celsius;
        celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
    private static double convert_to_fahrenheit(double celsius) {
        // formula
        double fahrenheit;
        fahrenheit = (celsius * 1.8 ) + 32;
        return fahrenheit;
    }
    private static boolean restart() {
        Scanner in = new Scanner(System.in);
        System.out.println("Want to convert again? (Y/N)");
        char input = in.nextLine().charAt(0);
        if (input == 'Y' || input == 'y') {
            return true;
        }
        else {
            System.out.println("Thank you for converting :]");
            return false;
        }
    }
    public static void main(String[] args) {
        do
        {
            // Prompt the user with a greeting
            System.out.println("Hello User, it appears you want to handle temperature conversions today :]");
            // prompt the user with choice or temperature conversion
            System.out.println("1 to convert from Celsius to Fahrenheit or 2 to convert from Fahrenheit to Celsius");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter temperature in Fahrenheit");
                Scanner sc2 = new Scanner(System.in);
                double fahrenheit = sc2.nextDouble();
                // handles convertion
                double celsius = convert_to_celsius(fahrenheit);
                System.out.println("Fahrenheit: " + fahrenheit + " converted to Celsius: " + String.format("%.2f", celsius));
            }
            else if (choice == 2) {
                System.out.println("Enter temperature in Celsius");
                Scanner sc3 = new Scanner(System.in);
                double celsius = sc3.nextDouble();
                // handles convertion
                double fahrenheit = convert_to_fahrenheit(celsius);
                System.out.println("Celsius: " + celsius + " converted to Fahrenheit: " + String.format("%.2f", fahrenheit));
            }
            else {
                System.out.println("Please enter a valid number to continue");
            }
        }while(restart());
    }
}
