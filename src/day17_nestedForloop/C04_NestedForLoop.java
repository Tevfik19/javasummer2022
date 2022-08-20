package day17_nestedForloop;

import java.util.Scanner;

public class C04_NestedForLoop {
    /*
    VErilen input a gore *lardan olusan bir ucgen olusturun
    ornek input =4 ise

    *
    * *
    * * *
    * * * *

     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kac satir olacagini giriniz");
        int input=scan.nextInt();

       // int input=4; bu sekilde deger atayarakta yapabiliriz

        for (int i = 1; i <=input ; i++) { // dis loop outer loop
            for (int j = 1; j <=i ; j++) { // ic loo iner loop
                                          // burda i ye kadar cunku her satir kainci sutunsa o kadar yazilmis
                System.out.print("* ");
            }
            System.out.println("");
        }
    }







}
