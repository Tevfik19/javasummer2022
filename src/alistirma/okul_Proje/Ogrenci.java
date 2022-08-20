package alistirma.okul_Proje;

public class Ogrenci {

    private String adSoyad;
    private String tcKimlik;
    private int yas;
    private String ogrenciNo;
    private String sinif;

    public Ogrenci(String adSoyad, String tcKimlik, int yas, String ogreciNo, String sinif) {
        this.adSoyad = adSoyad;
        this.tcKimlik = tcKimlik;
        this.yas = yas;
        this.ogrenciNo = ogreciNo;
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return  "Adı - Soyadı : " + adSoyad +
                "\nTC Kimlik No : " + tcKimlik +
                "\nYaş : " + yas +
                "\nÖğrenci No : " + ogrenciNo +
                "\nSınıf : " + sinif;
    }
}
