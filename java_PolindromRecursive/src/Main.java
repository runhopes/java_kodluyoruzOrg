import java.util.Scanner;
import static java.lang.System.out;

public class Main {

    public static int terssayi = 0;
    static int sayiKontrol(int sayi)
    {

        if(sayi <= 0) {
            return terssayi;
        }
        terssayi *=10;
        terssayi += sayi%10;
        return sayiKontrol(sayi/10);
    }


    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        out.print("Sayiyi giriniz : ");
        int sayi = oku.nextInt();
        if(sayiKontrol(sayi) == sayi)
            out.print("Sayilar esit,polindrom sayidir..");
        else
            out.print("Sayilar esit degil,polindrom sayi degildir.");
    }
}