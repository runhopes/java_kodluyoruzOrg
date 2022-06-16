import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int hava = 0;
        out.println("Hava Durumunu Giriniz : ");
        hava = oku.nextInt();

        if(hava > 0 && hava <5)   out.print("Kayak yapmanizi oneririm.");
        if(hava > 10 && hava <15)   out.print("Sokakta gezinti yapmanizi oneririm.");
        if(hava > 15 && hava <25)   out.print("Sahil yürüyüşü yapmanizi oneririm.");
        if(hava > 25 && hava <35)   out.print("Bisiklet yürüyüşü yapmanizi oneririm.");
        if(hava > 35)   out.print("Denize girmenizi oneririm.");

    }
}