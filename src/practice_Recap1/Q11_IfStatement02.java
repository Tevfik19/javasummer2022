package practice_Recap1;

public class Q11_IfStatement02 {
    /*
    not  hesaplayici

         A=>90 ~100
         B=>80 ~89
         C=>70 ~79
         D=>60 ~69
         F=>0 ~59

    */

    public static void main(String[] args) {


        int not=50;

        if (not>=90&& not<=100){
            System.out.println("A");

        } else if (not>=80&&not<90) {  // İSTERSEK burdan itibaren sadece not >=80 yazsak yeterli olur
                                       // cunki 90 ustu zaten ustteki if e girer
            System.out.println("B");

        } else if (not>=70&&not<80) {
            System.out.println("C");

        } else if (not>=60&&not<70) {
            System.out.println("D");

        }else{
            System.out.println("F"); // eksi degerler icin en son bi else daha ekleyip not<0||not>100
        }                            // diyerek gecersiz not diyebiliriz

    }
}
