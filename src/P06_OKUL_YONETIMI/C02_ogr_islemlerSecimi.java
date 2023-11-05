package P06_OKUL_YONETIMI;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_ogr_islemlerSecimi {

    static Scanner scanner = new Scanner(System.in);
    public static void ogretmenIslemleri() throws InterruptedException {
        C01_ogr_yonetim_paneli.islemler();
        C03_OGRETMEN_islemSecimi obj = new C03_OGRETMEN_islemSecimi();

        char secim = 0;
        try {

             secim = scanner.next().charAt(0);

            switch (secim) {
                case '1':
                    obj.ekleme();
                    break;
                case '2':
                    obj.arama();
                    break;
                case '3':
                    obj.listeleme();
                    break;
                case '4':
                    obj.silme();
                    break;
                case 'q','Q':
                    C01_ogr_yonetim_paneli.menu();
                    break;
                default:
                    throw new InputMismatchException("durum analiz ediliyor...");
            }
        }catch (Exception e){
            System.out.println("yanlis giris yaptiniz, lutfen asagida verilen degerlerden birini tuslayiniz" +
                        "\n hicbir tusa basmayiniz sizi 2 saniye icerisinde tekrar yonlendiriyorum" +
                        "\n   \"1,2,3,4,Q\" ");
            Thread.sleep(2000);
            ogretmenIslemleri();

        }
    }

    public static void ogrenciIslemleri() throws InterruptedException {
        C01_ogr_yonetim_paneli.islemler();
        C04_OGRENCI_islemSecimi obj = new C04_OGRENCI_islemSecimi();

        char secim = 0;
        try {

            secim = scanner.next().charAt(0);

            switch (secim) {
                case '1':
                    obj.ekleme();
                    break;
                case '2':
                    obj.arama();
                    break;
                case '3':
                    obj.listeleme();
                    break;
                case '4':
                    obj.silme();
                    break;
                case 'q','Q':
                    C01_ogr_yonetim_paneli.menu();
                    break;
            }
        }catch (Exception e){
            System.out.println("yanlis giris yaptiniz, lutfen asagida verilen degerlerden birini tuslayiniz" +
                    "\n hicbir tusa basmayiniz sizi 2 saniye icerisinde tekrar yonlendiriyorum" +
                    "\n   \"1,2,3,4,Q\" ");
            Thread.sleep(2000);
            ogrenciIslemleri();

        }
    }
}
