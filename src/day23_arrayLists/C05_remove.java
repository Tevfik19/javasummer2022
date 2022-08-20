package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_remove {
    public static void main(String[] args) {

        List<Integer> sayilar1=new ArrayList<>();

        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        sayilar1.add(1);

        System.out.println(sayilar1);// [5, 3, 2]

        System.out.println(sayilar1.remove(1));// 3 ( obje 1 degil 1. index deki 3 u siler)

        // Sayilardan olusan bir list varsa
        //  java remove method unda sayi yazdigimizda direk index olarak kabul eder

        System.out.println(sayilar1);// [5, 2, 1]



        /* silinecek objeyi bir variable a tanimlayabiliriz
          int sil1=1; // int bir data ya atarsak yine index olarak gorur
         sayilar1.remove(sil1); 1. index deki 2 yi siler
          System.out.println(sayilar1);
        */
        // illa 5 i silmek istersek
      Integer sil=5;// int degil Integer kullaniriz

      sayilar1.remove(sil);
        System.out.println(sayilar1);

        // veya indexOf method undan yardim alabiliriz


        System.out.println(sayilar1.remove(sayilar1.indexOf(2)));//
        // direk sout da yazdirirsak sildigi elemani donduru

        System.out.println(sayilar1);// [1]

        // 2 yi silmek icin 2 nin index ini bulup, onu siler






    }
}
