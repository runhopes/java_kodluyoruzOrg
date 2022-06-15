import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        float yaricap,alan,merkezalan;
        float pi = 3.14f;

        Scanner oku = new Scanner(System.in);
        out.println("Dairenin yari capini giriniz : ");
        yaricap = oku.nextFloat();

        out.println("Dairenin merkez alani giriniz : ");
        merkezalan = oku.nextFloat();

        alan = (pi * (yaricap * yaricap) * merkezalan) / 360;

        out.print("Dairenin Alani : " + alan);
    }
}