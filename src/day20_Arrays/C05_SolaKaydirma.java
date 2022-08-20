package day20_Arrays;

import java.util.Arrays;

public class C05_SolaKaydirma {
    public static void main(String[] args) {

        /*
        soru 1) verilen 3 elamanli bir array in
        tum elamanlarini bir soldaki konuma tasiyacak bir program yazin

        ornek : array [1,2,3] ise output [2,3,1] olacak

         */

        int arr[]={1,2,3,4,5};

        int temp=arr[0];
                          // asagida i+1 degeri alabilmesi icin length-1 dedik
        for (int i = 0; i < arr.length-1 ; i++) {

            arr[i]=arr[i+1];

        }

        arr[arr.length-1]=temp;

        System.out.println(Arrays.toString(arr));  // [2, 3, 4, 5, 1]

        // yukarida degistirdigimiz array i
        // ilk durumuna getirmek icin saga kaydiralim

        temp=arr[arr.length-1];

        for (int i = arr.length-1; i >0 ; i--) {

            arr[i]=arr[i-1];

        }
        arr[0]=temp; // bu kez de sonda olan temp i 0 inci index e atayarak basa aldik
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]
    }
}
