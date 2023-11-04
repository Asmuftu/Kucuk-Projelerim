package P06_OKUL_YONETIMI;

public class C05_YedekIslemMethodlari {

    public static boolean sadeceHarfKarakterleri(String isim) {
        for (int i = 0; i < isim.length(); i++) {
            char karakter = isim.charAt(i);
            if (!Character.isLetter(karakter)) {
                return false; // Karakterlerden biri harf değilse, false döndürün.
            }
        }
        return true; // Tüm karakterler harf ise, true döndürün.
    }
}
