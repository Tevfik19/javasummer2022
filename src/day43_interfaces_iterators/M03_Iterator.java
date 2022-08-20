package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {

        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);// [10, 20, 30 ]

        // liste deki tum elementleri INDEX KULLANMADAN 3 artirin

        for (Integer each: liste
             ) {
            each+=3;
            System.out.print(each+" ");

        }

        System.out.println("");
        System.out.println(liste);


        Iterator it1= liste.iterator();

        System.out.println(it1.next());// 10
        System.out.println(it1.next());// 20
        System.out.println(it1.next());// 30
       // System.out.println(it1.next());// 30 dan sonra element kalmadigindan next() RTE verir


        //

        Iterator it2= liste.iterator();

        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        System.out.println(liste);

        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println("yeniden liste :"+liste);

        Iterator it3= liste.iterator();

        while (it3.hasNext()){

            it3.next();
            it3.remove();
        }
        System.out.println("loop dan sonra ");
    }


}
