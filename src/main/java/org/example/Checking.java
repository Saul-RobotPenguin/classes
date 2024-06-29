package org.example;

public class Checking {

    int _amount;
    String _name;

    Checking(int amount, String name){
        this._amount = amount;
        this._name = name;
    }




     void getName(){
        System.out.println("The name of this account is " + this._name);
    }

    void getAmount(){
        System.out.println("The amount for " +this._name + " " + this._amount);
    }

    void changeName (String newName){
        this._name = newName;
    }

//    void changeAmount (int newAmount ){
//        this._amount =newAmount;
//    }
//

    void addAmount (int addedAmount){
        this._amount  =  this._amount + addedAmount;
    }



}
