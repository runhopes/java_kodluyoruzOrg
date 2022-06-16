import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        float sayi1,sayi2,sonuc=0;
        int kontrol;
        out.println("Hesap Makinesine Hosgeldiniz");

        out.print("Birinci Sayiyi Giriniz : ");
        sayi1 = oku.nextFloat();

        out.print("Ikinci Sayiyi Giriniz : ");
        sayi2 = oku.nextFloat();

        out.println("Yapmak istediginiz islemi seciniz :");
        out.println("1-Toplama / 2-Cikarma / 3-Bolme / 4-Carpma");
        out.print("Islem : ");
        kontrol = oku.nextInt();

        switch (kontrol)
        {
            case 1:
                sonuc = sayi1 + sayi2;
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                break;
            case 3:
                sonuc = sayi1 / sayi2;
                break;
            case 4:
                sonuc = sayi1 * sayi2;
                break;
            default:
                out.println("Gecerli bir islem giriniz");
                break;
        }

        out.print(sonuc);







    }
}