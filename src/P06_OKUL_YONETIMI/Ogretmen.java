package P06_OKUL_YONETIMI;

import java.time.LocalDate;
import java.util.*;

public class Ogretmen implements Liste_islemler {

    protected static Map<Integer,Map<String,Object>> ogretmenListesi = new TreeMap<>();
    protected static Map<String,Object> ogretmenBilgileri = new TreeMap<>();

    static Scanner scanner = new Scanner(System.in);
    static Scanner scanner2 = new Scanner(System.in);
    static int sicilNo = 382746428;



    @Override
    public void ekleme() throws InterruptedException {

           // ISIM ALINIYOR
        while (true) {
            System.out.println("Lutfen isminizi giriniz");
            String isim = scanner.nextLine();
            if (isim.isEmpty()) {
                System.out.println("İsim boş bırakılamaz. Lütfen bir isim girin.");
            } else if (YedekIslemler.sadeceHarfKarakterleri(isim)) {
                ogretmenBilgileri.put("Isim ", " " + isim.substring(0, 1).toUpperCase() + isim.substring(1));
                break;
            } else {
                System.out.println("Geçersiz isim girdiniz, lütfen tekrar deneyiniz");
            }

        }

           // SOYISIM ALINIYOR
        while (true) {
            System.out.println("lutfen soyisminizi giriniz");
            String soyisim = scanner.nextLine();
            if (soyisim.isEmpty()) {
                System.out.println("İsim boş bırakılamaz. Lütfen bir isim girin.");
            } else if (YedekIslemler.sadeceHarfKarakterleri(soyisim)) {
                ogretmenBilgileri.put("Soyisim ", " " + soyisim.toUpperCase());
                break;
            } else {
                System.out.println("Geçersiz isim girdiniz, lütfen tekrar deneyiniz");
            }
        }


           //  TC KIMLIK NO ALINIYOR
        while (true) {
            System.out.println("Lütfen kimlik numaranızı giriniz (11 haneli)");
            String kimlikNo = scanner.next();

            if (kimlikNo.length() == 11 && kimlikNo.matches("[0-9]+")) {
                long number = Long.parseLong(kimlikNo);
                ogretmenBilgileri.put("Kimlik No ", " " + kimlikNo);
                break; // Doğru değer girildi, döngüyü sonlandır.
            } else {
                System.out.println("Geçerli bir TC kimlik numarası girmediniz. Lütfen tekrar deneyin.");
            }
        }

         // YAS ALINIYOR
        double yas = 0.0;
        while (true) {
            System.out.println("Lutfen yasinizi giriniz");
            String yasStr = scanner.next();
            try {
                yas = Double.parseDouble(yasStr);
                int tamYas = (int) yas;
                ogretmenBilgileri.put("Yas ", " " + tamYas);
                break;
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
        System.out.println("Sizi Menuye aktariyorum...");

    }

    @Override
    public void arama() throws InterruptedException {

        YedekIslemler.fakeListogretmen();
        System.out.println("Lutfen aramak istediginiz Ogretmenin Sicil numarasini yaziniz");
        Set<Map.Entry<Integer,Map<String,Object>>> entrySet = ogretmenListesi.entrySet();
        for (Map.Entry<Integer,Map<String,Object>> sicilNoVeBilgiler : entrySet){
            System.out.print(sicilNoVeBilgiler.getKey()+ " ");
            Map<String, Object> ogretmenBilgileri = sicilNoVeBilgiler.getValue();
            System.out.println(ogretmenBilgileri.get("Soyisim ")+" , ");
        }
        Integer arananKisi = scanner2.nextInt();
        System.out.println("Isim: "+ogretmenListesi.get(arananKisi).get("Isim "));
        System.out.println("Soyisim: "+ogretmenListesi.get(arananKisi).get("Soyisim "));
        System.out.println("Kimlik No: "+ogretmenListesi.get(arananKisi).get("Kimlik No "));
        System.out.println("Yas: "+ogretmenListesi.get(arananKisi).get("Yas "));
        System.out.println("Bolum: "+ogretmenListesi.get(arananKisi).get("Bolum "));
        System.out.println("Ekleme Tarihi: "+ogretmenListesi.get(arananKisi).get("Ekleme Tarihi "));

        System.out.println("Sizi Menuye aktariyorum...");
    }

    @Override
    public void listeleme() throws InterruptedException {
        System.out.println("Kayitli ogretmen listesi: ");
        YedekIslemler.fakeListogretmen();
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

        System.out.println("Sizi Menuye aktariyorum...");

    }

    @Override
    public void silme() throws InterruptedException {
        YedekIslemler.fakeListogretmen();
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

        System.out.println("Sizi Menuye aktariyorum...");
    }

}