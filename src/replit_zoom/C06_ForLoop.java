package replit_zoom;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

        char ch1= 'a' ;
            String name =“John came late"

        Expected Output:

        Number of a = 2
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String isim=scan.nextLine();
        System.out.println("Lutfen bir karakter giriniz");
        String karakter=scan.next();
      int sayac=0;
        for (int i = 0; i <isim.length() ; i++) {
            String a =isim.substring(i,i+1);
            if (a.equals(karakter)){
                sayac++;

            }
        }
        System.out.println(sayac);
    }
}
