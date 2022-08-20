package day17_nestedForloop;

public class C06_NestedForLoop {
    public static void main(String[] args) {

        /*

        verilen String i asagidaki gibi yazdiran bir program yazalim

        input: Deniz

        D
        De
        Den
        Deni
        Deniz

         */

        String input="Deniz";

        for (int i = 1; i <=input.length() ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(input.substring(j-1,j));

            }
            System.out.println("");

        }

        for (int i = input.length()-1; i >=1 ; i--) { // bu kismi sonradan kendim ekledim azalani gormek icin
            for (int j = 1; j <=i ; j++) {
                System.out.print(input.substring(j-1,j));

            }
            System.out.println("");

        }
    }


}
