package day08_ifStatements;

import java.util.Scanner;

public class C05_NestedIfElse {
    public static void main(String[] args) {

      /*
       Soru11) Nested if kullanarak soruyu cozen kod yazınız.
       kullanıcıdan bir sifre girmesini isteyin
       eger ilk harf buyuk harf ise "A" olup olmadıgını kontrol edin.
       ilk harf "A " ise "Gcerli sifre"  degilse "gecersiz sifre" yazdirin

       Eger ilk harfkucuk harf ise "z" olup olmadigini kontrol edin .
       ilk harf "z" ise "Gecerli sifre" degilse "GEcersiz sifre " yazdirin.

        */

        // ilk harf buyuk mu kucukmu?
        // ilk har "A" veya "z" mi ?

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre =scan.nextLine();
        char ilkHarf=sifre.charAt(0);

        if (ilkHarf>='A'&& ilkHarf<='Z'){
            if (ilkHarf=='A'){
                System.out.println("Gecerli sifre");
            }else {
                System.out.println("Gecersiz sifre");
            }

        } else if (ilkHarf>='a'&& ilkHarf<='z') {
            if (ilkHarf=='z'){
                System.out.println("Gecerli sifre");

            }else {
                System.out.println("Gecersiz sifre");
            }


        }else {
            System.out.println("İlk karekter icin  harf kullanin ");
        }


    }
}
