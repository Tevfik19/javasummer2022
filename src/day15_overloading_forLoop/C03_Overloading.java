package day15_overloading_forLoop;

public class C03_Overloading {
    public static void main(String[] args) {

   topla(4,5);//9

   topla(5.2,3); // hangi data turu uygunsa sadece o method turu  calısır

   topla(3.4,6.1);

    }
 public static void topla(int sayi1,int sayi2){

     System.out.println("iki integer in toplami :"+(sayi1+sayi2));
 }
   /*
   Bir class da parametre sayisi ve parametre data turleri ayni olan 2 method OLUSTURAMAYİZ

    public static void topla(int sayi3,int sayi4){

        System.out.println("iki integer in toplami :"+(sayi3+sayi4));
    }
    */

    public static void topla(double sayi1,int sayi2) {

        System.out.println("bir double bir ve bir   integer in toplami :" + (sayi1 + sayi2));
    }


    public static void topla(int sayi1,double sayi2) {

        System.out.println("Bir integer ve bir double  in toplami :" + (sayi1 + sayi2));
    }

    public static void topla(double sayi1,double sayi2) {

        System.out.println("iki double in toplami :" + (sayi1 + sayi2));
    }
}
