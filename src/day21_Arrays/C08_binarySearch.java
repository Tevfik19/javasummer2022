package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {

    public static void main(String[] args){

        /*
        Binary search java da elaman aramanin kisa yoludur
        ancak binary searc un calismasi icin once
        array in sirali hale getirilmesi gerekir
        eger siralama yapmadan binarySearch yaparsaniz
        sonucu bulamayabilir veya yanlis bulabilir
         */

      String[]harfler={"Y","B","D","G","O","A"};// "A" Harfi "D" den kucuk oldugundan sola bkar ve "A"bulamaz
                                               // bulamadiginin index ini -1 dondurur

      String arananHarf="A";
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));//C03 de yaptigimiz kendi metodumuzlada bulabiliriz true yazdirir
        //binarysearch bize aradigimiz elemanin index ini dondurur
        // array sirali olmadigi icin sonucu dogru bulamayabilir
        // (cunku binarysearc aramya ortadaki index den baslar aranan harf ortadaki harften buyuk se saga kucuk se sola bakar)
        //emin olmak icin once sort yapmaliyiz

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));//[A, B, D, G, O, Y] sort ten sonraki hali
        System.out.println(Arrays.binarySearch(harfler,arananHarf));// "A" nin index ini "0" dondurdu
        System.out.println(C03_Contains.contains(harfler,arananHarf));  //true yazdirir                                           // cunku sort ten sonra harler kucukten buyuge dogru siralandi

    }
}
