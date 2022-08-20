package day10_stringManipulation;

public class C06_IndexOf {
    public static void main(String[] args) {


        String str= "Java ogrenmek cok guzel";


        System.out.println(str.indexOf("o"));// 5
        System.out.println(str.indexOf('g'));// 6
        System.out.println(str.indexOf("t"));    // bana integer donduruyor
                                                // int'de yok diye bir deger bulunmuyor
                                                // 0 dersek J'nin index'idir
                                                // - bir deger donerse biz aranan string'in str'da olmadigini anlariz
                                               // Java -1 dondurmeyi tercih etmistir

    String str5="wdjwefregtıge ;dsndsvlfnvfdvdfnbtıbnnlnıtnrbştbnnnşbırbnrgy";


   // str5 de p harfi varmi ?


        if (str5.indexOf("t")==-1){

            System.out.println("str5 de istenen karekter  kullanilmamis");

        }else {
            System.out.println("str5 de  istenen karekter  kullanilmis");
        }



    }
}
