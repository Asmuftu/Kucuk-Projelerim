package P06_OKUL_YONETIMI;

import java.time.LocalDate;
import java.util.*;

public class Ogrenci implements Liste_islemler {

    protected static Map<Integer,Map<String,Object>> ogrenciListesi = new TreeMap<>();
    protected static Map<String,Object> ogrenciBilgileri = new TreeMap<>();
    static Scanner scanner = new Scanner(System.in);
    static Scanner scanner2 = new Scanner(System.in);
    static int numara = 8475;
    // Ad-Soyad,  kimlik No, yaş, numara, sınıf

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
                ogrenciBilgileri.put("Isim ", " " + isim);
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
                ogrenciBilgileri.put("Soyisim ", " " + soyisim.toUpperCase());
                break;
            } else {
                System.out.println("Geçersiz isim girdiniz, lütfen tekrar deneyiniz");
            }
        }


           //  TC KIMLIK NO ALINIYOR
        while (true) {
            System.out.println("Lütfen kimlik numaranızı giriniz (11 haneli)");
            String kimlikNo = scanner.next();

            if (kimlikNo.length() == 11 && kimlikNo.matches("[0-9]+") && !kimlikNo.startsWith("0")) { //
                ogrenciBilgileri.put("Kimlik No ", " " + kimlikNo);
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
                    ogrenciBilgileri.put("Yas ", " " + yas);
                    break;
                } else {
                    System.out.println("Yanlis deger girdiniz, girdiginiz yas yasal degil");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Hatalı giriş! Lütfen sadece sayısal bir değer girin.");
            }
        }



        System.out.println("Lutfen sinifinizi giriniz");
        String sinifNo = scanner2.nextLine().trim();
        System.out.println("Lutfen subenizi giriniz");
        String sube = scanner2.nextLine().trim();
        ogrenciBilgileri.put("Sinif No "," "+sinifNo+"-"+sube);


        LocalDate girisTarihi = LocalDate.now();
        ogrenciBilgileri.put("Ekleme Tarihi "," "+girisTarihi);

        System.out.println("Okul tarafindan size verilen  numaraniz "+numara +"'dir lutfen bu numarayi KAYBETMEYIN");
        ogrenciListesi.put(numara,ogrenciBilgileri);
        System.out.println("ISLEMINIZ BASARIYLA KAYDEDILMISTIR");
        numara += 4;

        System.out.println("Sizi Menuye aktariyorum...");
    }

    @Override
    public void arama() {

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

        System.out.println("Sizi Menuye aktariyorum...");
    }

    @Override
    public void listeleme() throws InterruptedException {

        System.out.println("Kayitli ogretmen listesi: ");

        Set<Map.Entry<Integer,Map<String,Object>>> entrySet = ogrenciListesi.entrySet();

        for (Map.Entry<Integer,Map<String,Object>> NoVeBilgiler : entrySet) {

            Map<String, Object> ogrenciBilgileri = NoVeBilgiler.getValue();                         //         dis key         dis value
            Set<Map.Entry<String, Object>> ictekiEntrySet = ogrenciBilgileri.entrySet();           //    Map < String , Map<String , Object> >
                                                                                                   //                       ic key , ic value
            System.out.println("Numara: "+ NoVeBilgiler.getKey());

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
        Set<Map.Entry<Integer,Map<String,Object>>> entrySet = ogrenciListesi.entrySet();
        for (Map.Entry<Integer,Map<String,Object>> NoVeBilgiler : entrySet){
            System.out.print(NoVeBilgiler.getKey()+ " ");
            Map<String, Object> ogrenciBilgileri = NoVeBilgiler.getValue();
            System.out.println(ogrenciBilgileri.get("Soyisim ")+" , ");
        }
        Integer kisiyiSil = scanner2.nextInt();
        ogrenciListesi.remove(kisiyiSil);
        System.out.println("KISI BASARIYLA SILINMISTIR");

        System.out.println("Sizi Menuye aktariyorum...");
    }
}

