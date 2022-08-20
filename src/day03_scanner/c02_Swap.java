package day03_scanner;

public class c02_Swap {
    public static void main(String[] args) {
        /*  1-Verilen sayi1 ve sayi2 variable ların degerini degiştiren (SWAP) bir
         program yazınız
                 Orn      sayi1=10 ve sayi2=20;

                          kod çalıştıktan sonra
                             sayi1=20 ve sayi2=10

             2-Verrilen sayi1 ve sayı2 variable ların degerini 3.bir variable olmadan
             degiştiren (SWAP) bir program yapınız
         */
        int sayi1=10;
        int sayi2=20;
        int sayi3=0;
        //sayi3 geçici kovamız
        //adım1 sayi2 yi boş kovaya koyalım
        sayi3=sayi2;   // 10   20   20
      // adım2- 1.sayıyı 2.sayıya atayacagız
      sayi2=sayi1;  // 10  10   20
      // adım3- boş kovadaki sayıyı sayi1 e atayalım
      sayi1=sayi3;  //  20   10  20
        System.out.println("swap dan sonra sayi1 :"+sayi1);  // 20
        System.out.println("sawap dan sonra sayi2 :"+sayi2);  // 10

    }
}
