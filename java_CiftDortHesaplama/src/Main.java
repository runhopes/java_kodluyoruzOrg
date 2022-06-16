import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        int kontrol = 0;
        int toplam = 0;
        while(kontrol == 0)
        {
            out.print("Bir sayi giriniz : ");
            int sayi = oku.nextInt();
            if(sayi % 2 == 0) {
                if (sayi % 4 == 0)
                    toplam += sayi;
            }
            else
                kontrol = 1;
        }

        out.print("Sayilarin toplami : " + toplam);

    }
}