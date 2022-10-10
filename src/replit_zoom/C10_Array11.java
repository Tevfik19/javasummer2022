package replit_zoom;

public class C10_Array11 {
    public static void main(String[] args) {

          /*
    Kullanıcının gireceği iki binary sayıyı toplayan Java kodunu yazınız.
Test Data:
birinci binary number: 100010
ikinci  binary number: 110010
Beklenen Çıktı:
1010100
     */

        String binNum1 = "100010";
        String binNum2 = "110010";
        int decNum1 = binaryToDecimal(binNum1);     //  binaryden decimale donusturme methodunu cagiriyoruz
        int decNum2 = binaryToDecimal(binNum2);     //  binaryden decimale donusturme methodunu cagiriyoruz
        int decSum = decNum1 + decNum2;               // binary olarak toplam
        System.out.println(decimalToBinary(decSum)); // decimalToBinary(decSum) methodunu cagiriyoruz
    }
        public static int binaryToDecimal (String binary){ // binaryden decimale donusturme methodu
            String[] arr = binary.split("");
            int toplam = 0;
            int k = 0;
            for (int i = arr.length - 1; i >= 0; i--) { //en sagdan birler basamagindan baslamak icin kullandik
                if (arr[i].equals("1")) {
                    toplam += (int) Math.pow(2, k);//burasi 2 ustu k demek
                }
                k++;
            }
            return toplam;
        }
        public static String decimalToBinary ( int decSum){
            String tersbinary = "";
            while (decSum != 0) {          // int sayiyi
                tersbinary += decSum % 2;  // String binary
                decSum = decSum / 2;       // olarak donusturme (tersi olarak donusuyor) altta duzeltiyoruz
            }
            String duzBinarySonuc = "";                 // Stringi
            String[] str = tersbinary.split("");  // ters
            for (int i = str.length - 1; i >= 0; i--) { // cevirme
                duzBinarySonuc += str[i];               // islemi  (split yani)
            }
            return duzBinarySonuc;
        }
    }
