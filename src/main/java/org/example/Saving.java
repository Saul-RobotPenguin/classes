package org.example;

public class Saving {


    int _amount;
    String _name;
    float interest = 25F;

    Saving(int amount, String name){
        this._amount = amount;
        this._name = name;
    }

    void getAmount(){
        System.out.println("The amount for " +this._name + " " + this._amount);
    }


    void addInterest (){

    }
}
