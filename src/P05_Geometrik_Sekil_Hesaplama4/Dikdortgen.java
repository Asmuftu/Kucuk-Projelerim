package P05_Geometrik_Sekil_Hesaplama4;

public class Dikdortgen implements Sekil {

    private double uzunluk;
    private double genislik;

    public Dikdortgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    @Override
    public double alanHesapla() {
        return uzunluk * genislik;
    }

    @Override
    public double cevreHesapla() {
        return 2 * (uzunluk + genislik);
    }
}
