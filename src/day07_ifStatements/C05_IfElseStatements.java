package day07_ifStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

     /*
      Kullanicidan bir karakter girmesini isteyin ve
       girilen karakterin harf olup olmadigini yazdirin
      */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir karekter giriniz :");

        char harf=scan.next().charAt(0);

        if ((harf>='a'&& harf<='z') || (harf>='A'&& harf<='Z')){
            System.out.println("Girilen karekter bir harf ");
            System.out.println("harf  : "+harf);
        } else{
            System.out.println("Girilen karekter bir harf degil ");
        }

    }
}
