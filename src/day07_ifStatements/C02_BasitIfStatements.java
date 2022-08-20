package day07_ifStatements;

public class C02_BasitIfStatements {

    public static void main(String[] args) {

        int sayi=15;

        if (sayi>0){
            System.out.println("sayi pozitif");

        }
        if (sayi%2==0){
            System.out.println("sayi cift");

    }
        if (sayi%5==0) {
            System.out.println("sayi 5'in tam kati");
        }
      /*
      basit if cumleleri kodun diger parcalarından bagımsızdır
      sadece bir sart kontrol eder ,sart saglanıyorsa ,if body calısır ,yoksa calısmaz
      birden fazla basit if cumlesi varsa girilen sarta bagli olarak ,
      tumunde if body 2si calısabılır, kısmen if body si calısa bilir
      veya hıcbır if body si calısmaya bilir

       */
}}
