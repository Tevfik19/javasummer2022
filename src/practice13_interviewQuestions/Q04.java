package practice13_interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {

    /*


 Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
 0-1-1-2-3-5-8-13-21-34....
 */

    public static void main(String[] args) {

        List<Integer> fibonacciList =new ArrayList<>();
        Scanner scan =new Scanner(System.in);
        int sayi =scan.nextInt();
        fibonacciList.add(0);
        fibonacciList.add(1);
        System.out.println("fibonacciList :"+fibonacciList);


        int i=1;// while sartini olusturmak icin kullandik

        if (sayi<=1){
            System.out.println("daha buyuk sayilar gir");


        }else {
            while (fibonacciList.get(i)<sayi){// fibonacci elemanlari sayidan kucuk oldugu surece

                fibonacciList.add(fibonacciList.get(i)+fibonacciList.get(i-1));

                i++;

            }
            System.out.println("fibonacciList :"+fibonacciList);
        }

        int sonIndextekiEleman=fibonacciList.size()-1;
        if (fibonacciList.get(sonIndextekiEleman)>sayi){
            fibonacciList.remove(sonIndextekiEleman);// burasi son elemani kaldirir
            System.out.println();


        }

    }

}