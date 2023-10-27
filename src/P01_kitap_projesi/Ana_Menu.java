package P01_kitap_projesi;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Ana_Menu {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        menu();
    }

    public static void menu() {
        System.out.println("~~~~~~~~~~~~FYOSA Kitap magazasina hosgeldiniz~~~~~~~~~~~~");
        System.out.println("     * * lutfen yapmak istediginiz islemi seciniz * *");
        System.out.println("PS: Eger kitap eklemek istiyorsaniz 1'i tuslayiniz");
        System.out.println("* 1-kitap ekle *");
        System.out.println("* 2-numara ile kitap goruntule *");
        System.out.println("* 3-kitap adı ile kitap goruntule *");
        System.out.println("* 4-numara ile kitap sil *");
        System.out.println("* 5-tum kitaplari listele *");
        System.out.println("* 6-cikis *");
        System.out.print("= ");


        int secim = scan.nextInt();
        if (!(secim>=1 && secim<=6)){
            System.out.println("hatali giris yaptiniz lutfen size verilen seceneklerden birini seciniz");
            menu();
        }


        switch (secim){
            case 1:
                C01_Kitap_Ekle.ekle();
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            default:
                break;
        }
    }
}
