package day09_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        //soru4) kullanicidan bir sayi alin sayi pozitifse "Sayi Pozitif" yazdirin
        // negatifse sayinin karesini yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz ");
        double sayi=scan.nextDouble();

        // Eger ternary icindeki sonuclar farkli data turlerinden ise
        // atama yapamaz, sadece yazdirir
       // double sonuc= sayi>0 ?"Sayi Pozitif" :(sayi*sayi);

        System.out.println(sayi>0 ?"Sayi Pozitif" :(sayi*sayi));
    }
}
