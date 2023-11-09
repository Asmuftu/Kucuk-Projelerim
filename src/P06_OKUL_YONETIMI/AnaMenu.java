package P06_OKUL_YONETIMI;


import java.util.Scanner;

public class AnaMenu {

    static Scanner scan = new Scanner(System.in);
    static String secim1;
    static String secim2;
    static String secim3;
    static Ogretmen ogretmen = new Ogretmen();
    static Ogrenci ogrenci = new Ogrenci();

    public static void main(String[] args) throws InterruptedException {
        YedekIslemler.fakeListogretmen();
        YedekIslemler.fakeListOgrenci();
                          yonetimPaneli();
    }
    protected static void yonetimPaneli() throws InterruptedException {
        System.out.println("    ====================================" +
                "\n     ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ" +
                "\n    ====================================" +
                "\n     1- ÖĞRETMEN İŞLEMLERİ" +
                "\n     2- ÖĞRENCİ İŞLEMLERİ" +
                "\n     Q- ÇIKIŞ");
        System.out.print("Seciminiz: ");
        secim1 = scan.nextLine();
                           islemler();
    }
    protected static void islemler() throws InterruptedException {

        System.out.println("============= İŞLEMLER =============" +
                "\n          1-EKLEME" +
                "\n          2-ARAMA" +
                "\n          3-LISTELEME" +
                "\n          4-SİLME" +
                "\n          Q-ANA MENU");
        System.out.print("Seçiminiz: ");
        secim2 = scan.nextLine();
        menu();
    }

    protected static void menu() throws InterruptedException {

        secim3 = (secim1 + secim2);
        switch (secim3) {
            case "11":
                ogretmen.ekleme();
                Thread.sleep(2000);
                islemler();
                break;
            case "12":
                ogretmen.arama();
                Thread.sleep(2000);
                islemler();
                break;
            case "13":
                ogretmen.listeleme();
                Thread.sleep(2000);
                islemler();
                break;
            case "14":
                ogretmen.silme();
                Thread.sleep(2000);
                islemler();
                break;
            case "21":
                ogrenci.ekleme();
                Thread.sleep(2000);
                islemler();
                break;
            case "22":
                ogrenci.arama();
                Thread.sleep(2000);
                islemler();
                break;
            case "23":
                ogrenci.listeleme();
                Thread.sleep(2000);
                islemler();
                break;
            case "24":
                ogrenci.silme();
                Thread.sleep(2000);
                islemler();
                break;
            case "1q":
            case "1Q":
            case "2q":
            case "2Q":
                yonetimPaneli();
                break;
            case "qq":
            case "QQ":
                System.out.println("Cikis");
                System.exit(0);
                break;
            default:
                System.out.println("yanlis deger girdiniz, sizi 2 saniye icerisinde tekrar yonlendiriyorum");
                Thread.sleep(2000);
                yonetimPaneli();
                break;

        }


    }
}
