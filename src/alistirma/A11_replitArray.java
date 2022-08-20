package alistirma;

import java.util.Arrays;

public class A11_replitArray {
  /*  Karışık verilen sayıları ve kelimeleri sıralayan Java kodunun yazınız.

            not: Test datadaki değerleri kullanınız.

    Test Data:
            [1232, 1134,2345,1022]
            [Java, Python, PHP, C#, C Programming, C++]
    Beklenen Çıktı:
            [1022,1134,1232,2345]
            [C Programming, C#, C++, Java, PHP, Python]

   */
  public static void main(String[] args) {


      int[] arr = {1232, 1134, 2345, 1022};

      String[] arr1 = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};


      Arrays.sort(arr);
      Arrays.sort(arr1);

      System.out.println(Arrays.toString(arr)+"\n"+Arrays.toString(arr1));
  }
}
