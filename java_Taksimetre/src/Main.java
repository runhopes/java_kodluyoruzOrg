import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        float kmbasi = 2.20f;
        int minimum = 20;
        int taksimetre = 10;
        float ucret;
        int km = 0;
        Scanner oku = new Scanner(System.in);
        out.println("Kac km yol gideceksiniz?");
        km = oku.nextInt();
        ucret = km * kmbasi + taksimetre;
        if(ucret < 20) ucret = 20;
        out.print("Toplam odenecek ucret : " + ucret );


    }
}