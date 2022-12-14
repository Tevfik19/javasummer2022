package alistirma;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class A_Fp01 {

    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();

        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);

        listElemanlariniYazdirStructured(liste);

        System.out.println();
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirStructured(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);
        System.out.println();
        getYedidenBuyukCiftMin(liste);



    }




    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    public static void listElemanlariniYazdirStructured(List<Integer>list){

            for (Integer w : list){

                System.out.print(w+" ");

            }
    }

    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun(Functional)

    public static void listElemanlariniYazdirFunctional(List<Integer>list){

        list.stream().forEach(t-> System.out.print(t+" "));


    }

    //2)Çift sayı olan list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    public static void ciftElemanlariYazdirStructured(List<Integer> list){

        for (Integer w:list
             ) {
            if (w%2==0){
                System.out.print(w+" ");
            }

        }
    }

    //2)Çift sayı olan çift list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void ciftElemanlariYazdirFunctional(List<Integer>list){

        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
    }

    //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYazdir(List<Integer>list){

        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));


    }

    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer>list){

        list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
    }

    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.
public static void tekrarsizCiftElemanlarinKareToplami(List<Integer>list){

    System.out.println( list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u));

    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun

    public static void tekrarsızCiftElemanlarınKüpününCarpımı(List<Integer>list){

        Integer carpim= list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);

        System.out.println(carpim);
    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

    public static void getMaxEleman01(List<Integer>list){


        Integer max=list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)-> t>u ? t:u);
        //  list.stream().reduce(list.get(0),(t,u)-> t>u ? t :u); get methodu ile de yapilabilir

        System.out.println(max);

    }

    // 2.yol

    public static void getMaxEleman02(List<Integer>list){

        // Integer max= list.stream().distinct().sorted().reduce(Integer.MAX_VALUE,(t,u)->u);
        //  System.out.println(max);
        Integer max= list.stream().distinct().sorted().reduce(list.get(0),(t,u)->u);
        System.out.println(max);
    }


    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.

    //1. Yol:

    public static void getYedidenBuyukCiftMin(List<Integer> list){

       Integer min = list.stream().distinct().filter(t->t%2==0).filter(t->t>7).reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t : u);

        System.out.println(min);
    }

    public static void getYedidenBuyukCiftMin2(List<Integer> list){

        list.stream().distinct().filter(t->t%2==0).filter(t-> t>7).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);
                                                                  // Comparator.reverseOrder() terten buyukten kucuge siralar


    }










}
