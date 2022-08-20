package day24__arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.math.MathContext;

public class C08_OrtakElemanlariBulma {

    public static void main(String[] args) {


        // Soru 3:
        //iki String array olusturunuz ve
        // bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz.
        // Sonucu ekrana yazdiriniz.
        //Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
        String[] arr1={"Ali","Veli","Can","Ayse"};
        String[] arr2={"Ali","Hasan","Ayse","Enes"};

        List<String> ortakIsimler=new ArrayList<>();

        for (String each1:arr1
             ) {
            for (String each2:arr2
                 ) {
                if (each1.equalsIgnoreCase(each2)){
                    ortakIsimler.add(each1); // each2 de desek fark etmez cunku ayni olanlari lsteye ekliyoruz
                }

            }

        }

      if (ortakIsimler.isEmpty()){ // liste bossa demek (isEmty() )
          System.out.println("Hic ortak eleman yok");

      }else {
          System.out.println("Her iki arraydeki ortak isimler :"+ortakIsimler);
      }

        System.out.println(Arrays.toString(arr1)); // bunlar yine ayni kalir
        System.out.println(Arrays.toString(arr2));


    }
}
