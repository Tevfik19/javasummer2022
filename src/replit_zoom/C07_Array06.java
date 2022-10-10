package replit_zoom;

public class C07_Array06 {

    /*
  Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

Array: [12,15,43,23,56,76,78,90,77,43]

Aranan değer:56
Beklenen Çıktı:
56 sayısı arrayin 4. elemanı

   */
    public static void main(String[] args) {


        int[] arr = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};
        int searchValue = 56;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchValue) {
                System.out.println(arr[i] + " sayisi arrayin " + i + ". elemani");
            }

        }

    }
}
