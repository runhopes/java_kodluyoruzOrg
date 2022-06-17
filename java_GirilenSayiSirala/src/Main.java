import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        out.print("Kac sayi gireceksiniz : ");
        int sinir = oku.nextInt();
        int enbuyuk = 0;
        int enkucuk = 0;

        for(int i=0;i<sinir;i++)
        {
            out.print("Sayi giriniz : ");
            int sayi = oku.nextInt();

            if(sayi > enbuyuk)
                enbuyuk = sayi;
            else if (sayi<enkucuk || enkucuk == 0)
                enkucuk = sayi;
        }
        out.println("En buyuk sayi = " + enbuyuk);
        out.println("En kucuk sayi = " + enkucuk);

    }
}