package P06_OKUL_YONETIMI;


import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_ogr_yonetim_paneli {

    public static void main(String[] args) throws InterruptedException {
        menu();
    }

    static Scanner scan = new Scanner(System.in);
    private static void menu() throws InterruptedException {
        System.out.println("    ====================================" +
                "\n     ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ" +
                "\n    ====================================" +
                "\n     1- ÖĞRETMEN İŞLEMLERİ" +
                "\n     2- ÖĞRENCİ İŞLEMLERİ" +
                "\n     Q- ÇIKIŞ");
        System.out.print("Seciminiz: ");

        char secim;

        try {
             secim = scan.next().charAt(0);

            switch (secim) {
                case '1':
                    C02_ogr_islemlerSecimi.ogretmenIslemleri();
                    break;
                case '2':
                    C02_ogr_islemlerSecimi.ogrenciIslemleri();
                    break;
                case 'q':
                case 'Q':
                    System.out.println("Cikis");
                    System.exit(0);
                    break;
                default:
                    throw new InputMismatchException("durum analiz ediliyor...");
            }
        }catch (Exception e){
            System.out.println("yanlis giris yaptiniz, lutfen asagida verilen degerlerden birini tuslayiniz" +
                    "\n   \"1,2,Q\" ");
            System.out.println(" hicbir tusa basmayiniz sizi 2 saniye icerisinde tekrar yonlendiriyorum");
            Thread.sleep(2000);
            menu();

        }
    }


    protected static void islemler() {
        //============= İŞLEMLER =============
        //          1-EKLEME
        //          2-ARAMA
        //          3-LİSTELEME
        //          4-SİLME
        //          Q-ÇIKIŞ
        //SEÇİMİNİZ:
        System.out.println("============= İŞLEMLER =============" +
                "\n          1-EKLEME" +
                "\n          2-ARAMA" +
                "\n          3-LİSTELEME" +
                "\n          4-SİLME" +
                "\n          Q-ÇIKIŞ");
        System.out.print("Seciminiz: ");
    }
}
