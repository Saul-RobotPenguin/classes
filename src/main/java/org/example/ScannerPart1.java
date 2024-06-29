package org.example;


import java.util.Scanner;

public class ScannerPart1 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);



            // Write your code here.
            //int string double

            /// int double string
            int i = scan.nextInt();
            double d = scan.nextDouble();
            scan.nextLine();
            String s = scan.nextLine();


            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);

        }
}
