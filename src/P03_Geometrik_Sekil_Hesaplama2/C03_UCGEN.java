package P03_Geometrik_Sekil_Hesaplama2;

public class C03_UCGEN extends C01_MainMenu2{
    protected static void ucgen() {
        System.out.println("");
        System.out.println("Ucgen hesaplama bolumune yonlendirildiniz");
        System.out.println("Bu bolumde ucgenin alanini ve cevre uzunlugunu bulabilirsiniz");
        System.out.println("");
        System.out.println("lutfen bilgilerini bulmak istediginiz ucgenin yuksekligini giriniz");
        yukseklik = scan.nextDouble();
        System.out.println("lutfen tabanin uzunlugunu giriniz");
        taban = scan.nextDouble();
        System.out.println("simdi kalan kenarlardan birini giriniz");
        kenar1 = scan.nextDouble();
        System.out.println("son olarak 3. kenari giriniz lutfen");
        kenar2 = scan.nextDouble();
        if (yukseklik<=0 || taban<=0 || kenar1<=0 || kenar2<=0){
            System.out.println("degerlerin hicbiri 0'dan kucuk veya esit olamaz, sizi tekrar yonlendiriyorum");
            ucgen();
        }
        System.out.println("Ucgenin cevresi verilen 3 kenarin toplamiyla bulunur");
        System.out.println("        alani da yukseklik*taban/2 formuluyle bulunur");
        System.out.println("Sonuc:");
        System.out.println("Alan:  "+(taban*yukseklik/2));
        System.out.println("Cevre: "+(taban+kenar1+kenar2));
    }
}
