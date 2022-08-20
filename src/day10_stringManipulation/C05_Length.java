package day10_stringManipulation;

public class C05_Length {
    public static void main(String[] args) {

        String str= "Java ogren, isi kap";

        System.out.println(str.length());// str in karekter sayisini dondurur 19

        System.out.println(str.charAt(str.length()-1));// son karekterini yazdiralim   p

        System.out.println(str.charAt(str.length()-3));// sondan 3. karakteri yazdiralim   k
        System.out.println(str.charAt(str.length()-4));// bosluk



    /*
        Java'da null pointer (isaretleyici) bir deger degil,
        karsisina yazildigi variable'in hic bir deger almadiginin isaretcisidir
         */

        String str2="";  // str2 ye bir deger atanmis midir EVET
                         // bu deger : hiclik
        System.out.println(str2.length()); // 0

        String str3=null; // str 3 e bir deger atanmis midir HAYIR
                          // null bu deger atamayi isaret etmektedir
        System.out.println(str3.length());// bir deger atamamis ki nasil uzunlugu olsun ?
                                          // NullpointerException olarak hata verir

    }
}
