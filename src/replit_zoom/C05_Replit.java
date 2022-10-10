package replit_zoom;

public class C05_Replit {
    public static void main(String[] args) {
        /*
        yazılan değerin array içerisinde arayan Java Kodu yazınız.

Array: [1551,1223,1443,1267,1789,1023,2020]

Aranan Değer:2020
Beklenen Çıktı:**True**

Copied!
Aranan Değer:2010
Beklenen Çıktı :**False**
         */

        int [] arr={1551,1223,1443,1267,1789,1023,2020};
        int arananDeger1=2020;
        int arananDeger2=2010;
        String ad2="";

        for (int i = 0; i <arr.length ; i++) {
            if (arananDeger1==arr[i]){
                System.out.println("**True**");
                 break;
            }
        }

        for (int i = 0; i <arr.length ; i++) {

            if (arananDeger2==arr[i]){
                ad2="**True**";
                break;

            }else ad2="**False**";

        }
        System.out.println(ad2);



        }


        }





