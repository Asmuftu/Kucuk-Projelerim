package P03_Geometrik_Sekil_Hesaplama2;

import java.util.Scanner;

public class C01_MainMenu2 {


    public static void main(String[] args) {
        menu();
    }

    static Scanner scan = new Scanner(System.in);
    static double yaricap,yukseklik,taban,kenar1,kenar2,uzunkenar,kisakenar = 0.0;
    static boolean trueFalse;
    static String str ="";

    private static void menu() {

        System.out.println("1.) CEMBER");
        System.out.println("2.) UCGEN");
        System.out.println("3.) KARE");
        System.out.println("4.) DIKDORTGEN");
        System.out.print("ilgili bilgileri ogrenmek istediginiz sekili seciniz : ");
        String secim = scan.next();

        if (secim.equals("1") || secim.equalsIgnoreCase("cember")) {
            C02_CEMBER.cember();

        } else if (secim.equals("2") || secim.equalsIgnoreCase("ucgen")) {
            C03_UCGEN.ucgen();

        } else if (secim.equals("3") || secim.equalsIgnoreCase("kare")) {
            C04_KARE.kare();

        } else if (secim.equals("4") || secim.equalsIgnoreCase("dikdortgen")) {
            C05_DIKDORTGEN.dikdortgen();

        } else {
            System.out.println("hatali giris yaptiniz, sizi tekrar yonlendiriyorum");
            menu();
        }
    }
}
