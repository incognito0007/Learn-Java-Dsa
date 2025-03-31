package _01FirstJavaProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println(name);
    }
}
