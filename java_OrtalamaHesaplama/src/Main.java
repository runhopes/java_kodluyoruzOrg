import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Scanner tarama = new Scanner(System.in);
        float mat,fizik,kimya,turkce,tarih,muzik,ortalama;
        out.print("Matematik Notunuzu Giriniz : ");
        mat = tarama.nextFloat();

        out.print("Fizik Notunuzu Giriniz : ");
        fizik = tarama.nextFloat();

        out.print("Kimua Notunuzu Giriniz : ");
        kimya = tarama.nextFloat();

        out.print("Turkce Notunuzu Giriniz : ");
        turkce = tarama.nextFloat();

        out.print("Tarih Notunuzu Giriniz : ");
        tarih = tarama.nextFloat();

        out.print("Müzik Notunuzu Giriniz : ");
        muzik = tarama.nextFloat();

        ortalama = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        out.println("Suan ki Ortalamaniz : " + ortalama);

        boolean geciskontrol = ortalama > 60;

        String kontrol = geciskontrol ? "Tebrikler,sinifi gectiniz!":"Malesef sinifta kaldınız.";

        out.print(kontrol);


    }
}