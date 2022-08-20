package day18_While_doWhileLoop;

public class C01_WhileLoop {

    /*
        Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin.
         */
    public static void main(String[] args) {


        char ilkHarf='f';
        char sonHarf='t';

        char temp=ilkHarf;
        String buyult="";// bu atamayi char i string e cevirmek icin yptik


        while (temp<=sonHarf){

            buyult=(temp+"").toUpperCase();// burda da char primitive data oldugundan char i string e cevirdik
                                           // cunku manipulation lar non primitive lerde calisir



            System.out.print(buyult+" ");

            temp+=1;
        }

    }
}
