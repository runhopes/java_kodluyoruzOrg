import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner oku = new Scanner(System.in);

        int bulunacaksayi =rand.nextInt(100);
        int can = 15;
        int tahmin;

        while(can > 0)
        {
            out.print("Tahmininizi giriniz : ");
            tahmin = oku.nextInt();

            if(tahmin < 100)
            {
                if(tahmin < bulunacaksayi) {
                    out.println("Yahu azcik yuksek soyle.");
                    can--;
                }
                else if (tahmin > bulunacaksayi) {
                    out.println("Cok dedin onu,dus biraz dus");
                    can--;
                }
                else if (tahmin == bulunacaksayi) {
                    out.print("Heh buldun iste!");
                    break;
                }
            }
            else
            {
                out.print("Dikkat! Lutfen 100'den kucuk sayi giriniz.");
            }
        }

        if(can == 0)
            out.print("Hakkiniz bitti.Dogru cevap : " + bulunacaksayi);
    }
}