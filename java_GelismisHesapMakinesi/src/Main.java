import java.util.Scanner;

import static java.lang.System.out;

public class Main {



    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int secim=0;

        while(secim != -1)
        {
            out.println("1-Toplama");
            out.println("2-Cikarma");
            out.println("3-Carpma");
            out.println("4-Bolme");
            out.println("5-Uslu");
            out.println("6-Faktoriyel");
            out.println("7-Mod");
            out.println("8-Dikdortgen Alan");
            out.println("9-Dikdortgen Cevre");
            out.print("Istediginiz islemi seciniz : ");
            secim = oku.nextInt();

            switch (secim)
            {
                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    ussu();
                    break;
                case 5:
                    ussu();
                    break;
                case 6:
                    fakt();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    diktalan();
                    break;
                case 9:
                    diktcevre();
                    break;

            }
        }
    }

    static void toplama()
    {
        out.println("==========================");
        Scanner oku = new Scanner(System.in);
        int sayi1,sayi2;
        out.print("Sayi-1 Giriniz : ");
        sayi1 = oku.nextInt();
        out.print("Sayi-2 Giriniz :");
        sayi2 = oku.nextInt();
        int hesap = sayi1 + sayi2;
        out.println(sayi1 + " + " + sayi2 + " = " + hesap);
        out.println("==========================");
    }

    static void cikarma()
    {
        out.println("==========================");
        Scanner oku = new Scanner(System.in);
        int sayi1,sayi2;
        out.print("Sayi-1 Giriniz : ");
        sayi1 = oku.nextInt();
        out.print("Sayi-2 Giriniz :");
        sayi2 = oku.nextInt();
        int hesap = sayi1 - sayi2;
        out.println(sayi1 + " - " + sayi2 + " = " + hesap);
        out.println("==========================");
    }

    static void carpma()
    {
        out.println("==========================");
        Scanner oku = new Scanner(System.in);
        int sayi1,sayi2;
        out.print("Sayi-1 Giriniz : ");
        sayi1 = oku.nextInt();
        out.print("Sayi-2 Giriniz :");
        sayi2 = oku.nextInt();
        int hesap = sayi1 * sayi2;
        out.println(sayi1 + " * " + sayi2 + " = " + hesap);
        out.println("==========================");
    }

    static void bolme()
    {
        out.println("==========================");
        Scanner oku = new Scanner(System.in);
        int sayi1,sayi2;
        out.print("Sayi-1 Giriniz : ");
        sayi1 = oku.nextInt();
        out.print("Sayi-2 Giriniz :");
        sayi2 = oku.nextInt();
        double hesap = sayi1 / sayi2;
        out.println(sayi1 + " / " + sayi2 + " = " + hesap);
        out.println("==========================");
    }

    static void ussu()
    {
        out.println("==========================");
        Scanner oku = new Scanner(System.in);
        int sayi1,sayi2;
        out.print("Taban Giriniz : ");
        sayi1 = oku.nextInt();
        out.print("Ussu Giriniz :");
        sayi2 = oku.nextInt();
        double hesap = Math.pow(sayi1, sayi2);
        out.println(sayi1 + " us " + sayi2 + " = " + hesap);
        out.println("==========================");
    }
    static void fakt()
    {
        out.println("==========================");
        Scanner oku = new Scanner(System.in);
        int sayi1,fakt=1;
        out.print("Fakt alanacak sayiyi giriniz : ");
        sayi1 = oku.nextInt();

        for(int i=1;i<sayi1;i++)
            fakt *= i;
        out.println(sayi1 + "! = " + fakt);
        out.println("==========================");
    }

    static void mod()
    {
        out.println("==========================");
        Scanner oku = new Scanner(System.in);
        int sayi1,sayi2;
        out.print("Mod Alinacak Sayiyi Giriniz : ");
        sayi1 = oku.nextInt();
        out.print("Mod Giriniz :");
        sayi2 = oku.nextInt();
        double hesap = sayi1 % sayi2;
        out.println(sayi1 + " % " + sayi2 + " = " + hesap);
        out.println("==========================");
    }

    static void diktcevre()
    {
        out.println("==========================");
        Scanner oku = new Scanner(System.in);
        int sayi1,sayi2;
        out.print("Kisa Kenari Giriniz : ");
        sayi1 = oku.nextInt();
        out.print("Uzun Kenari Giriniz :");
        sayi2 = oku.nextInt();
        double hesap = 2 * (sayi1 + sayi2);
        out.println("2 x (" + sayi1 + " + " + sayi2 + ") = " + hesap);
        out.println("==========================");
    }

    static void diktalan()
    {
        out.println("==========================");
        Scanner oku = new Scanner(System.in);
        int sayi1,sayi2;
        out.print("Kisa Kenari Giriniz : ");
        sayi1 = oku.nextInt();
        out.print("Uzun Kenari Giriniz :");
        sayi2 = oku.nextInt();
        double hesap = (sayi1 * sayi2);
        out.println("" + sayi1 + " x " + sayi2 + " = " + hesap);
        out.println("==========================");
    }


}