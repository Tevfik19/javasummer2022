package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {



          /*
          array'i array yapan sembol [] idi
          arrayList de ise <> diamond(elmas) kullaniriz
         */
        List<String> isimler= new ArrayList<>();
        System.out.println(isimler);// [] (list te direk yazdirir

        // List e eleman eklemek istersek
        // add bize boolen dondurur icinde elman varsa hep true dondurur
        isimler.add("Basak");// bu sekildede ekler alttaki gibi sout un icinde de ekler(bir variable a atama yapmaya gerek yok

        System.out.println(isimler.add("Fatma"));// true dondurur

        /*
         String'de bir method calistirdigimizda
         assign yapmazsak String degismiyordu
         String isim="Suleyman"
         isim.toUpperCase(); // SULEYMAN
         sout(isim) --> Suleyman
         */

        System.out.println(isimler);//[Basak, Fatma] yukardaki isimleri ekledi ama ayri ayri

        /*
         List'in tek kotu tarafi array alt yapisini kullandigi icin
         elemanlari birer birer eklemek zorunda olmamizdir
         */
    }
}
