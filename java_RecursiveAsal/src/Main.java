import java.util.Scanner;

public class Main {
    static int asalsayi = 2;
    public static int asalKontrol(int sayi,int asalsayi)
    {
        if(asalsayi == sayi)
            return 1;
        if(sayi%asalsayi == 0)
            return 0;

        asalsayi++;
        return  asalKontrol(sayi,asalsayi);
    }
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayiyi Giriniz : ");
        int sayi = oku.nextInt();
        int kontrol = asalKontrol(sayi,asalsayi);
        if(kontrol == 0)
            System.out.println("Sayi asal degildir.");
        else
            System.out.println("Sayi asaldir.");


    }
}