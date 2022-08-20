package practice8;

import java.util.ArrayList;
import java.util.List;

public class Q03_Arraylist {
    public static void main(String[] args) {

        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */

        int[]arr={2,5,-9,45,43,11,8,102,102,47,0};

        int n=4;

        List<Integer> list=new ArrayList<>();

        //

        for (int each :arr) {
            list.add(each);

        }

    }
}
