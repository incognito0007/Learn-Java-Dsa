package _01FirstJavaProgram.TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option;
        System.out.println("Select option \n1. Degree Celcius to Fahrenhite \n2. Degree Fahrenhite to Celcius");
        option = input.nextInt();

        if (option == 1) {
            System.out.println("Enter temperature in C: ");
            float temp = input.nextFloat();

            float result = ((temp / 5) * 9) + 32;
            System.out.println("Temperature in F is " + result);
        } else if (option == 2) {
            System.out.println("Enter temperature in F: ");
            float temp = input.nextFloat();

            float result = ((temp - 32)/9) * 5;
            System.out.println("Temperature in C is " + result);
        } else{
            System.out.println("Invalid option selected");
        }
    }
}
