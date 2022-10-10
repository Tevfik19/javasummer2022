package lambda_functional_programming;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Fp04 {

    public static void main(String[] args) {
        System.out.println("get7den100eToplam :"+get7den100eToplam());
        System.out.println("get7den100eToplam02  :"+get7den100eToplam02());
        System.out.println("get2den11eCarpim  :"+get2den11eCarpim());
        System.out.println("faktoriyelHesapla :"+faktoriyelHesapla(5));






    }

    //1) 7'den 100'e kadar integer değerlerinin toplamını bulan bir method oluşturun.
    //1. Yol
    public static int get7den100eToplam(){
           // range(7,101) 7 dahil 101 degil
     return  IntStream.range(7,101).reduce(Math::addExact).getAsInt();


    }
    //2.yol

    public static int get7den100eToplam02(){
        // rangeClosed(7,100) 7 dahil 100 de dahil
        return  IntStream.rangeClosed(7,100).reduce(Math::addExact).getAsInt();


    }

    //2) 2'den 11'e kadar integer değerlerinin çarpımını bulan bir method oluşturun.
    public static int get2den11eCarpim(){



        return
                IntStream.rangeClosed(2,11).reduce(Math::multiplyExact).getAsInt();

    }
    //3) Verilen bir sayının faktoriyelini hesaplayan bir method oluşturun. (5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)

    public static int faktoriyelHesapla(int x){


        if(x>=0) {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        }
            System.out.println("'0' dan buyuk deger giriniz");


        return 0 ;


    }
    //4) Verilen iki sayı arasındaki çift sayıların toplamını bulan bir method oluşturun.

  //  public static int verilenIkiSayiArasindakiCiftSayilarinToplamini(int x, int y){



    }
