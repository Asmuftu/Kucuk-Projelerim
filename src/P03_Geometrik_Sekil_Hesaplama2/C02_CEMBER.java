package P03_Geometrik_Sekil_Hesaplama2;

public class C02_CEMBER extends C01_MainMenu2 {


    protected static void cember() {
        System.out.println("");
        System.out.println("Cember hesaplama bolumune yonlendirildiniz");
        System.out.println("Bu bolumde cemberin alanini ve cevre uzunlugunu bulabilirsiniz");
        System.out.println("");
        System.out.println("lutfen bilgilerini bulmak istediginiz cemberin yaricapini giriniz");
        yaricap = scan.nextDouble();
        if (yaricap<=0){
            System.out.println("yaricap 0'dan buyuk olmalidir, sizi tekrar yonlendiriyorum");
            cember();
        }
            System.out.println("yaricapi " + yaricap + " olan cemberin alani π*yaricap*yaricap formulu ile bulunur");
            System.out.println("                           cevresi 2*π*yaricap formulu ile bulunur");
            System.out.println("Sonuc:");
            System.out.println("Alan:  " + (yaricap * yaricap) + "π");
            System.out.println("Cevre: " + (2 * yaricap) + "π");

    }
}
