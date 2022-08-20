package day16_forLoop;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {

        /*
         Soru 6)  Interview qestion Kullanicidan 100 den kucuk bir tamsayi isteyin
          1 den baslayarak girilen sayiya kadar tum sayilari yazdirin .
         Ancak ;
         - Sayi 3 un kati ise sayi yerine "Java" yazdirin .
         - Sayi 5 in kati ise sayi yerine "Guzeldir" yazdirin
         - Sayi hem 3 un hem 5 in kati ise sayi yerine " Java Guzeldir" yazdirn .

         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen 100 den kucuk bir pozitif tamsayi giriniz ");
        int sayi=scan.nextInt();

        if (sayi<1||sayi>100){  // bu kismi ben ekledim kullanici 100 ile 0 arasinda isim girmesi icin
            System.out.println("Gecersiz sayi Lutfen 100 den kucuk bir pozitif tamsayi giriniz");
        }else {

        for (int i = 1; i <=sayi ; i++) {
            if (i%3==0 && i%5==0){
                System.out.println(" Java Guzeldir"+" ");
            } else if (i%5==0) {
                System.out.print("Guzeldir"+" ");


           }   else if (i%3==0) {
                System.out.print("Java"+" ");

            }else {
                System.out.print(i+" ");// girilen sayiya kadar tum sayilari yazdirin dedigi icin burayi ekledik
            } }

        }
        }
}
