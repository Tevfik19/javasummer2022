package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        /* kullanıcıdan ismini soyismini ve yaşını  alıp
        girilen = seyfi çapar 34 yazdırın

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        /*
          String verileri scanner ile alirken
         next( ) : ilk bosluga kadar olan kismi(1 kelime) slir
         nextLine() :satirin sonuna kadar ne yazarsak alir
         NOT : eger ardarda birden fazla String deger alacaksak nextLine() kullanmaliyiz
         */
        String İsim=scan.nextLine();

        System.out.println("Lutfen Soyisminizi giriniz");
        String soyisim=scan.nextLine();

        System.out.println("Lutfen yaşınızı girin");

        Double yaş=scan.nextDouble();
        // girilen bilgiler = seyfi çapar 34 şeklinde yazdır
        System.out.println("Girilen bilgiler=" +İsim+","+soyisim+","+yaş);


}}
