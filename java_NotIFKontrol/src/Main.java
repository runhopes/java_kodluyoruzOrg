import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        float mat,fizik,turkce,kimya,muzik,ortalama;
        int girdi = 0;
        out.println("Mat notunuzu giriniz : ");
        mat = oku.nextFloat();
        if(!(mat > 0 && mat < 100)) girdi = 1;

        out.println("Fizik notunuzu giriniz : ");
        fizik = oku.nextFloat();
        if(!(fizik > 0 && fizik < 100)) girdi = 1;

        out.println("Turkce notunuzu giriniz : ");
        turkce = oku.nextFloat();
        if(!(turkce > 0 && turkce < 100)) girdi = 1;

        out.println("Kimya notunuzu giriniz : ");
        kimya = oku.nextFloat();
        if(!(kimya > 0 && kimya < 100)) girdi = 1;

        out.println("Muzik notunuzu giriniz : ");
        muzik = oku.nextFloat();
        if(!(muzik > 0 && muzik < 100)) girdi = 1;

        if(girdi == 0) {
            ortalama = (mat + fizik + turkce + kimya + muzik) / 5;
            out.print(ortalama);
        }
        else
            out.print("Tanimsiz not bulundu");




    }
}