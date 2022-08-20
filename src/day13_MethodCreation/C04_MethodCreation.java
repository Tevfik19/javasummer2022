package day13_MethodCreation;

import java.util.Scanner;

public class C04_MethodCreation {
    public static void main(String[] args) {

      // input olarak verilen 2 integer 'i toplayip
      // sonucunu yazdiran bir method olusturun

        int input1= 10;
        int input2=20;

        // Method 4 adimda olusturulur
        // 1.adim method call
        // 2. adim argument eklenmesi gerekiyorsa ekleyelim
        // eger method'un return type void'den farkli olacaksa
        // bir variable olusturup,method call' u assing edelim

        topla(input1,input2);

    }

    public static void topla(int input1, int input2) {

        // 3. adim method deklarasyonunda degistirilmesi gereken
        // bolumleri degistir(access modifier,return Type vb..)
        // 4. eger return type void disinda bir seyse
        // return keyword u ve donecek degeri hesaplamaliyiz

        System.out.println("Girilen iki sayinin toplami : " + (input1+input2));
    }
}
