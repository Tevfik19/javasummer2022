package day08_ifStatements;

import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {
      /*  Kullanicidan 4 basamakli bir sayi girmesini isteyin.Girdigi sayi 5'e bolunuyorsa son rakamini kontrol edin.
        Son rakami 0 ise "5'e bolunen cift sayi" yazdirin
        son rakami 0 degilse "5'e bolunen tek sayi" yazdirin
        Girdigi password 5'e bolunmuyorsa ekrana "Tekrar deneyin"yazdirin
                */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen 4 basamakli bir sayi giriniz : ");
        int sayi=scan.nextInt();

        // sayinin 5 e bolunup bolunmemesi
        // sayinin son basamaginin sifir olup olmamasi

        if (sayi>=1000 && sayi<10000 && sayi%5==0){
            if (sayi%10==0){
                System.out.println("5'e bolunen cift sayi");

            }else {
                System.out.println("5'e bolunen tek sayi");
            }

        }else {
            System.out.println("Tekrar deneyin");
        }
    }
}
