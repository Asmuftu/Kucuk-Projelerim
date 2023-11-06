package P06_OKUL_YONETIMI;

import java.util.Map;
import java.util.TreeMap;

public class YedekIslemler {

    public static boolean sadeceHarfKarakterleri(String isim) {
        for (int i = 0; i < isim.length(); i++) {
            char karakter = isim.charAt(i);
            if (!Character.isLetter(karakter)) {
                return false; // Karakterlerden biri harf değilse, false döndürün.
            }
        }
        return true; // Tüm karakterler harf ise, true döndürün.
    }

    public static void fakeListogretmen() {
        Map<String,Object> fakeListe1 = new TreeMap<>();
        fakeListe1.put("Isim "," Abdullah"); // isim
        fakeListe1.put("Soyisim "," Bozca"); // soyisim
        fakeListe1.put("Kimlik No "," 34149284837"); // kimlik
        fakeListe1.put("Yas "," 18"); // yas
        fakeListe1.put("Bolum "," Sosyal"); // bolum
        fakeListe1.put("Ekleme Tarihi "," 2023-11-04"); // tarih
        Ogretmen.ogretmenListesi.put(382746416,fakeListe1);

        Map<String,Object> fakeListe2 = new TreeMap<>();
        fakeListe2.put("Isim "," Ahmet"); // isim
        fakeListe2.put("Soyisim "," Bulutluoz"); // soyisim
        fakeListe2.put("Kimlik No "," 34142234635"); // kimlik
        fakeListe2.put("Yas "," 21"); // yas
        fakeListe2.put("Bolum "," Matematik"); // bolum
        fakeListe2.put("Ekleme Tarihi "," 2023-11-04"); // tarih
        Ogretmen.ogretmenListesi.put(382746419,fakeListe2);

        Map<String,Object> fakeListe3 = new TreeMap<>();
        fakeListe3.put("Isim "," Recep"); // isim
        fakeListe3.put("Soyisim "," Alıcı"); // soyisim
        fakeListe3.put("Kimlik No "," 34191750926"); // kimlik
        fakeListe3.put("Yas "," 19"); // yas
        fakeListe3.put("Bolum "," Edebiyat"); // bolum
        fakeListe3.put("Ekleme Tarihi "," 2023-11-04"); // tarih
        Ogretmen.ogretmenListesi.put(382746422,fakeListe3);

        Map<String,Object> fakeListe4 = new TreeMap<>();
        fakeListe4.put("Isim "," Murat"); // isim
        fakeListe4.put("Soyisim "," Babayigit"); // soyisim
        fakeListe4.put("Kimlik No "," 34192047156"); // kimlik
        fakeListe4.put("Yas "," 20"); // yas
        fakeListe4.put("Bolum "," Fizik"); // bolum
        fakeListe4.put("Ekleme Tarihi "," 2023-11-04"); // tarih
        Ogretmen.ogretmenListesi.put(382746425,fakeListe4);

    }

    public static void fakeListOgrenci() {
        Map<String,Object> fakeListe1 = new TreeMap<>();
        fakeListe1.put("Isim "," Ahmed Said"); // isim
        fakeListe1.put("Soyisim "," Muftu"); // soyisim
        fakeListe1.put("Kimlik No "," 10829530451"); // kimlik
        fakeListe1.put("Yas "," 19"); // yas
        fakeListe1.put("Sinif "," T127-2"); // sinif
        fakeListe1.put("Ekleme Tarihi "," 2023-11-04"); // tarih
        Ogrenci.ogrenciListesi.put(8459,fakeListe1);

        Map<String,Object> fakeListe2 = new TreeMap<>();
        fakeListe2.put("Isim "," Hari"); // isim
        fakeListe2.put("Soyisim "," Sheldon"); // soyisim
        fakeListe2.put("Kimlik No "," 34193613783"); // kimlik
        fakeListe2.put("Yas "," 45"); // yas
        fakeListe2.put("Sinif "," T127-2"); // sinif
        fakeListe2.put("Ekleme Tarihi "," 2023-11-04"); // tarih
        Ogrenci.ogrenciListesi.put(8463,fakeListe2);

        Map<String,Object> fakeListe3 = new TreeMap<>();
        fakeListe3.put("Isim "," Zehra"); // isim
        fakeListe3.put("Soyisim "," Demir"); // soyisim
        fakeListe3.put("Kimlik No "," 10829530451"); // kimlik
        fakeListe3.put("Yas "," 45"); // yas
        fakeListe3.put("Sinif "," T127-2"); // sinif
        fakeListe3.put("Ekleme Tarihi "," 2023-11-04"); // tarih
        Ogrenci.ogrenciListesi.put(8467,fakeListe3);

        Map<String,Object> fakeListe4 = new TreeMap<>();
        fakeListe4.put("Isim "," Zeliha"); // isim
        fakeListe4.put("Soyisim "," Selçuk"); // soyisim
        fakeListe4.put("Kimlik No "," 10829530451"); // kimlik
        fakeListe4.put("Yas "," 30"); // yas
        fakeListe4.put("Sinif "," T127-2"); // sinif
        fakeListe4.put("Ekleme Tarihi "," 2023-11-04"); // tarih
        Ogrenci.ogrenciListesi.put(8471,fakeListe4);
    }
}
