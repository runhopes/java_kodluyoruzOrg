import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        float boy,kilo,vki;

        Scanner oku = new Scanner(System.in);
        out.print("Lutfen boyunuzu (metre cinsinde) giriniz : ");
        boy = oku.nextFloat();

        out.print("Lutfen kilonuzu giriniz : ");
        kilo = oku.nextFloat();

        vki = kilo / (boy * boy);

        out.print("Vucut Kitle Indeksiniz :" + vki);
    }
}