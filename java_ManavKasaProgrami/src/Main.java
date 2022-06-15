import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        float armut,elma,domates,muz,patlican,sepet = 0;
        int sayi;

        armut = 2.14f;
        elma = 3.67f;
        domates = 1.11f;
        muz = 0.95f;
        patlican = 5.00f;

        Scanner oku = new Scanner(System.in);
        out.print("Armut Kac Kilo? : ");
        sayi = oku.nextInt();
        sepet += sayi * armut;

        out.print("Elma Kac Kilo? : ");
        sayi = oku.nextInt();
        sepet += sayi * elma;

        out.print("Domates Kac Kilo? : ");
        sayi = oku.nextInt();
        sepet += sayi * domates;

        out.print("Muz Kac Kilo? : ");
        sayi = oku.nextInt();
        sepet += sayi * muz;

        out.print("Patlican Kac Kilo? : ");
        sayi = oku.nextInt();
        sepet += sayi * patlican;

        out.println("Toplam Tutar : " + sepet + " TL");

    }
}