import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    static void tersCevir(String kelime)
    {
        String terskelime = "";
        for(int i=kelime.length()-1;i>=0;i--)
            terskelime += kelime.charAt(i);

        if(kontrol(kelime,terskelime) == true)
            out.print("Kelime Palindromik");
        else
            out.print("Kelime palindromik degildir");
    }

    static boolean kontrol(String kelime,String terskelime)
    {
        if(kelime.equals(terskelime))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        out.print("Kelimenizi Giriniz : ");
        String kelime = oku.nextLine();

        tersCevir(kelime);
    }
}