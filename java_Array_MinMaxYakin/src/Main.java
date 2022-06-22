import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {15,12,788,1,-1,-778,2,0};
        Scanner oku = new Scanner(System.in);
        out.print("Sayiyi Giriniz : ");
        int sayi = oku.nextInt();

        int min = 0;
        int max = 0;

        for(int i=0;i<dizi.length;i++)
            if(dizi[i] > max)
                max = dizi[i];

        for(int i=0;i<dizi.length;i++)
        {
            if(dizi[i] > min && dizi[i] < sayi)
                min = dizi[i];
            else if(dizi[i] < max && dizi[i] > sayi)
                max = dizi[i];
        }

        out.println("Girilen Sayi :" + sayi);
        out.println("Girilen sayidan kucuk en yakin Sayi:" + min);
        out.println("Girilen sayidan buyuk en yakin Sayi:" + max);
    }
}