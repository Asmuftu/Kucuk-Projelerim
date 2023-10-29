package P04_Geometrik_Sekil_Hesaplama3;

public class C03_Dikdortgen extends C01_Sekil{

    private double uzunluk;
    private double genislik;

    public C03_Dikdortgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    public double alanHesapla() {
        return uzunluk * genislik;
    }

    public double cevreHesapla() {
        return 2 * (uzunluk + genislik);
    }
}
