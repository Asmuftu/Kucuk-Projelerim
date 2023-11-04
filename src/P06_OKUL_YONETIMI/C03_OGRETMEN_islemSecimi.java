package P06_OKUL_YONETIMI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class C03_OGRETMEN_islemSecimi implements Islemler_Interface{

    protected static Map<Integer,Map<String,Object>> ogretmenListesi = new HashMap<>();
    protected static Map<String,Object> ogretmenBilgileri = new HashMap<>();

    static Scanner scanner = new Scanner(System.in);
    static Scanner scanner2 = new Scanner(System.in);
    static int sicilNo = 382746428;


    @Override
    public void ekleme() {

        boolean gecerliIsimGirildi = false;
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


        System.out.println("lutfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();
        ogretmenBilgileri.put("Soyisim "," "+soyisim.toUpperCase());


        boolean gecerliKimlikNoGirildi = false;
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


        System.out.println("Lutfen yasinizi giriniz");
        double yas = scanner.nextDouble();
        ogretmenBilgileri.put("Yas "," "+(int)yas);


        System.out.println("Lutfen bolumunuzu giriniz");
        String bolum = scanner2.nextLine();
        ogretmenBilgileri.put("Bolum "," "+bolum);


        LocalDate girisTarihi = LocalDate.now();
        ogretmenBilgileri.put("Ekleme Tarihi "," "+girisTarihi);

        System.out.println("isyeriniz tarafindan size verilen sicil numaraniz "+sicilNo +"'dir lutfen bu numarayi kaybetmeyiniz");
        ogretmenListesi.put(sicilNo,ogretmenBilgileri);
        System.out.println(ogretmenListesi);
        sicilNo += 3;



    }

    @Override
    public void arama() {

    }

    @Override
    public void listeleme() {
        System.out.println("Kayitli ogretmen listesi: ");
        Set<Map.Entry<Integer,Map<String,Object>>> entrySet = ogretmenListesi.entrySet();

        for (Map.Entry<Integer,Map<String,Object>> entry : entrySet) {
            System.out.println("Sicil No: " + entry.getKey() + ", Bilgiler: " + entry.getValue());
        }

    }

    @Override
    public void silme() {

    }


}
