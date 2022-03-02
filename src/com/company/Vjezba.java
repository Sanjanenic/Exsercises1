package com.company;

import java.util.Scanner;

public class Vjezba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Wie vile nonFiction hast du gekauft?");
         int nonFiction= sc.nextInt();

        System.out.println ("Wie vile Fiction hast du gekauft?");
        int fiction= sc.nextInt();

        //In a bookshop you receive a discount if you buy more than 2 non-fiction books and at least one
        //fiction book
        boolean result= nonFiction>2 && fiction>0;
        System.out.println ("Du hast eine Angebote bekommen " + result );



    }
}
