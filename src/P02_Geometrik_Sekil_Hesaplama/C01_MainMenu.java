package P02_Geometrik_Sekil_Hesaplama;

import java.util.Scanner;

public class C01_MainMenu {
    public static void main(String[] args) throws InterruptedException {
        menu();
    }

    protected static void menu() throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        System.out.println("1.) CEMBER");
        System.out.println("2.) UCGEN");
        System.out.println("3.) KARE");
        System.out.println("4.) DIKDORTGEN");
        System.out.print("ilgili bilgileri ogrenmek istediginiz sekili seciniz : ");
        String secim = scan.next();

        if (secim.equals("1") || secim.equalsIgnoreCase("cember")) {
            C02_MethodDeposu.cember();

        } else if (secim.equals("2") || secim.equalsIgnoreCase("ucgen")) {
            C02_MethodDeposu.ucgen();

        } else if (secim.equals("3") || secim.equalsIgnoreCase("kare")) {
            C02_MethodDeposu.kare();

        } else if (secim.equals("4") || secim.equalsIgnoreCase("dikdortgen")) {
            C02_MethodDeposu.dikdortgen();

        } else {
            System.out.println("hatali giris yaptiniz, sizi tekrar yonlendiriyorum");
            menu();
        }
    }




}
