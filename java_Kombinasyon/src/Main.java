import java.util.Scanner;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {

        int sinir = 0,nhesap=1,rhesap=1,n,r,nrhesap = 1,nrfark;

        Scanner oku = new Scanner(System.in);
        out.print("Kombinasyon (r) Giriniz : ");
        r = oku.nextInt();

        out.print("Kombinasyon (n) Giriniz : ");
        n = oku.nextInt();

        nrfark = n-r;

        for(int i = 1; i < r ; i++)
            rhesap = rhesap * i;

        for(int i = 1; i < n ; i++)
            nhesap = nhesap * i;

        for(int i = 1; i < nrfark ; i++)
            nrhesap = nrhesap * i;

        float kombinasyon = nhesap / (rhesap * nrhesap);

        out.print("Kombinasyon Hesabi : " + kombinasyon);

    }
}