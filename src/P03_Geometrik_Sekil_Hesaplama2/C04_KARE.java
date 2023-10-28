package P03_Geometrik_Sekil_Hesaplama2;

public class C04_KARE extends C01_MainMenu2{
    protected static void kare() {
        System.out.println("");
        System.out.println("Kare hesaplama bolumune yonlendirildiniz");
        System.out.println("Bu bolumde karenin alanini ve cevre uzunlugunu bulabilirsiniz");
        System.out.println("");
        System.out.println("lutfen bilgilerini bulmak istediginiz karenin kenar uzunlugunu giriniz");
        kenar1 = scan.nextDouble();
        if (kenar1<=0){
            System.out.println("kenar 0'dan buyuk olmalidir, sizi tekrar yonlendiriyorum");
            kare();
        }
        System.out.println("Karenin cevresi verilen  kenarin 4 ile carpimi ile bulunur");
        System.out.println("        alani da kenarin karesi formuluyle bulunur");
        System.out.println("Sonuc:");
        System.out.println("Alan:  "+(kenar1*kenar1));
        System.out.println("Cevre: "+(4*kenar1));
    }
}
