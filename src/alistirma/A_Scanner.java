package alistirma;

import java.util.Scanner;

public class A_Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Sifrenizi giriniz.");

        String sifre = input.nextLine();

        if (sifre.length()==8){

            if (!sifre.contains(" ")){

                System.out.println("gecerli sifre");

            }else if (sifre.contains(" ")){

                System.out.println("Lutfen bosluk kullanmayin");
            }

        }else System.out.println("Lutfen 8 karakter girin ");

    }
}
