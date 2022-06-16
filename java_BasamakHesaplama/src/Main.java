import java.util.Scanner;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {

        int toplam = 0;
        Scanner oku = new Scanner(System.in);
        out.print("Sayi Giriniz : ");
        int sayi = oku.nextInt();

        int sonuc = 1;
        int toplambasamak = 0;
        int basamak = 10;
        while(sonuc != sayi)
        {
            sonuc = sayi % basamak;
            basamak = basamak * 10;
            toplambasamak++;
        }

        basamak = 10;
        for(int i = 1; i <= toplambasamak; i++){
            int hesap = (sayi % (basamak));
            hesap = (hesap - (hesap % (basamak/10))) / (basamak/10);
            basamak = basamak * 10;
            toplam = toplam + hesap;
        }
        out.println("Basamaklarin toplami :" + toplam);


    }
}