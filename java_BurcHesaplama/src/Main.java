import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ay;
        int gun;
        out.print("Dogdugunuz Ayi Giriniz:  ");
        ay = scanner.nextLine();
        out.print("Dogdunuz Gunu Giriniz:  ");
        gun =scanner.nextInt();

        if(((ay.equals("Şubat") || ay.equals("Mart")) && (gun>0 && gun<21)) )
            out.println("Balık burcusunuz.");
        else if(((ay.equals("Ocak") || ay.equals("Şubat")) && (gun>0 && gun<23)) )
            out.println("Kova burcusunuz.");
        else if(((ay.equals("Aralık") || ay.equals("Ocak")) && (gun>0 && gun<21)) )
            out.println("Oğlak burcusunuz.");
        else if(((ay.equals("Kasım") || ay.equals("Aralık")) && (gun>0 && gun<21)) )
            out.println("Yay burcusunuz.");
        else if(((ay.equals("Ekim") || ay.equals("Kasım")) && (gun>0 && gun<21)) )
            out.println("Akrep burcusunuz.");
        else if(((ay.equals("Eylül") || ay.equals("Ekim")) && (gun>0 && gun<21)) )
            out.println("Terazi burcusunuz.");
        else if(((ay.equals("Ağustos") || ay.equals("Eylül")) && (gun>0 && gun<21)) )
            out.println("Başak burcusunuz.");
        else if(((ay.equals("Temmuz") || ay.equals("Ağustos")) && (gun>0 && gun<21)) )
            out.println("Aslan burcusunuz.");
        else if(((ay.equals("Haziran") || ay.equals("Temmuz")) && (gun>0 && gun<21)) )
            out.println("Yengeç burcusunuz.");
        else if(((ay.equals("Mayıs") || ay.equals("Haziran")) && (gun>0 && gun<21)) )
            out.println("İkizler burcusunuz.");
        else if(((ay.equals("Nisan") || ay.equals("Mayıs")) && (gun>0 && gun<21)) )
            out.println("Boğa burcusunuz.");
        else if(((ay.equals("Mart") || ay.equals("Nisan")) && (gun>0 && gun<21)) )
            out.println("Koç burcusunuz.");
        else
            out.println("Yanlis degerler girdiniz..");
    }
}