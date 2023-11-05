package P06_OKUL_YONETIMI;

import java.time.LocalDate;
import java.util.*;

public class C04_OGRENCI_islemSecimi implements Islemler_Interface{

    protected static Map<Integer,Map<String,Object>> ogrenciListesi = new TreeMap<>();
    protected static Map<String,Object> ogrenciBilgileri = new TreeMap<>();

    static Scanner scanner = new Scanner(System.in);
    static Scanner scanner2 = new Scanner(System.in);
    static int numara = 8475;
    // Ad-Soyad,  kimlik No, yaş, numara, sınıf

    @Override
    public void ekleme() throws InterruptedException {

        boolean gecerliIsimGirildi = false;   // ISIM ALINIYOR
        while (!gecerliIsimGirildi) {
            System.out.println("Lutfen isminizi giriniz");
            String isim = scanner.nextLine();
            if (isim.isEmpty()) {
                System.out.println("İsim boş bırakılamaz. Lütfen bir isim girin.");
            } else if (C05_YedekIslemMethodlari.sadeceHarfKarakterleri(isim)) {
                ogrenciBilgileri.put("Isim ", " " + isim.substring(0, 1).toUpperCase() + isim.substring(1));
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
                ogrenciBilgileri.put("Soyisim ", " " + soyisim.toUpperCase());
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
                ogrenciBilgileri.put("Kimlik No ", " " + kimlikNo);
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
                ogrenciBilgileri.put("Yas ", " " + tamYas);
                gecerliYasGirildi = true;
            } catch (NumberFormatException e) {
                System.out.println("Geçerli bir yaş girilmedi. Lütfen tekrar deneyin.");
            }
        }



        System.out.println("Lutfen sinifinizi giriniz");
        String sinifNo = scanner2.nextLine().trim();
        ogrenciBilgileri.put("Sinif No "," "+sinifNo);


        LocalDate girisTarihi = LocalDate.now();
        ogrenciBilgileri.put("Ekleme Tarihi "," "+girisTarihi);

        System.out.println("Okul tarafindan size verilen  numaraniz "+numara +"'dir lutfen bu numarayi kaybetmeyiniz");
        ogrenciListesi.put(numara,ogrenciBilgileri);
        System.out.println("ISLEMINIZ BASARIYLA KAYDEDILMISTIR");
        numara += 4;

        C02_ogr_islemlerSecimi.ogrenciIslemleri();
    }

    @Override
    public void arama() {
        C05_YedekIslemMethodlari.fakeListOgrenci();
        System.out.println("Lutfen aramak istediginiz Ogrencinin  numarasini yaziniz");
        Set<Map.Entry<Integer,Map<String,Object>>> entrySet = ogrenciListesi.entrySet();
        for (Map.Entry<Integer,Map<String,Object>> NoVeBilgiler : entrySet){
            System.out.print(NoVeBilgiler.getKey()+ " ");
            Map<String, Object> ogrenciBilgileri = NoVeBilgiler.getValue();
            System.out.println(ogrenciBilgileri.get("Soyisim ")+" , ");
        }
        Integer arananKisi = scanner2.nextInt();
        System.out.println("Isim: "+ogrenciListesi.get(arananKisi).get("Isim"));
        System.out.println("Soyisim: "+ogrenciListesi.get(arananKisi).get("Soyisim "));
        System.out.println("Kimlik No: "+ogrenciListesi.get(arananKisi).get("Kimlik No "));
        System.out.println("Yas: "+ogrenciListesi.get(arananKisi).get("Yas "));
        System.out.println("Sinif No: "+ogrenciListesi.get(arananKisi).get("Sinif No "));
        System.out.println("Ekleme Tarihi: "+ogrenciListesi.get(arananKisi).get("Ekleme Tarihi "));

    }

    @Override
    public void listeleme() throws InterruptedException {

        System.out.println("Kayitli ogretmen listesi: ");
        C05_YedekIslemMethodlari.fakeListOgrenci();
        Set<Map.Entry<Integer,Map<String,Object>>> entrySet = ogrenciListesi.entrySet();

        for (Map.Entry<Integer,Map<String,Object>> NoVeBilgiler : entrySet) {

            Map<String, Object> ogrenciBilgileri = NoVeBilgiler.getValue();
            Set<Map.Entry<String, Object>> ictekiEntrySet = ogrenciBilgileri.entrySet();

            System.out.println("Numara: "+ NoVeBilgiler.getKey());

            for (Map.Entry<String,Object> bilgiler : ictekiEntrySet) {
                String key = bilgiler.getKey();
                Object value = bilgiler.getValue();
                System.out.print(key + ":"+value+"  ||  ");
            }
            System.out.println(" ");
            System.out.println("---------------------");
        }
        C02_ogr_islemlerSecimi.ogrenciIslemleri();
    }

    @Override
    public void silme() throws InterruptedException {

        C05_YedekIslemMethodlari.fakeListOgrenci();
        System.out.println("Lutfen silmek istediginiz Ogretmenin Sicil numarasini yaziniz");
        Set<Map.Entry<Integer,Map<String,Object>>> entrySet = ogrenciListesi.entrySet();
        for (Map.Entry<Integer,Map<String,Object>> NoVeBilgiler : entrySet){
            System.out.print(NoVeBilgiler.getKey()+ " ");
            Map<String, Object> ogrenciBilgileri = NoVeBilgiler.getValue();
            System.out.println(ogrenciBilgileri.get("Soyisim ")+" , ");
        }
        Integer kisiyiSil = scanner2.nextInt();
        ogrenciListesi.remove(kisiyiSil);
        System.out.println("KISI BASARIYLA SILINMISTIR");

        C02_ogr_islemlerSecimi.ogrenciIslemleri();
    }
}

