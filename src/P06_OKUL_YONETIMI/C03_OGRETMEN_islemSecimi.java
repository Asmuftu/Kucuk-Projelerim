package P06_OKUL_YONETIMI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class C03_OGRETMEN_islemSecimi implements Islemler_Interface{

    protected static Map<Integer,Map<String,Object>> ogretmenListesi = new TreeMap<>();
    protected static Map<String,Object> ogretmenBilgileri = new HashMap<>();

    static Scanner scanner = new Scanner(System.in);
    static Scanner scanner2 = new Scanner(System.in);
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
                ogretmenBilgileri.put("Isim ", " " + isim.substring(0, 1).toUpperCase() + isim.substring(1));
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
                ogretmenBilgileri.put("Kimlik No ", " " + kimlikNo);
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
        String bolum = scanner2.nextLine().trim();
        ogretmenBilgileri.put("Bolum "," "+bolum);


        LocalDate girisTarihi = LocalDate.now();
        ogretmenBilgileri.put("Ekleme Tarihi "," "+girisTarihi);

        System.out.println("isyeriniz tarafindan size verilen sicil numaraniz "+sicilNo +"'dir lutfen bu numarayi kaybetmeyiniz");
        ogretmenListesi.put(sicilNo,ogretmenBilgileri);
        System.out.println("ISLEMINIZ BASARIYLA KAYDEDILMISTIR");
        sicilNo += 3;

        C02_ogr_islemlerSecimi.ogretmenIslemleri();
    }

    @Override
    public void arama() throws InterruptedException {

        C05_YedekIslemMethodlari.fakeList();
        System.out.println("Lutfen aramak istediginiz Ogretmenin Sicil numarasini yaziniz");
        Set<Map.Entry<Integer,Map<String,Object>>> entrySet = ogretmenListesi.entrySet();
        for (Map.Entry<Integer,Map<String,Object>> sicilNoVeBilgiler : entrySet){
            System.out.print(sicilNoVeBilgiler.getKey()+ " ");
            Map<String, Object> ogretmenBilgileri = sicilNoVeBilgiler.getValue();
            System.out.println(ogretmenBilgileri.get("Soyisim ")+" , ");
        }
        Integer arananKisi = scanner2.nextInt();
        System.out.println("Isim: "+ogretmenListesi.get(arananKisi).get("Isim"));
        System.out.println("Soyisim: "+ogretmenListesi.get(arananKisi).get("Soyisim "));
        System.out.println("Kimlik No: "+ogretmenListesi.get(arananKisi).get("Kimlik No "));
        System.out.println("Yas: "+ogretmenListesi.get(arananKisi).get("Yas "));
        System.out.println("Bolum: "+ogretmenListesi.get(arananKisi).get("Bolum "));
        System.out.println("Ekleme Tarihi: "+ogretmenListesi.get(arananKisi).get("Ekleme Tarihi "));

        C02_ogr_islemlerSecimi.ogretmenIslemleri();
    }

    @Override
    public void listeleme() throws InterruptedException {
        System.out.println("Kayitli ogretmen listesi: ");
        C05_YedekIslemMethodlari.fakeList();
        Set<Map.Entry<Integer,Map<String,Object>>> entrySet = ogretmenListesi.entrySet();

        for (Map.Entry<Integer,Map<String,Object>> sicilNoVeBilgiler : entrySet) {

            Map<String, Object> ogretmenBilgileri = sicilNoVeBilgiler.getValue();
            Set<Map.Entry<String, Object>> ictekiEntrySet = ogretmenBilgileri.entrySet();

            System.out.println("Sicil no: "+ sicilNoVeBilgiler.getKey());

            for (Map.Entry<String,Object> bilgiler : ictekiEntrySet) {
                String key = bilgiler.getKey();
                Object value = bilgiler.getValue();
                System.out.print(key + ":"+value+"  ||  ");
            }
            System.out.println(" ");
            System.out.println("---------------------");
        }


        C02_ogr_islemlerSecimi.ogretmenIslemleri();
    }

    @Override
    public void silme() throws InterruptedException {
        C05_YedekIslemMethodlari.fakeList();
        System.out.println("Lutfen silmek istediginiz Ogretmenin Sicil numarasini yaziniz");
        Set<Map.Entry<Integer,Map<String,Object>>> entrySet = ogretmenListesi.entrySet();
        for (Map.Entry<Integer,Map<String,Object>> sicilNoVeBilgiler : entrySet){
            System.out.print(sicilNoVeBilgiler.getKey()+ " ");
            Map<String, Object> ogretmenBilgileri = sicilNoVeBilgiler.getValue();
            System.out.println(ogretmenBilgileri.get("Soyisim ")+" , ");
        }
        Integer kisiyiSil = scanner2.nextInt();
        ogretmenListesi.remove(kisiyiSil);
        System.out.println("KISI BASARIYLA SILINMISTIR");

        C02_ogr_islemlerSecimi.ogretmenIslemleri();
    }


}
