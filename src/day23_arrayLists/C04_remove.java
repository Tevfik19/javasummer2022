package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {


        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");



        /*
         remove method'u iki sekilde kullanilir
         1- objeyi yazip silmesini istersek bize boolean sonuc doner true/false
         2- index girersek o index'deki elemani siler ve bize silinen elemani dondurur
         */

        System.out.println(urunler);//[Nutella, Ikram, Cekirdek, Cay]
        System.out.println(urunler.remove("Ikram"));//true (urunu sildigini belirten true yazar
        System.out.println(urunler);//[Nutella, Cekirdek, Cay]  (Ikram silindi


        System.out.println(urunler.remove("Hobby"));//false (bu urun listede oladigi icin silemez ve false yazar
        System.out.println(urunler);//[Nutella, Cekirdek, Cay] (liste degismedi


        // iknci yontemi deneyeli index girelim

        System.out.println(urunler.remove(1));// Cekirdek (1. index teki sildgi urunu dondurur
        System.out.println(urunler);// [Nutella, Cay] (Cekirdek silindi

        //olmayan bir index i silmeye calisirsak
       // System.out.println(urunler.remove(3)); (IndexOutOfBoundsException)


    }
}
