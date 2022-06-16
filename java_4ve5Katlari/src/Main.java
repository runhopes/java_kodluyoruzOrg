import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        int kontrol = 0;
        int toplam = 0;
        int kat = 1;
        out.print("Bir sayi giriniz : ");
        int sayi = oku.nextInt();
        for(int i = 1;i<sayi;i++) {
            kat = kat * 4;
            out.println("4un "+ i + " kati : " + kat);
        }
        kat = 1;
        for(int i = 1;i<sayi;i++) {
            kat = kat * 5;
            out.println("5in "+ i + " kati : " + kat);
        }

    }
}