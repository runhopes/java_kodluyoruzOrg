import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        float ucgkenar1,ucgkenar2,ucgkenar3,ucgcevre,ucgalan,ucgu;

        Scanner oku = new Scanner(System.in);
        out.print("Ucgenin 1.kenarini giriniz : ");
        ucgkenar1 = oku.nextFloat();

        out.print("Ucgenin 2.kenarini giriniz : ");
        ucgkenar2 = oku.nextFloat();

        out.print("Ucgenin 3.kenarini giriniz : ");
        ucgkenar3 = oku.nextFloat();

        ucgcevre = (ucgkenar1 + ucgkenar2 + ucgkenar3);

        ucgu = ucgcevre / 2;
        ucgalan = (ucgu*(ucgu-ucgkenar1)*(ucgu-ucgkenar2)*(ucgu-ucgkenar3));
        ucgalan = (float) Math.sqrt(ucgalan);

        out.println("Ucgenin Cevresi : " + ucgcevre);
        out.print("Ucgenin Alani : " + ucgalan);

    }
}