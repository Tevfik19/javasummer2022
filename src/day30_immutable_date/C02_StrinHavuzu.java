package day30_immutable_date;

public class C02_StrinHavuzu {
    public static void main(String[] args) {

        String str1="Ali Can";
        String str2=str1+"";
        String str3=new String("Ali Can");
        String hiclik="";
        String str4=str1.concat(hiclik);
    }
}
