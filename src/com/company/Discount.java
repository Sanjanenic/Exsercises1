package com.company;

public class Discount {
    public static void main(String[] args) {

        //On the bus you receive a discount if you are a senior citizen, a dog or a student.

        boolean senior = true;
        boolean dog = true;
        boolean student= true;
        boolean ergebnis = senior || dog || student;
        System.out.println ("Die haben eine Angebote! " + ergebnis);

        //In a bookshop you receive a discount if you buy more than 2 non-fiction books and at least one
        //fiction book

        boolean NotFictionBooks = true;
        boolean zahler = true;
        boolean  FictionBook = true;

        boolean ergebnisBook = (NotFictionBooks && zahler) || (FictionBook && NotFictionBooks);
        System.out.println (" Du hast eine Angebote für gekaufte Bucherer bekommen! " + ergebnisBook);

        //In a grocery shop you get a discount if you buy one drink, but only if it is not alcoholic.

       boolean alcoholic = false;
       boolean notAlcoholic = true;
       boolean ergebnisDrink= notAlcoholic || !alcoholic;
        System.out.println (" Du hast eine Angebote für gekaufte Drink bekommen! " + ergebnisDrink);






    }
}
