package P05_Geometrik_Sekil_Hesaplama4;

public class Runner {

    public static void main(String[] args) {
        Sekil cember = new Cember(5);
        System.out.println("Cember Alanı: " + cember.alanHesapla());
        System.out.println("Cember Çevresi: " + cember.cevreHesapla());

        Sekil dikdortgen = new Dikdortgen(4, 6);
        System.out.println("Dikdortgen Alanı: " + dikdortgen.alanHesapla());
        System.out.println("Dikdortgen Çevresi: " + dikdortgen.cevreHesapla());

        Sekil kare = new Kare(3);
        System.out.println("Kare Alanı: " + kare.alanHesapla());
        System.out.println("Kare Çevresi: " + kare.cevreHesapla());
    }
}
