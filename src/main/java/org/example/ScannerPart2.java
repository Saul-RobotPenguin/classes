package org.example;

import java.util.Scanner;

public class ScannerPart2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        int myInt = scanner.nextInt();
        int my2ndInt = scanner.nextInt();
        scanner.close();

        System.out.println(myString);
        System.out.println(myInt);
        System.out.println(my2ndInt);
    }
}
