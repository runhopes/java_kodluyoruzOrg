import java.util.Scanner;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {

        int hesap = 1;
        Scanner oku = new Scanner(System.in);
        out.print("Sayi Giriniz :  ");
        int sayi = oku.nextInt();

        out.print("Uslu Sayi Sinirini Giriniz :  ");
        int sinir = oku.nextInt();

        for(int i = 0; i < sinir; i++)
            hesap = hesap * sayi;
        out.print(sayi + " sayisinin " + sinir + " ussu :" + hesap);



    }
}