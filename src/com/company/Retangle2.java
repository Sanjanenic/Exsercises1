package com.company;

public class Retangle2 {

    public static void main(String[] args) {
        //deklaracija varijabli -nisu jos koristene
        int width;
        int lenght ;

        //deklaracija varijable pozivanjem metode

        int umfang = umfangRecnen (2, 3);

        //isprintaj novi rezultat sa datim vrijednostima parametara
         System.out.println (umfangRecnen(2, 3));

         //inicijalizacija varijabli
        width=9;
        lenght =89;

        umfang = umfangRecnen(width, lenght);
        System.out.println (umfang);
    }

    public static int umfangRecnen (int width, int lenght){ //metodhen signature,ovdje se parmateri i metoda ne moraju zvati isto kao u main gdje su inizijalizovani
         int umfang; //u metodi mram imati ovu novu varijablu, bez nje trebalo bi da moze ali kod mene nije funkcionisalo
         umfang = 2*(width + lenght);
        return  umfang;
    }
}
