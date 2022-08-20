package day24__arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturma {
    public static void main(String[] args) {

         /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazalim
         */
        //Random ( Rasgele sayi ureten bir program )
        Random rnd=new Random();
        int sayi=0;
        List<Integer> sayiListesi=new ArrayList<>();

        while (sayiListesi.size()<200){

            sayi= rnd.nextInt(1000);
            if (!sayiListesi.contains(sayi)){
                sayiListesi.add(sayi);

            }

        }

        System.out.println(sayiListesi);
        boolean bildinMi=false;
        int tahminSayisi=0;

        Scanner scan=new Scanner(System.in);


        while (!bildinMi){// bildinmi==false busekildede yazilabilir
         // while in ici her zaman true olmali bu yuzden false degil ini kullandik
            System.out.println("Lutfen bir sayi tahminde bulunun");
            sayi=scan.nextInt();
            tahminSayisi++;
            if (sayiListesi.contains(sayi)){
                System.out.println("Tebrikler"+tahminSayisi+" adet tahminde listeden bir sayi bildiniz ");
                bildinMi=true;

            }else {
                System.out.println(tahminSayisi+" adet sayi soylediniz ama hicbiri listede yok");


            }

        }




    }
}
