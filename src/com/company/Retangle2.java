package com.company;

public class Retangle2 {

    public static void main(String[] args) {
        int width= 0;
        int lenght = 0;
        //int circumference= 2*(width + lenght);
        //System.out.println ("Umfang von diese Rechteck ist: " + umfangRecnen(int width, int length));
        int umfang = umfangRecnen (2, 3);
         System.out.println (umfangRecnen(2, 3));

    }

    public static int umfangRecnen (int width, int lenght){ //metodhen signature
         int umfang; //u metodi mram imati ovu novu varijablu, bez nje trebalo bi da moze ali kod mene nije funkcionisalo
         umfang = 2*(width + lenght);
        return  umfang;
    }
}
