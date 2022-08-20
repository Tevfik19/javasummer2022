package day07_ifStatements;

public class C01_AndOperatorleri {
    public static void main(String[] args) {

        int a=10;
        int b=15;
        int c=20;
        System.out.println(a>0 && b<20 && c>=b);//true


        System.out.println(a<0 && b<20 && c>=b);// false
        /*
         java and oparetoru konusunda bize iki secenek sunar

         && kullanırsak ilk false  buldugunda ,artık sonucun false olacagını bilir
         ve geriye kalan sartlari incelemez

         & kullanırsak tum sartları kontrol eder sonra sonucu belirler
         bu calısma usulunden dolayı & oparetoru , && oparetorune gore daha yavas olabılır



         */
        System.out.println(a<0 & b<20 & c>=b ); // false
    }
}
