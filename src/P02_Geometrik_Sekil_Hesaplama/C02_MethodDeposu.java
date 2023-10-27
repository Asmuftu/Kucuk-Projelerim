package P02_Geometrik_Sekil_Hesaplama;

import java.util.Scanner;

public class C02_MethodDeposu {
static Scanner scanner = new Scanner(System.in);

    public static void cember() {
        System.out.println("dilediginiz uzunluklardaki cemberin alan ve cevre uzunlugunu bulmaniza son 1 adim...");
        System.out.println("simdi lutfen cemberin yaricapini giriniz (π=3)");
        double yaricap = scanner.nextDouble();
        if (yaricap<=0){
            System.out.println("yaricap 0 veya daha kucuk olamaz");
            cember();
        }
        System.out.println(yaricap+" yaricapli cemberin alani: "+(yaricap*yaricap)+"π");
        System.out.println(yaricap+" yaricapli cemberin cevresi: "+(2*yaricap)+"π");
    }

    public static void ucgen() {
        System.out.println("dilediginiz uzunluklardaki ucgenin alan ve cevre uzunlugunu bulmaniza son birkac adim...");
        System.out.println("ucgeniniz dik ucgen mi? (evet/hayir)");
        String dikMi = scanner.next();
        if (dikMi.equalsIgnoreCase("evet")){
            System.out.println("1. dik kenari giriniz");
            double dikKenar1 = scanner.nextDouble();
            System.out.println("2. dik kenari giriniz");
            double dikKenar2 = scanner.nextDouble();
            if (dikKenar1<=0 || dikKenar2<=0){
                System.out.println("kenarlar 0 veya daha kucuk olamaz!!");
                ucgen();
            }
            System.out.println("                                                      > alani: "+(dikKenar1*dikKenar2/2));
            System.out.println(dikKenar1+" ve "+dikKenar2+" uzunluklarinda dik kenarlari olan ucgenin >");
            System.out.println("                                                      > cevresi: "+(dikKenar1+dikKenar2+C03_EkHesaplamalar.hipotenusHesaplama(dikKenar1,dikKenar2)));
        } else if (dikMi.equalsIgnoreCase("hayir")) {
            System.out.println("oncelikle ucgenin kenar uzunluklarina a,b ve c diyelim");
            System.out.println("lutfen ucgenin a tabanina degen yuksekligini yaziniz");
            double yukseklik = scanner.nextDouble();
            System.out.println("simdi lutfen a kenarinin uzunlugunu yaziniz");
            double a = scanner.nextDouble();
            System.out.println("simdi de b kenarini yaziniz");
            double b = scanner.nextDouble();
            System.out.println("simdi de c kenarini yaziniz");
            double c = scanner.nextDouble();
            if (a<=0 || b<=0 || c<=0){
                System.out.println("kenarlar 0 veya daha kucuk olamaz!!");
                ucgen();
            }
            System.out.println("                                                      > alani: "+(yukseklik*a));
            System.out.println("yuksekligi "+yukseklik+" olan ve tabani "+a+" olan ucgenin >");
            System.out.println("                                                      > cevresi: "+(a+b+c));

        }else {
            System.out.println("lutfen evet ya da hayir yaziniz!");
            ucgen();
        }
    }

    public static void kare() {
        System.out.println("dilediginiz uzunluklardaki karenin alan ve cevre uzunlugunu bulmaniza son X adim...");
        System.out.println("lutfen cevresini ve alanini bulmak istediginiz karenin kenar uzunlugunu giriniz");
        double kenar = scanner.nextDouble();
        if (kenar<=0){
            System.out.println("kenar 0 veya daha kucuk olamaz");
            kare();
        }
        System.out.println("karenin alani: "+ (kenar*kenar));
        System.out.println("karenin cevresi: "+(4*kenar));
    }

    public static void dikdortgen() {
        System.out.println("dilediginiz uzunluklardaki dikdortgenin alan ve cevre uzunlugunu bulmaniza son X adim...");
        System.out.println("lutfen cevresini ve alanini bulmak istediginiz dikdortgenin kisa kenar uzunlugunu giriniz");
        double kisaKenar = scanner.nextDouble();
        System.out.println("simdi de uzun kenar uzunlugunu giriniz");
        double uzunKenar = scanner.nextDouble();
        if (uzunKenar<=0 || kisaKenar<=0){
            System.out.println("kenarlar 0 veya daha kucuk olamaz!!");
            dikdortgen();
        }
        System.out.println("karenin alani: "+ (kisaKenar*uzunKenar));
        System.out.println("karenin cevresi: "+(2*(kisaKenar+uzunKenar)));
    }
}
