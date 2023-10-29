package P04_Geometrik_Sekil_Hesaplama3;

public class C00_Runner {

    public static void main(String[] args) {
        // Cember nesnesi
        C02_Cember cember = new C02_Cember(5);
        System.out.println("Cember Alanı: " + cember.alanHesapla());
        System.out.println("Cember Çevresi: " + cember.cevreHesapla());

        // Dikdortgen nesnesi
        C03_Dikdortgen dikdortgen = new C03_Dikdortgen(4, 6);
        System.out.println("Dikdortgen Alanı: " + dikdortgen.alanHesapla());
        System.out.println("Dikdortgen Çevresi: " + dikdortgen.cevreHesapla());

        // Kare nesnesi
        C04_Kare kare = new C04_Kare(3);
        System.out.println("Kare Alanı: " + kare.alanHesapla());
        System.out.println("Kare Çevresi: " + kare.cevreHesapla());
    }
}
