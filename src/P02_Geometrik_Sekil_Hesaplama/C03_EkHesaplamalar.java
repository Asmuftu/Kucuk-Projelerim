package P02_Geometrik_Sekil_Hesaplama;

public class C03_EkHesaplamalar {
    protected static double hipotenusHesaplama(double dikkenar1,double dikkenar2) {

       double kenar1karesi = dikkenar1*dikkenar1;
        double kenar2karesi = dikkenar2*dikkenar2;
        double hipotenusunKaresi = kenar1karesi + kenar2karesi;
        double hipotenus = Math.sqrt(hipotenusunKaresi);

        return hipotenus;
    }

    public static void ustHiza() {
        System.out.println("༻✦༺ 　༻✧༺　༻✦༺ ALAN ༻✦༺ 　༻✧༺　༻✦༺ CEVRE ༻✦༺ 　༻✧༺　༻✦༺");
    }

    public static void altHiza() {
        System.out.println("                  ▂▃▅▆▇ ▇▆▅▃▂                ▂▃▅▆▇ ▇▆▅▃▂ ");
    }
}
