package day21_Arrays;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {

        /*
        split() bir array methodu degil, String method udur
        ama array dondurdugu icin bu konuda anlatiyoruz


        split() ile herhangi bir String i istedigimiz sekilde parcalara bolup
        bir array haline getiriyoruz

         */

        String str="Java, ne kadar guzel.";

       String[] kelimeler= str.split(" ");// suan bu array oldu bunu array bir variable atamaliyiz
        System.out.println(Arrays.toString(kelimeler));// [Java,, ne, kadar, guzel.]
                                                       // bosluklari sildi ve bosluklaardan parcalara ayirdi

        String[] kelimelerNe= str.split("ne");//ne yi siler ve , ile boler
        System.out.println(Arrays.toString(kelimelerNe));//[Java, , kadar guzel.]

        String[] kelimelerE= str.split("e");//
        System.out.println(Arrays.toString(kelimelerE));//[Java, n,  kadar guz, l.]

        String[] karakterler= str.split("");//tum karaktrleri , ile parcalar
        System.out.println(Arrays.toString(karakterler));//[J, a, v, a, ,,  , n, e,  , k, a, d, a, r,  , g, u, z, e, l, .]

    }
}
