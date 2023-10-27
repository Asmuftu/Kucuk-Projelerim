package P01_kitap_projesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C01_Kitap_Ekle {

    public static void main(String[] args) {

    }
    public static void ekle(){

        System.out.println("Lutfen eklemek istediginiz kitabin yaninizda oldugundan emin olunuz\ncunku sizden bazi onemli bilgiler isteyecegim");
        Scanner scanner = new Scanner(System.in);
        int sayac = 1000;
        Map<Integer,String> kitapMapi = new HashMap<>();
        System.out.println("Oncelikle lutfen kitabin ismini giriniz ve adimlari takip ediniz");
        String kitabinAdi = scanner.nextLine();
        if (kitabinAdi.isEmpty() || kitabinAdi.isBlank()){
            System.out.println("kitap ismi bos kalamaz, gecerli kitap ismi giriniz");
        }else {
            kitapMapi.put(sayac,kitabinAdi);
        }
        System.out.println(kitapMapi);
    }
}
