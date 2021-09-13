/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Gabriel Mousa
 */

import java.util.Locale;
import java.util.Scanner;

public class App{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double tax = 0.0;

        System.out.println("What is the order amount?");
        double amount = Double.parseDouble(input.nextLine());

        System.out.println("What state do you live in?");
        String state = input.nextLine().toLowerCase();

        if(state.equals("wisconsin")){
            tax += .05;
            System.out.println("What county do you live in?");
            String county = input.nextLine().toLowerCase();
            if(county.equals("eau claire")){
                tax += .005;
            }else if(county.equals("dunn")){
                tax += .004;
            }
            System.out.format("The tax is $%.2f.\n",tax*amount);
        }else if(state.equals("illinois")){
            tax += .08;
            System.out.format("The tax is $%.2f.\n", tax*amount);
        }

        System.out.format("The total is $%.2f.", amount+(amount*tax));

    }
}