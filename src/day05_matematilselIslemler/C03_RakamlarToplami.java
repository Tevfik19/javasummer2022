package day05_matematilselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static <Scaner> void main(String[] args) {

      //kullanıcıdan 4 basamaklı bir sayi alın ve rakamlar toplamını bulup yazdırı
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("lutfen 4 basamaklı pozitifbir tamsayi giriniz");

        int sayi=scan.nextInt(); // 5267
         int birlerBasamaği;
         int rakamlarToplamı=0;
         int ilkgirilensayi=sayi;

      //suanda sayi 5267

         birlerBasamaği=sayi%10;//7
         rakamlarToplamı+=birlerBasamaği;
         sayi/=10;

         //suanda sayi 526 bb 7 rt 7

        birlerBasamaği=sayi%10; //6
        rakamlarToplamı+=birlerBasamaği; //7+6=13
                sayi/=10;  // 52
        //suan sayi 52 bb 2 rt 13

        birlerBasamaği=sayi%10; // 2
        rakamlarToplamı+=birlerBasamaği;//13+2 =15
        sayi/=10;  // 5

        // suan sayi 5 bb 2 rt 15

        birlerBasamaği=sayi%10; //5
        rakamlarToplamı+=birlerBasamaği;  //15+5=20
        sayi/=10; //0
        // suan sayi 0 bb 5 rt 20

        System.out.println(ilkgirilensayi+"  sayının rakamlar toplamı  : " + rakamlarToplamı);







    }
}
