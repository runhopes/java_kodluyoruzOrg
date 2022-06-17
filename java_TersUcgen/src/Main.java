import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        int sinir,satir = 1;
        out.print("Kac satirlik elmas istiyorsunuz? : ");
        sinir = oku.nextInt();
        satir = sinir;
        while(sinir > 0)
        {
            for(int i=0;i<(satir-sinir);i++)
                out.print(" ");
            for (int i = sinir;i>0;i--)
                out.print("*");
            for (int i = sinir;i>0;i--)
                out.print("*");

            out.println("");
            sinir--;
        }

    }
}