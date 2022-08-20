package day16_forLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

        /*
        soru 10) Kullanicidan iki sayi isteyin .
        Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
        sonucu yazdiran bir method yaziniz


         */
        Scanner scanner =new Scanner(System.in);
        System.out.println("lutfen baslangic ve bitis degerlerini pozitif tamsayi olarak giriniz ");
       int bas=scanner.nextInt();
       int bitis=scanner.nextInt();

       aralariTopla(bas,bitis);



    }

   public static void aralariTopla(int bas, int bitis) {

       int toplam=0;
       if (bas<=bitis){
           for (int i = bas; i <=bitis ; i++) {
               toplam+=i;

           }
       }else {
           for (int i = bitis; i <=bas ; i++) {  // burda bitis baslangictan kucuk olacagi icin bitisi once yazdik
               toplam+=i;                               // bas i once yazsa idik i-- kullanmaliyiz
                                                        //   for (int i = bas; i <=bitis ; i--)


           }
       }
       System.out.println("Aradaki sayilarin toplami :"+toplam);
    }
}
