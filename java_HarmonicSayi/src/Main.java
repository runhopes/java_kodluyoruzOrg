import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        out.print("Sayi Giriniz : ");
        int sayi = oku.nextInt();

        double hesap = 0;
        for(double i = 1 ; i <= sayi;i++)
            hesap += (1/i);

        out.println("Sayinin harmonik hesabi : " + hesap);
    }
}