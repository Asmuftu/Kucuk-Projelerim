package P05_Geometrik_Sekil_Hesaplama4;

public class Kare implements GeometrikSekil{

    private double kenarUzunlugu;

    public Kare(double kenarUzunlugu) {
        this.kenarUzunlugu = kenarUzunlugu;
    }

    @Override
    public double alanHesapla() {
        return kenarUzunlugu * kenarUzunlugu;
    }

    @Override
    public double cevreHesapla() {
        return 4 * kenarUzunlugu;
    }
}
