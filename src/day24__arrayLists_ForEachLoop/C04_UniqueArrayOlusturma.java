package day24__arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_UniqueArrayOlusturma {
    public static void main(String[] args) {

        // Soru 2) Verilen bir array’deki tekrar eden elementleri tek bir defa barindiran
        // yeni bir array olarak donduren bir method olusturun
        int[] arr ={2,3,5,6,3,5,4,1,9,6,3,5,5};

        int[] unıqueArray= uniqueArrayOlustur(arr);

        System.out.println(Arrays.toString(unıqueArray));

    }

    private static int[] uniqueArrayOlustur(int[] arr) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        List<Integer> benzersizList = new ArrayList<>();
        // yanindaki elemente esit olmayanlari listeye ekliyor
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] != arr[i + 1]) {
                benzersizList.add(i);
            }
        }
        // son elementi kontrol edip,yoksa listeye ekliyor
        if (!benzersizList.contains(arr[arr.length - 1])) {
            benzersizList.add(arr[arr.length - 1]);
        }
        // benzersiz list ===>1,2,3,4,5,6,9
        // benzersiz listenin size bilgisini kullanarak bir array olusturduk
        int[] tekrarsizArr = new int[benzersizList.size()];

        // bezersiz listedeki tum elemanlari, yeni array e atadik
        for (int i = 0; i < tekrarsizArr.length; i++) {
            tekrarsizArr[i] = benzersizList.get(i);




        }
        //olusturdugumuz yeni array i main method a dondurduk
        return tekrarsizArr;

    }
}
