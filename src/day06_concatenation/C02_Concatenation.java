package day06_concatenation;

public class C02_Concatenation {
    public static void main(String[] args) {

          String str1="java";
          String str2="Guzeldir";
          int sayi1=5;
          int sayi2=4;

         // yukaridaki variable'lari kullanarak istenen metinleri yazdiralim

          System.out.println(str1+" "+str2+" "+sayi1+sayi2);//java Guzeldir 54
          System.out.println(str1+" "+str2+" "+(sayi1+sayi2));//java Guzeldir 9
        System.out.println(sayi1+sayi2+" "+str1);//9 java  (sayi1 ile sayi2 yi paranteze almaya gerek yok cunku ıslem soldan baslar)

        System.out.println(""+sayi1+sayi2+" "+str2);//54 Guzeldir

        System.out.println(str1.concat(str2));//javaGuzeldir
        System.out.println(str1.concat(" ").concat(str2));//java Guzeldir



    }
}