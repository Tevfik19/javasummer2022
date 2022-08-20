package day07_ifStatements;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {
       /*
       soru-3  Kullanicidan yasini sorun, eger yas 65'den kucuk ise "emekli olamazsin, calismalisin",
        65'e esit veya buyukse  "Emekli olabilirsin" yazdirin


        */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        double yas=scan.nextDouble();

        if (yas<65){
            System.out.println("emekli olamazsin"+(65-yas)+" calismalisin "); //istersek kac yıl daha calısması
                                                                              //gerektıgını 65-yas ı cıkararak bulabiliriz

        }else{
            System.out.println("Emekli olabilirsin ");

        }
    }
}
