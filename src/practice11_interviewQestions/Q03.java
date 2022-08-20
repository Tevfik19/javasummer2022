package practice11_interviewQestions;

import java.util.Scanner;

public class Q03 {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan
     *  alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Bir sayi giriniz agey");
       int sayi=scan.nextInt();

       boolean asalMi=true;

       if (sayi>1){
           for (int i = 2; i <sayi ; i++) {//bolen sayilar

               if (sayi %i==0){
                   asalMi=false;
                   // break;

                   System.out.println();
               }


           }
           if (asalMi) System.out.println("sayi asaldir kirve");
           else System.out.println("sayi asal degil asal sayi gir gari");
       }else System.out.println("sayi asal degil anliyinmi ");

    }

}
