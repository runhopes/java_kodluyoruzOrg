import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int sayi1,sayi2,sayi3;
        int enkucuk = 0,orta= 0,buyuk= 0;

        out.print("Birinci sayiyi giriniz : ");
        sayi1 = oku.nextInt();

        out.print("Ikinci sayiyi giriniz : ");
        sayi2 = oku.nextInt();

        out.print("Ucuncu sayiyi giriniz : ");
        sayi3 = oku.nextInt();

        if(sayi1 < sayi2 && sayi1 < sayi3)
            enkucuk = sayi1;
        if(sayi2 < sayi1 && sayi2 < sayi3)
            enkucuk = sayi2;
        if(sayi3 < sayi1 && sayi3 < sayi2)
            enkucuk = sayi3;

        if(sayi1 > sayi2 && sayi1 > sayi3)
            buyuk = sayi1;
        if(sayi2 > sayi1 && sayi2 > sayi3)
            buyuk = sayi2;
        if(sayi3 > sayi1 && sayi3 > sayi2)
            buyuk = sayi3;

        if(sayi1 != enkucuk && sayi1 != buyuk)
            orta = sayi1;
        if(sayi2 != enkucuk && sayi2 != buyuk)
            orta = sayi2;
        if(sayi3 != enkucuk && sayi3 != buyuk)
            orta = sayi3;

        out.print("Siralanan : " + enkucuk + " - " + orta + " - " + buyuk);

    }
}