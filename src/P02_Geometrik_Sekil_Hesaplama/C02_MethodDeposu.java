package P02_Geometrik_Sekil_Hesaplama;

import java.util.Scanner;

public class C02_MethodDeposu {
static Scanner scanner = new Scanner(System.in);

    protected static void cember() throws InterruptedException {
        System.out.println("simdi lutfen cemberin yaricapini giriniz");
        double yaricap = scanner.nextDouble();
        if (yaricap<=0){
            System.out.println("yaricap 0 veya daha kucuk olamaz");
            cember();
        }
        System.out.println("VE"); Thread.sleep(600);
        System.out.println("ISTE"); Thread.sleep(600);
        System.out.println("SONUCLAR"); Thread.sleep(600);
        C03_EkHesaplamalar.ustHiza();
        System.out.print("                      "+ (yaricap*yaricap)+"π");
        System.out.println("                      "+(2*yaricap)+"π");
        C03_EkHesaplamalar.altHiza();

        Scanner anaMenuCikis = new Scanner(System.in);

        try {
            System.out.println("Ana menuye donmek icin 1'i \n Cikis yapmak icin herhangi bir tusu tuslayiniz");
            int secim = anaMenuCikis.nextInt();
            if (secim==1){
                C01_MainMenu.menu();
            } else {
                System.exit(0);
            }
        }catch (Exception e){
            System.out.println("Yanlis tuslama yaptiniz program sifirlaniyor");
            C01_MainMenu.menu();
        }
    }

    protected static void ucgen() throws InterruptedException {
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

        Scanner anaMenuCikis = new Scanner(System.in);

        try {
            System.out.println("Ana menuye donmek icin 1'i \n Cikis yapmak icin herhangi bir tusu tuslayiniz");
            int secim = anaMenuCikis.nextInt();
            if (secim==1){
                C01_MainMenu.menu();
            } else {
                System.exit(0);
            }
        }catch (Exception e){
            System.out.println("Yanlis tuslama yaptiniz program sifirlaniyor");
            C01_MainMenu.menu();
        }
    }

    protected static void kare() throws InterruptedException {
        System.out.println("lutfen cevresini ve alanini bulmak istediginiz karenin kenar uzunlugunu giriniz");
        double kenar = scanner.nextDouble();
        if (kenar<=0){
            System.out.println("kenar 0 veya daha kucuk olamaz");
            kare();
        }
        System.out.println("VE"); Thread.sleep(800);
        System.out.println("ISTE"); Thread.sleep(800);
        System.out.println("SONUCLAR"); Thread.sleep(800);
        C03_EkHesaplamalar.ustHiza();
        System.out.print("                      "+ (kenar*kenar));
        System.out.println("                       "+(4*kenar));
        C03_EkHesaplamalar.altHiza();

        Scanner anaMenuCikis = new Scanner(System.in);

        try {
            System.out.println("Ana menuye donmek icin 1'i \n Cikis yapmak icin herhangi bir tusu tuslayiniz");
            int secim = anaMenuCikis.nextInt();
            if (secim==1){
                C01_MainMenu.menu();
            } else {
                System.exit(0);
            }
        }catch (Exception e){
            System.out.println("Yanlis tuslama yaptiniz program sifirlaniyor");
            C01_MainMenu.menu();
        }
    }

    protected static void dikdortgen() throws InterruptedException {
        System.out.println("lutfen cevresini ve alanini bulmak istediginiz dikdortgenin kisa kenar uzunlugunu giriniz");
        double kisaKenar = scanner.nextDouble();
        System.out.println("simdi de uzun kenar uzunlugunu giriniz");
        double uzunKenar = scanner.nextDouble();
        if (uzunKenar<=0 || kisaKenar<=0){
            System.out.println("kenarlar 0 veya daha kucuk olamaz!!");
            dikdortgen();
        }
        System.out.println("VE"); Thread.sleep(800);
        System.out.println("ISTE"); Thread.sleep(800);
        System.out.println("SONUCLAR"); Thread.sleep(800);
        C03_EkHesaplamalar.ustHiza();
        System.out.print("                      "+ (kisaKenar*uzunKenar));
        System.out.println("                       "+(2*(kisaKenar+uzunKenar)));
        C03_EkHesaplamalar.altHiza();

        Scanner anaMenuCikis = new Scanner(System.in);

        try {
            System.out.println("Ana menuye donmek icin 1'i \n Cikis yapmak icin herhangi bir tusu tuslayiniz");
            int secim = anaMenuCikis.nextInt();
            if (secim==1){
                C01_MainMenu.menu();
            } else {
                System.exit(0);
            }
        }catch (Exception e){
            System.out.println("Yanlis tuslama yaptiniz program sifirlaniyor");
            C01_MainMenu.menu();
        }
    }
}
