package P03_Geometrik_Sekil_Hesaplama2;

public class C05_DIKDORTGEN extends C01_MainMenu2{
    protected static void dikdortgen() {
        System.out.println("");
        System.out.println("Dikdortgen hesaplama bolumune yonlendirildiniz");
        System.out.println("Bu bolumde dikdortgenin alanini ve cevre uzunlugunu bulabilirsiniz");
        System.out.println("");
        System.out.println("lutfen bilgilerini bulmak istediginiz dikdortgenin kisa kenarini giriniz");
        kisakenar = scan.nextDouble();
        System.out.println("simdi lutfen uzun kenarin uzunlugunu giriniz");
        uzunkenar = scan.nextDouble();
        if (kisakenar<=0 || uzunkenar<=0){
            System.out.println("girilen degerler 0'da buyuk olmalidir, sizi tekrar yonlendiriyorum");
            dikdortgen();
        }
        System.out.println("dikdortgenin cevresi verilen  kenarlarin toplaminin 2 ile carpimi ile bulunur");
        System.out.println("        alani da uzunkenar*kisakenar formuluyle bulunur");
        System.out.println("Sonuc:");
        System.out.println("Alan:  "+(kisakenar*uzunkenar));
        System.out.println("Cevre: "+(2*(kisakenar+uzunkenar)));
    }
}
