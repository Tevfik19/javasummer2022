package alistirma.okul_Proje;

public class Ogretmen {

    private String adSoyad;
    private String tcKimlik;
    private int yas;
    private String brans;
    private String sicilNo;

    public Ogretmen(String adSoyad, String tcKimlik, int yas, String brans, String sicilNo) {
        this.adSoyad = adSoyad;
        this.tcKimlik = tcKimlik;
        this.yas = yas;
        this.brans = brans;
        this.sicilNo = sicilNo;
    }


    @Override
    public String toString() {
        return  "Adı - Soyadı : " + adSoyad +
                "\nTC Kimlik No : " + tcKimlik +
                "\nYaş : " + yas +
                "\nBransi : " + brans +
                "\nsicilNo : " + sicilNo;
    }
}
