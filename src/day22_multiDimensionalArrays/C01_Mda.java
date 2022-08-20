package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Mda {

        /* tek katli arraylerde array'i direk yazdiramiyoruz
        cunku array non-primitive data turudur ve
        her non-primitive data direk yazdirilamayabilir
        ancak array'in icerisindeki elementleri direk yazdirabiliyorduk
        cunku genelde primitive data turu veya String elementler kullaniliyordu.
        Multi-dimensional array'lerde en dikkat edecegimiz konu
        ulasmak istedigimiz elementin bir array mi yoksa
        primitive data mi oldugudur
         */
        public static void main(String[] args) {
                            // distaki outer icteki inner
            int[][] sayilar= {{1,2,4,5},{3,4}};
            // array in kac katli oldugu ya [][] burdan yada suslu parantez sayisindan anlariz}}

        /*
        burada sayilar arrayini dusunursek icinde 2 tane inner array var
        sayilar[0] ==> [1,2,4,5]
        ancak en icerdeki elementlere ulasairsak direk yazdirabiliriz
         */
            System.out.println(sayilar[0]);// [I@4dd8dc3  0 inci indeex de inner array oldugundan refarans no verir
            System.out.println(Arrays.toString(sayilar[0]));// [1, 2, 4, 5]
            System.out.println(sayilar[0][1]);//2
                          // ( yani 0 inci index teki inner array in 1 inci index deki elementi)
            System.out.println(sayilar[1][0]);//3
                              // ( yani 1 inci index teki inner array in 0 inci index deki elementi)

            System.out.println(Arrays.toString(sayilar));//[[I@4dd8dc3, [I@6d03e736]
                                                      // iki inner array oldugundan yine refarans verir

            System.out.println(Arrays.deepToString(sayilar));//[[1, 2, 4, 5], [3, 4]]
                                  //deepToString le elementleri yazdirabiliriz



            /*
         array'i iki sekilde declare edebiliyorduk
         1- elemanlari direk yazabiliriz
         int[][] sayilar= {{1,2,4,5},{3,4}};
         2- outer ve inner array'lerin uzunluklarini belirterek olusturabiliriz
         int[][] sayilar= new int[3][4];
         ancak 2.yontemle yaptigimizda inner array'lerin farkli uzunlukta olma ihtimali kalmaz
         bu ornek icin outer array'in 3 tane inner array'i vardir
         her bir inner array'in ise 4 er elemani vardir
         eger inner arrayleri farkli uzunluklarda olusturmak istiyorsaniz
         mecburen 1.yontemi kullanmalisiniz
         */
        }
}
