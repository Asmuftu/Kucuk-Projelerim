package P04_Geometrik_Sekil_Hesaplama3;

public class C02_Cember extends C01_Sekil{

    private double yaricap;

    public C02_Cember(double yaricap) {
        this.yaricap = yaricap;
    }

    public double alanHesapla() {
        return Math.PI * yaricap * yaricap;
    }

    public double cevreHesapla() {
        return 2 * Math.PI * yaricap;
    }
}
