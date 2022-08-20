package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
            /*
        Kullanicidan iki sayi alip
        bu sayilarin carpimini yazdirin
         */
        //1.adım
        Scanner scan=new Scanner(System.in);
        //2.Adım
        System.out.println("Lütfen ilk sayiyi girin ");
        //3.adım
        double sayi1=scan.nextDouble();
                //2. sayi için 2.ve 3. adımları tekrarlayın

        System.out.println("Lütfen 2.sayiyi girin" );
        double sayi2=scan.nextDouble();
        System.out.println("Girilen sayiların çarpımı : "+sayi1*sayi2);

    }
}
