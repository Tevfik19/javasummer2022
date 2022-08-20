package alistirma.okul_Proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Ogrenci> ogrenciList=new ArrayList<>();
    static List<Ogrenci> ogretmenList=new ArrayList<>();
    static Scanner scan =new Scanner(System.in);
    static String kisiTuru;

    public static void anaMenu(){ // ANA MENÜ

        System.out.println("###################################");
        System.out.println("## OKUL YÖNETİM PANELİ  ANA MENÜ ##");
        System.out.println("###################################");
        System.out.println("###### 1- ÖĞRENCİ İŞLEMLERİ  ######");
        System.out.println("###### 2- ÖĞRETMEN İŞLEMLERİ  #####");
        System.out.println("###########    Q- ÇIKIŞ  ##########");
        System.out.println("###################################");
        System.out.print("Seçiminiz :  ");
        String secim = scan.next().toUpperCase();

        switch (secim){
            case "1":
                kisiTuru:
                break;
            case "2":
                break;
            case "Q":
                break;


            default:
                System.out.println("Hatali giris yaptın");
                break;
        }




    } // ANA MENÜ SONU


    public static void islemlerMenusu(){

        System.out.println("#####################################");
        System.out.println("##### " + kisiTuru + "  İŞLEMLERİ MENÜSÜ #####");
        System.out.println("#####################################");
        System.out.println("#########  1-KAYIT EKLEME  ##########");
        System.out.println("#########  2-KAYIT ARAMA  ###########");
        System.out.println("#########  3-KAYIT LİSTELEME  #######");
        System.out.println("#########  4-KAYIT SİLME  ###########");
        System.out.println("#########  5-ANA MENÜ  ##############");
        System.out.println("#########  0-ÇIKIŞ  #################");

        System.out.print("Bir Seçim Yapınız :");
        int secilenIslem = scan.nextInt();

        switch (secilenIslem){

            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4 :

                break;
            case 5:

                break;
            case 0:

                break;

            default:
                break;

        }

    }//ISLEMLER MENUSU

    private static void kayitEkle(){


            System.out.println("##########################");
            System.out.println("###### KAYIT EKLEME ######");
            System.out.println("##########################");
            if (kisiTuru.equals("OGRENCI")) {
                scan.nextLine();
                System.out.print("Öğrencinin Adı- Soyadı : ");
                String ogrenciAdi = scan.nextLine();
                System.out.print("Öğrencinin Tc No : ");
                String ogrenciTcNo = scan.nextLine();
                System.out.print("Öğrencinin Yaşı : ");
                int ogrenciYasi = scan.nextInt();
                scan.nextLine(); // dumy;  sout hatası almamak için
                System.out.print("Öğrencinin Sınıfı : ");
                String ogrenciSinifi = scan.nextLine();
                System.out.print("Öğrencinin Numarası : ");
                String ogrenciNo = scan.nextLine();

                Ogrenci ogrenci=new Ogrenci(ogrenciAdi,ogrenciTcNo,ogrenciYasi,ogrenciNo,ogrenciSinifi);
ogrenciList.add(ogrenci);
            } else {
                scan.nextLine();
                System.out.print("Öğretmenin Adı- Soyadı : ");
                String ogretmenAdi = scan.nextLine();
                System.out.print("Öğretmenin Tc No : ");
                String ogretmenTcNo = scan.nextLine();
                System.out.print("Öğretmenin  Yaşı : ");
                int ogretmenYasi = scan.nextInt();
                System.out.print("Öğretmenin  Branşı : ");
                String ogretmenBrans = scan.nextLine();
                scan.nextLine();
                System.out.print("Öğretmenin  Sicil No : ");
                String ogretmenSicil = scan.nextLine();

                Ogretmen ogretmen=new Ogretmen(ogretmenAdi,ogretmenTcNo,ogretmenYasi,ogretmenBrans,ogretmenSicil);
                

            }
        }// kayıt ekleme sonu
    }



