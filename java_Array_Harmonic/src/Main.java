import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double hesap = 0;
        int uzunluk = numbers.length;
        for(int i=0;i<uzunluk;i++)
            hesap += 1/numbers[i];

        double sonuc = uzunluk/hesap;
        out.println("Sayilarin Harmonic Hesabi : " + sonuc);

    }
}