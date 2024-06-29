package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int numbers[] = {1,2,3,4,5};
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));
//        sayHello();
//        Hello greeting = new Hello("Saul",2);


        Checking shiaosAccount = new Checking(100, "Shiao");

        int      name = 2;

        Checking shiaosAccount2 = new Checking(2, "Shiao");




//        shiaosAccount.getName();
//        shiaosAccount.getAmount();


//        franciscoAccount.getAmount();



        Checking franciscoAccount = new Checking(1, "Francisco");
        franciscoAccount.getAmount();
        franciscoAccount.addAmount(1000);
        franciscoAccount.getAmount();



    }




    static void sayHello (){
        System.out.println("Hello");
    }
}