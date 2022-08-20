package practice_Recap1;

import java.util.Scanner;

public class Q01_Modulus {

    /*

    kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basmagindaki rakamlari toplamini bulunuz

    Ex:
    input:12345
    output:12
     */
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli sayi giriniz");

        int num=scan.nextInt();

        int ilkIki=num/1000;
        int sonIki=num%100;// 100 e bolumunden kalani verir

        int ilkIkiTop =ilkIki/10+ilkIki%10;
        System.out.println("ilkIkiTop = " + ilkIkiTop);

        int sonIkiTop=sonIki/10+sonIki%10;
        System.out.println("sonIkiTop = " + sonIkiTop);

        System.out.println("sayilarin Toplami  :"+(ilkIkiTop+sonIkiTop));


    }
}
