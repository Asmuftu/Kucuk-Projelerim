package P05_Geometrik_Sekil_Hesaplama4;

public class Cember implements GeometrikSekil{

    private double yaricap;

    public Cember(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double alanHesapla() {
        return Math.PI * yaricap * yaricap;
    }

    @Override
    public double cevreHesapla() {
        return 2 * Math.PI * yaricap;
    }
}
