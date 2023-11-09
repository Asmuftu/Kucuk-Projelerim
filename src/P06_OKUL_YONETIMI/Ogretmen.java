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
            } else if (isim.matches("^[\\w]+(\\s[\\w]+){0,2}$")) {
                String[] arr = isim.split(" ");
                isim = "";
                for (String each: arr) {
                    isim += each.toUpperCase().charAt(0)+each.toLowerCase().substring(1)+" ";
                }
                isim = isim.substring(0,isim.length()-1);
                ogretmenBilgileri.put("Isim ", " " + isim);
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
                System.out.println("Geçersiz isim girdiniz, lütfen tekrar deneyiniz!");
            }
        }


           //  TC KIMLIK NO ALINIYOR
        while (true) {
            System.out.println("Lütfen kimlik numaranızı giriniz (11 haneli)");
            String kimlikNo = scanner.next();

            if (kimlikNo.length() == 11 && kimlikNo.matches("[0-9]+")) {
                ogretmenBilgileri.put("Kimlik No ", " " + kimlikNo);
                break; // Doğru değer girildi, döngüyü sonlandır.
            } else {
                System.out.println("Geçerli bir TC kimlik numarası girmediniz. Lütfen tekrar deneyin.");
            }
        }

         // YAS ALINIYOR
        while (true) {
            try {
                System.out.println("Lütfen yaşınızı girin");
                int yas = scanner.nextInt();
                if (yas > 18 && yas<110) {
                    ogretmenBilgileri.put("Yas ", " " + yas);
                    break;
                } else {
                    System.out.println("Yanlis deger girdiniz, girdiginiz yas yasal degil");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Hatalı giriş! Lütfen sadece sayısal bir değer girin.");
            }
        }



        System.out.println("Lutfen bolumunuzu giriniz");
        String bolum = scanner2.nextLine().trim();
        ogretmenBilgileri.put("Bolum "," "+bolum);


        LocalDate girisTarihi = LocalDate.now();
        ogretmenBilgileri.put("Ekleme Tarihi "," "+girisTarihi);

        System.out.println("isyeriniz tarafindan size verilen sicil numaraniz "+sicilNo +"'dir lutfen bu numarayi KAYBETMEYIN");
        ogretmenListesi.put(sicilNo,ogretmenBilgileri);
        System.out.println("ISLEMINIZ BASARIYLA KAYDEDILMISTIR");
        sicilNo += 8;
        System.out.println("Sizi Menuye aktariyorum...");

    }

    @Override
    public void arama() throws InterruptedException {

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
