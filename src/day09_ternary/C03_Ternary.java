package day09_ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {


       // kullanicidan bir sayi alin sayi pozitifse Sayiyi yazdirin
        //sayi sifir yada negatifse,bir sayi daha isteyin ve ikisinin carpimini yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz ");
        double sayi=scan.nextDouble();

        // once soruyu if else ile yapalim

        if (sayi>0){
            System.out.println(sayi);
        }else {
            System.out.println("Lutfen bir sayi daha girin");
            double sayi2=scan.nextDouble();
            System.out.println(sayi*sayi2);

        }
          // Eger if else icerisinde yeni kodlar varsa
        // ternary ile yapmamiz mumkun olmaz

    }
}
