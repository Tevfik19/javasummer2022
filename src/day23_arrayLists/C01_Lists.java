package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {


        List<Integer> sayilar1=new ArrayList<>();

        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
                   //size (boyut) manipulation daki length gibi uzunluk da diyebiliriz ****
        System.out.println("listenin boyutu  :"+sayilar1.size());//3 (liste uzunlugu 3)
       sayilar1.add(2);
       sayilar1.addAll(sayilar1);
        System.out.println(sayilar1);// [5, 3, 2, 2, 5, 3, 2, 2]

        System.out.println("listenin yeni  boyutu  :"+sayilar1.size());// 8

        sayilar1.set(2,8);// 2.index deki 2 yi sildi yerine 8 i koydu
        System.out.println(sayilar1);//[5, 3, 8, 2, 5, 3, 2, 2]

        System.out.println(sayilar1.set(0,12));// direk sout un icine yazarsak
                               // sildigi elementi yani 5 i yazdirir

        System.out.println(sayilar1);// [12, 3, 8, 2, 5, 3, 2, 2]
        // bi altta yazinca 0.index deki 5 yerine 12 yazdi

        /*
         set method'u istenen index'deki eski elementi silip,
          yerine verdigimiz yeni elementi set eder.

          eger eski elementi silmek istemiyorsak,
          add(index,deger) method'unu kullanabiliriz

          set() sildigi eski elementi de bize dondurur
          */
}  }

