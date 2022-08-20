package practice12_okulProje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class islemler {

   static List<Kisi> ogrtmnList=new ArrayList<>();
   static List<Kisi> ogrncList=new ArrayList<>();
   static String kisiTuru;
   static Scanner scan =new Scanner(System.in);
   // static yazmamizin sebebi tum methodlardan ulasmak icin
    // gokteki ay gibi heryerden ulasilabilsin



    public static void girisPaneli(){

        System.out.println("====================================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("Q- ÇIKIŞ");


        String secim=scan.next().toUpperCase(); // kullanici kucuk harf girse bile
                                              // buyuk harfe cevirdik cunku kontrol buyuk harfle yapcaz


        switch (secim){
            case "1":
                islemMenusu();
                kisiTuru="OGRENCİ";

                break;
            case "2":
                islemMenusu();
                kisiTuru="OGRETMEN";

                break;
            case "Q":

                break;
            default:
                System.out.println("hatali giris :");
                girisPaneli();
                break;
        }
    }

    private static void islemMenusu() {

        System.out.println("sectigin kisi turu "+kisiTuru+" lutfen asagidaki islemleri seciniz");


        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         0-ÇIKIŞ");

        System.out.println("islem tercihinizi giriniz");
        int secilenIslem= scan.nextInt();

        switch (secilenIslem) {
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                listeleme();
                islemMenusu();
                break;
            case 4:
                //silme();
                islemMenusu();
                break;
            case 5:
                girisPaneli();//yani ana menu
                break;
            case 0:
                //cikis();
                break;
            default:
                System.out.println("guzel birsey gir");
                islemMenusu();
                break;
        }
    }

    private static void listeleme() {
        System.out.println("**** "+ kisiTuru+" listeleme sayfasina hosgeldin");
        if (kisiTuru.equalsIgnoreCase("OGRENCİ")){
            System.out.println("ogrncList :"+ogrncList);
        }else {
            for (Kisi each:ogrtmnList) {

                System.out.println("each.toString() :"+each.toString());

            }
        }


    }

    private static void arama() {
        System.out.println("**** "+ kisiTuru+" arama sayfasina hosgeldin");

        boolean flag =true;//

        if (kisiTuru.equalsIgnoreCase("OGRENCİ")){ //

            // dummy
            System.out.println("kimlik no giriniz");
            String arananKimlikNo=scan.next().replaceAll(" ","");//

            for (Kisi w:ogrncList) {

                if (w.getKimlikNo().equals(arananKimlikNo)){//
                    System.out.println("aradiginiz ogrenci "+w.getAdSoyad());

                    flag=false;


                }

            }if (flag){
                System.out.println("aranan ");


            }

        }



    }

    private static void ekle() {//bu method hem ogrenci hem de ogretmen eklemek icin tasarlandi
        System.out.println("**** "+ kisiTuru+" ekleme sayfasina hosgeldin");
        System.out.println("isim soyisim gir");
        String adSoyad=scan.nextLine();
        scan.nextLine();
        System.out.println("kimlik gir");
        String kimliNo=scan.nextLine();
        System.out.println("yas gir");
        int yas=scan.nextInt();
        if (kisiTuru.equals("OGRENCI")){//TODO sonra doldur
        }else{
            System.out.println("bolum gir");
            String bolum= scan.nextLine();
            scan.nextLine();//dummy6 kod hata almamak icin
            System.out.println("sicil no gir");
            String sicilNo= scan.nextLine();
           Ogretmen ogretmen=new Ogretmen(adSoyad,kimliNo,yas,bolum,sicilNo);
           ogrtmnList.add(ogretmen);
            System.out.println(ogrtmnList);
        }
    }

    }

