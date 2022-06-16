import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        out.print("Hesaplanacak yili giriniz : ");
        int yil = oku.nextInt();
        if((yil % 4 == 0) && (yil % 100 == 0))
            out.print(yil + " bir artik yildir !");
        else
            out.print(yil + " bir artik yil degildir. !");

    }
}