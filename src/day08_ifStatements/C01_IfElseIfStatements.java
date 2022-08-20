package day08_ifStatements;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {

        //soru5 ) Kullanıcıdan gun ismini yazmasini isteyin.
        // Grilen isim gecerli bir gun ise gun isminin 1.,2.,3.harflerini
        // ilk harf buyuk diger ikisi kucuk olarak yazdirin,
        //gun ismi gecerli degilse "gecerli gun ismi giriniz "yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gun =scan.nextLine().toLowerCase();

        if (gun.equals("pazartesi")||gun.equals("pazar")){
            System.out.println("Paz");
        } else if (gun.equals("sali")) {
            System.out.println("Sal");

        } else if (gun.equals("carsamba")) {
            System.out.println("Car");

        } else if (gun.equals("persembe")) {
            System.out.println("Per");

        } else if (gun.equals("cuma")||gun.equals("cumartesi")) {
            System.out.println("Cum");


        }else {
            System.out.println("Lutfen gecerli bir gun ismi yaziniz");
        }


    }
}
