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


        //In a grocery shop you get a discount if you buy one drink, but only if it is not alcoholic.
        System.out.println ("Wie vile  Alcoholic hast du gekauft?");
        int alcoholic= sc.nextInt();
        System.out.println ("Wie vile  Not Alcoholic hast du gekauft?");
        int notAlcoholic= sc.nextInt();
        boolean resultDrink = notAlcoholic==1 && alcoholic==0;

        System.out.println ("Du hast eine Angebote bekommen " + resultDrink );




    }
}

//package fh.campus02;

import java.util.Scanner;

public class ScannerUebung {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //neue instanz von diese Class, System in ist sourse, Tatatur in unsere Fall
        //System.out.println("")

        System.out.println("Enter an number, then press Enter");
        int number = sc.nextInt(); //to sto cemo ucitati spasavamo u novu varijablu
        int sum =0;
        //System.out.println("You entred: " + number);

        while (number>0){
            if (number == 2){
                sum= sum*2;
                System.out.println ("double Bonus!");
                System.out.println("Enter another number!");
                number = sc.nextInt();
            }
            else if (number == 3){
                sum =sum*3;
                System.out.println ("triple Bonus!");
                System.out.println("Enter another number!");
                number = sc.nextInt();

            }
            else if (number == 22){
                sum =sum/2;
                System.out.println ("Sum halved!");
                System.out.println("Enter another number!");
                number = sc.nextInt();
            }
            else {
                sum+=number; //isto je sum = sum + number
                System.out.println("Enter another number!");
                number = sc.nextInt();

            }

        }

        System.out.println("Your total sum is : " + sum);
        sc.close();



    }
}

//package fh.campus02;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {

        CheckLetter() ;

    }

    public static void CheckLetter() {
        String letter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an letter!");
        letter = sc.nextLine();

        String n = "0";
        while (letter.equals(n)){
            String a = "a";
            String e = "e";
            String u = "u";
            String o = "o";
            String in = "i";


        if (letter.equals(a) || letter.equals(e) || letter.equals(u) || letter.equals(o) || letter.equals(in)) {

            System.out.println("It is a vowel!");
            letter = sc.nextLine();

        }
        else{
            System.out.println("It is a consonant!");
             sc.close();
            break; 
        }
        }


        }



    }
//package fh.campus02;Ovo ne radi bas sta bi trebalo

import java.util.Scanner;

public class AriitmeticTower {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();

        for (int index = 2; index <=9; index ++){

            System.out.println(x*index);
        }
           int index1= 2;
        for (index1 = 2; index1 <=9; index1 ++){
            System.out.println(x/index1);

        }
    }
}
/*drugi nacin ovoga prije
int start value= 12;
for (int index = 2; index <=9; index ++)
System.out.println(startvalye + "* " + index);
startvalue= startvalue*i; 

for (int index = 2; index <=9; index ++)
System.out.println(startvalye + "/ " + index);
startvalue= startvalue/i; 
 */
//package fh.campus02;

import java.util.Arrays;

public class ArreyBeispiel {
    public static void main(String[] args) {
        //initialisieren
        int[] array = new int[3];
        array[0]=12;
        array[1]=56;
        array[2]=91;

        System.out.println(Arrays.toString(array));
//initialisieren mit einfuhllen
        int[] array2 = new int [] {12,17,23};
        System.out.println(Arrays.toString(array2));
//promjena vrijednosti na poziciji 2 
        array[2]=15;
        System.out.println(Arrays.toString(array));

    }
}
//package fh.campus02;

public class ArraysBeispiel2 {
    public static void main(String[] args) {
        int[] schachtel = new int[]{3, 5, 7, 9, 11, 13, 17};
        printArray(schachtel);

        System.out.println(containsNumber(3,schachtel));

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }

        }
    }

    public static boolean containsNumber(int number, int[] array) {
        boolean isContained = false;
        for (int i = 0; i < array.length; i++) {
           if(number==array[i]) {
               isContained = true;
           }
           else {
               isContained = false;

           }

        }
        return isContained;
    }
}





