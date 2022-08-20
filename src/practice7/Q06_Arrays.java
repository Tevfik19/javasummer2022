package practice7;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_Arrays {
    public static void main(String[] args) {

        /*

   kullanıcının girdigi bir array'in en buyuk elemani ile
   en kucuk elemanının  farkını bulan bir method create ediniz.
*/

        farkiniBul();
    }

    private static void farkiniBul() {

        Scanner scanner=new Scanner(System.in);
        System.out.println("array uzunlugu giriniz  :");
        int uzunluk =scanner.nextInt();
        int arr[]=new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("arrayin "+(i+1)+". elamani giriniz  : ");//
            arr[i]=scanner.nextInt();

        }

        Arrays.sort(arr);
        System.out.println("arraydeki enbuyuk elaman ile en kucuk elaman arasindaki fark :"+(arr[uzunluk-1]-arr[0]));

    }
}
