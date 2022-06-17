import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        String username="",password="";
        int kontrol = 0;
        int istek = 0;
        int giris = 0;
        int balance = 1500;
        out.println("Bora Bankasina Hosgeldin.");
        while(giris == 0)
        {
            out.print("Kullanici Adinizi Giriniz : ");
            username = oku.next();
            out.print("Sifrenizi Giriniz : ");
            password = oku.next();
            if(!(username.equals("admin") && password.equals("1234"))) {
                out.println("Kullanici adi/sifreniz yanlistir.");
                kontrol++;
            }
            else
                giris = 1;
            if(kontrol == 3){
                out.println("Hesabiniz bloke olmustur!");
                break;
            }
        }
        while(giris == 1)
        {
            int secim = 0;
            out.println("Yapmak istediginiz islemi secin : ");
            out.println("1-Hesap Sorgulama");
            out.println("2-Para Cekimi");
            out.println("3-Para Yatirma");
            out.println("4-Cikis");
            out.print("Yapmak istediginiz islemi seciniz : ");
            secim = oku.nextInt();

            switch (secim)
            {
                case 1:
                    out.println("Guncel Bakiyeniz : " + balance);
                    break;

                case 2:
                    out.print("Cekmek istediginiz bakiyeyi yaziniz : ");
                    int cekim = oku.nextInt();
                    balance -= cekim;
                    out.println("Para cekiminiz tamamlandi.Guncel bakiyeniz : " + balance);
                    break;

                case 3:
                    out.print("Yatirmak istediginiz bakiyeyi yaziniz : ");
                    int yatirim = oku.nextInt();
                    balance +=yatirim;
                    out.println("Para yatiriminiz tamamlandi.Guncel bakiyeniz : " +balance);
                    break;

                case 4:
                      giris=1;
                      break;

            }
        }
        out.println("Sistemden cikis yapildi!");

    }
}