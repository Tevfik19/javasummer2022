package day10_stringManipulation;

import java.util.Locale;

public class C02_ToLowerCase_ToUpperCase {
    public static void main(String[] args) {

        String str= "Beni psikopata baglamayin";
        System.out.println(str.toUpperCase()); // BENI PSIKOPATA BAGLAMAYIN
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));

        /*

        Eger buyuk-kucuk harf donusumunde local bir dili esas almak isterseniz
        bu method kullanilabilir
         */

    }

}
