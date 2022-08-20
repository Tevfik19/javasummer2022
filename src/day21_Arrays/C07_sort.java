package day21_Arrays;

import java.util.Arrays;

public class C07_sort {
    public static void main(String[] args) {

        int[]sayilar={5,7,1,6,4,3,9};
        //(natural int se kucukten buyuge String se harf sirasina gore demek)
        // Array i Arrays class ini kullanarak natural sirali hale getirebiliriz

             //sirala
        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar));//[1, 3, 4, 5, 6, 7, 9]


    }
}
