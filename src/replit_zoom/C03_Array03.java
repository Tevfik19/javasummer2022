package replit_zoom;

public class C03_Array03 {
    public static void main(String[] args) {
/*
        Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

                Array = [20, 30, 25, 35, -16, 60, -100 ]

        Beklenen Çıktı:

        Copied!
                Array Sayılarının ortalaması: 7.0

 */
        int[] arr={20, 30, 25, 35, -16, 60, -100};

        int temp=0;

        for (int i = 0; i <arr.length ; i++) {
            temp+=arr[i];

        }

       double ort=temp/arr.length;

        System.out.println(ort);


    }
}
