package day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {

        /*
        binarySearch method u siralanmis array de aradigimiz elementin index ini dondurur

        ya aradigimiz element arrayde yoksa ?
        (String de indexof() bize olmayan elementler icin -1 donduruyordu )
        aradigimiz element arrayde yoksa java hem olmadigini
        hemde olsaydi nerede olacagini bize dondurur

        olmadigini ifade icin  -(eksi) kullanir
        olsaydi nerde olacagini bize  sayi hangi sirada ise index olarak degil
         rakam olarak 1 den baslar hangi sirada ise onu yazar




         */
        int[]sayilar={3,7,15,4,27,10};

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));// [3, 4, 7, 10, 15, 27]

        System.out.println(Arrays.binarySearch(sayilar,4));//1 (4 un bulumdugu index )
        System.out.println(Arrays.binarySearch(sayilar,15));//4 (15 in bulumdugu index )
        System.out.println(Arrays.binarySearch(sayilar,11));//olsaydi 10 dansonra olurdu yani 3,4,7,10,11
                                                                // 5. sirada olurdu der ve -5 yazar
        System.out.println(Arrays.binarySearch(sayilar,6));// -3 yazar
        System.out.println(Arrays.binarySearch(sayilar,-100));//-100 ilk sirada olacaindan -1 yazar

    }
}
