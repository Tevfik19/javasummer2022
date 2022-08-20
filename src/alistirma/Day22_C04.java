package alistirma;

public class Day22_C04 {
    public static void main(String[] args) {


        int[][]arr={ {1,2,3}, {4,5,2}, {6,3} };
        int carpim=1;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {


                    carpim *= arr[i][j];



            }

            System.out.println(carpim);
        }

        System.out.println("tum elamanlarin  carpimi :"+carpim);


    }
}


