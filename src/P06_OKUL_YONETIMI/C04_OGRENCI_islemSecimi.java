package P06_OKUL_YONETIMI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C04_OGRENCI_islemSecimi implements Islemler_Interface{

    Map<Integer,Map<String,String>> ogrenciListesi = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void ekleme() {
        System.out.println("ekleme");
    }

    @Override
    public void arama() {

    }

    @Override
    public void listeleme() {

    }

    @Override
    public void silme() {

    }
}
