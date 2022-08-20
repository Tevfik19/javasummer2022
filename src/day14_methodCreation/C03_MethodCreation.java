package day14_methodCreation;

import day13_MethodCreation.C04_MethodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {


        // input olarak verilen isim ve soyismi
        // ilk harfi buyuk, geriye kalan harfler * olacak sekilde
        // I***** K**** seklinde yazdiran bir method olusturun


        String isim="enes";
        String soyisim="bozkurt";


        İsmiGizle(isim,soyisim);
        C02_MethodCreation.rakamlariTopla(455); // onceki methodlari cagirdik
        C01_MethodCreation.terstenYazdir("NURI");
        C04_MethodCreation.topla(5,8);
    }

   public static void İsmiGizle(String isim, String soyisim) {



        isim=isim.substring(0,1).toUpperCase()
                +isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()
                +soyisim.substring(1).replaceAll("\\w","*");
       System.out.println(isim+" "+soyisim);
    }
}
