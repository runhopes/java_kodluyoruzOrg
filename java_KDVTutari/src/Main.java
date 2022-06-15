import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args)
    {
        float kdvlifiyat = 0,kdvsizfiyat,kdvorani,kdv;

        Scanner oku = new Scanner(System.in);
        out.print("KDV'siz fiyatini giriniz :");
        kdvsizfiyat = oku.nextFloat();
        if(kdvsizfiyat < 1000)
            kdvorani = 18;
        else
            kdvorani = 8;
        kdv = ((kdvsizfiyat * kdvorani) / 100);
        kdvlifiyat = kdvsizfiyat + kdv;

        out.println("KDV'siz fiyati : " + kdvsizfiyat);
        out.println("KDV'li fiyati : " + kdvlifiyat);
        out.println("KDV orani %: " + kdvorani);
        out.println("KDV Tutari %: " + kdv);


    }
}