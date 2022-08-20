package alistirma;

import java.util.Scanner;

public class A08_Array {
  /*
    Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

            Array: [12,15,43,23,56,76,78,90,77,43]

    Aranan değer:56
    Beklenen Çıktı:
            56 sayısı arrayin 4. elemanı

   */

    public static void main(String[] args) {

       int []arr={12,15,43,23,56,76,78,90,77,43};
       int input=56;
       int sayac=0;
  //    for (int each:arr ) {
  //        if(input==each){
  //            System.out.println(input+" sayisi arrayin "+sayac+". elemani");
  //        }
  //        sayac++;
  //    }

        for (int i = 0; i < arr.length ; i++) {
            if (input==arr[i]){
                System.out.println(input+" sayisi arrayin "+i+". elemani");
            }
        }


    }
}
