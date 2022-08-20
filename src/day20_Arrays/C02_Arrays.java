package day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
                            //bu kisim arrays in length ti dir yani uzunlugu  [0,0,0,]
        int sayilar[]=new int[3];
         //Arrys (diziler)
        System.out.println(sayilar);// [I@4dd8dc3
        // non-primitive data turlerindeki datalari
        // her zaman direk yazdiramayabiliriz
        // Arry i yazdirmak istersek Arrys class indan yardim isteriz

        System.out.println(Arrays.toString(sayilar));// [0,0,0,]

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;
        System.out.println(Arrays.toString(sayilar));// [5,3,10]

        String sinifList[]={"Ali","Ayse","Ahmet"};

        System.out.println(Arrays.toString(sinifList));// [Ali, Ayse, Ahmet]

        sinifList[1]="Hasan"; // sinifList in 1. index ini Hasan yap demek

        System.out.println(Arrays.toString(sinifList));// [Ali, Hasan, Ahmet]

        System.out.println(sinifList[1]);// sadece hasan i yazdiralim
        System.out.println(sinifList[0]);// Ali

    }
}
