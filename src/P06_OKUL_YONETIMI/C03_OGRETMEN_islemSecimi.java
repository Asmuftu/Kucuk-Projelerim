package P06_OKUL_YONETIMI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class C03_OGRETMEN_islemSecimi implements Islemler_Interface{

    protected static Map<Integer,Map<String,Object>> ogretmenListesi = new HashMap<>();
    protected static Map<String,Object> ogretmenBilgileri = new HashMap<>();

    static Scanner scanner = new Scanner(System.in);
    static int sicilNo = 382746428;


    @Override
    public void ekleme() throws InterruptedException {

        boolean gecerliIsimGirildi = false;   // ISIM ALINIYOR
        while (!gecerliIsimGirildi) {
            System.out.println("Lutfen isminizi giriniz");
            String isim = scanner.nextLine();
            if (isim.isEmpty()) {
                System.out.println("İsim boş bırakılamaz. Lütfen bir isim girin.");
            } else if (C05_YedekIslemMethodlari.sadeceHarfKarakterleri(isim)) {
                ogretmenBilgileri.put("Isim", " " + isim.substring(0, 1).toUpperCase() + isim.substring(1));
                gecerliIsimGirildi = true;
            } else {
                System.out.println("Geçersiz isim girdiniz, lütfen tekrar deneyiniz");
            }

        }

        boolean gecerliSoyisimGirildi = false;   // SOYISIM ALINIYOR
        while (!gecerliSoyisimGirildi) {
            System.out.println("lutfen soyisminizi giriniz");
            String soyisim = scanner.nextLine();
            if (soyisim.isEmpty()) {
                System.out.println("İsim boş bırakılamaz. Lütfen bir isim girin.");
            } else if (C05_YedekIslemMethodlari.sadeceHarfKarakterleri(soyisim)) {
                ogretmenBilgileri.put("Soyisim ", " " + soyisim.toUpperCase());
                gecerliSoyisimGirildi = true;
            } else {
                System.out.println("Geçersiz isim girdiniz, lütfen tekrar deneyiniz");
            }
        }


        boolean gecerliKimlikNoGirildi = false;   //  TC KIMLIK NO ALINIYOR
        while (!gecerliKimlikNoGirildi) {
            System.out.println("Lütfen kimlik numaranızı giriniz (11 haneli)");
            String kimlikNo = scanner.next();

            if (kimlikNo.length() == 11 && kimlikNo.matches("[0-9]+")) {
                long number = Long.parseLong(kimlikNo);
                ogretmenBilgileri.put("Kimlik No", " " + kimlikNo);
                gecerliKimlikNoGirildi = true; // Doğru değer girildi, döngüyü sonlandır.
            } else {
                System.out.println("Geçerli bir TC kimlik numarası girmediniz. Lütfen tekrar deneyin.");
            }
        }

        boolean gecerliYasGirildi = false; // YAS ALINIYOR
        double yas = 0.0;
        while (!gecerliYasGirildi) {
            System.out.println("Lutfen yasinizi giriniz");
            String yasStr = scanner.next();
            try {
                yas = Double.parseDouble(yasStr);
                int tamYas = (int) yas;
                ogretmenBilgileri.put("Yas ", " " + tamYas);
                gecerliYasGirildi = true;
            } catch (NumberFormatException e) {
                System.out.println("Geçerli bir yaş girilmedi. Lütfen tekrar deneyin.");
            }
        }



        System.out.println("Lutfen bolumunuzu giriniz");
        String bolum = scanner.nextLine().trim();
        ogretmenBilgileri.put("Bolum "," "+bolum);


        LocalDate girisTarihi = LocalDate.now();
        ogretmenBilgileri.put("Ekleme Tarihi "," "+girisTarihi);

        System.out.println("isyeriniz tarafindan size verilen sicil numaraniz "+sicilNo +"'dir lutfen bu numarayi kaybetmeyiniz");
        ogretmenListesi.put(sicilNo,ogretmenBilgileri);
        System.out.println("ISLEMINIZ BASARIYLA KAYDEDILMISTIR");
        sicilNo += 3;

        C01_ogr_yonetim_paneli.menu();
    }

    @Override
    public void arama() {

    }

    @Override
    public void listeleme() throws InterruptedException {
        System.out.println("Kayitli ogretmen listesi: ");
        Set<Map.Entry<Integer,Map<String,Object>>> entrySet = ogretmenListesi.entrySet();

        for (Map.Entry<Integer,Map<String,Object>> entry : entrySet) {
            System.out.println("Sicil No: " + entry.getKey() + ", Bilgiler: " + entry.getValue());
        }
        C01_ogr_yonetim_paneli.menu();
    }

    @Override
    public void silme() {
        System.out.println("Lutfen silmek istediginiz Ogretmenin sicil numarasini yaziniz");
        System.out.println(ogretmenListesi.keySet());

    }


}
