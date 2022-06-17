import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        int toplam = 0;
        Scanner oku = new Scanner(System.in);
        while(1==1)
        {
            out.print("Sayiyi gireceksiniz : ");
            int sayi = oku.nextInt();
            for(int i=1;i<sayi;i++) {
                if (sayi % i == 0)
                    toplam += i;
            }
            if(toplam == sayi)
                out.println("Girdiginiz sayi bir mukemmel sayidir.");
            else
                out.println("Girdiginiz sayi mukemmel sayi degildir.");
            toplam = 0;
        }



    }
}