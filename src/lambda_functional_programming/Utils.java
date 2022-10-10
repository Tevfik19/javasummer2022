package lambda_functional_programming;

public class Utils {

    //utils araclar kullanilacak methodlari olusturdugumuz class

    public static void ayniSatirdaBosluklaYazdir(Object obj){  // String yerine Object kullandik List de de kullanmak icin
                                                              // object hepsinin parente oldugundan hata vermez

        System.out.print(obj+" ");

    }

    public static boolean ciftElemaniSec(int x){

        return x%2==0;


    }


    public static boolean tekElemaniSec(int x){

        return x%2!=0;


    }

    public static int karesiniAl(int x){

      /*  int kare=x*x;

        return kare;

       */

        return x*x;
    }

    public static int kupunuAl(int x){

        return x*x*x;
    }

    public static double yarisiniAl(int x){

        return x/2.0;
    }
    public static boolean yedidenBuyuk(int x){ //her zaman kullanmayacagimiz icin method a gerek yok

boolean sayi=x>7;
        return x>7;
    }

    public static char sonKarekteriAl(String str){

        return str.charAt(str.length()-1);
    }

    public static char ilkKarekteriAl(String str){

        return str.charAt(0);
    }

}
