package P04_Geometrik_Sekil_Hesaplama3;

import java.text.DecimalFormat;

public class C00_Runner {

    public static void main(String[] args) {


        // Cember nesnesi
        C02_Cember cember = new C02_Cember(5);
        double Alan = cember.alanHesapla();
        double cevre = cember.cevreHesapla();
        DecimalFormat df =new DecimalFormat("#.####");
        String yuvarlanmisAlan = df.format(Alan);
        String yuvarlanmisCevre = df.format(cevre);
        System.out.println("Cember Alanı: " + yuvarlanmisAlan);
        System.out.println("Cember Çevresi: " + yuvarlanmisCevre);

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
