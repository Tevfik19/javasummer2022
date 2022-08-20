package day19_scope;

public class C03_ClassVariables {

    public static void main(String[] args) {
        /*
        Farkli bir class da calisirken
        her hangi bir class adini yazip . ya basarak
        adini yazdigimiz class daki tum STATIC class uyelerini gorrebilir
        ve kullanabiliriz
         */
        C02_StaticVariable.staticMethod();//10
        System.out.println(C02_StaticVariable.staticSayi);//10
        System.out.println(C02_StaticVariable.degersizStaticVar);//
        /*
        Class level variable lara deger atayip atamamak bize kalmistir
        istersek deger atamasi yapariz ,istemezsek deger atamayiz
        eger deger atamissak java atadigimiz o degeri kabul eder
        deger atamazsak java bu variable  lara  default bir deger atamasi yapar

        int---> 0
        String -->null
        boolean-->false
        char--->''(hiclik)

         */

        /*
        baska class daki istance variable lara obje olusturarak ulasabiliriz
         */

        C02_StaticVariable obje1=new C02_StaticVariable();
        obje1.staticOlmayanMethod();//10
        //bu method icinde staticSayi=20 oldu
        System.out.println(obje1.isim);//mehmet
        System.out.println(obje1.degersizInstanceVariable);//0 default deger int icin


        System.out.println(C02_StaticVariable.staticSayi);// 20 cunku yukarda cagirdigim
        /*
        Farkli bir class dan C02 classindan method ve variable lari kullandigimda
        C02 class inin tamami degil sadece benim cagirdigim class uyeleri calisir
         */







        
    }
}
