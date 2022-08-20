package alistirma;

import java.util.Scanner;

public class A10_replitScanner {

/*
    Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

    Örnek Çıktı:

    Alan: 32

    Çevre: 24

 */
public static void main(String[] args) {

    Scanner scan =new Scanner(System.in);
    System.out.println("Lutfen dikdortgenin 1.kenarini giriniz\nLutfen dikdortgenin ikinci kenarini giriniz");

    int a=scan.nextInt();
    int b=scan.nextInt();

    int alan=a*b;
    int cevre=2*(a+b);

    System.out.println("Alan: "+alan+"\nCevre: "+cevre);
}

}
