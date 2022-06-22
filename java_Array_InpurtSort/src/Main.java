import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        out.print("Dizinin boyutunu giriniz :");
        int boyut = oku.nextInt();

        int[] dizi = new int[boyut];
        for(int i=0;i<boyut;i++)
        {
            out.print(i+".elemani giriniz : ");
            int deger = oku.nextInt();
            dizi[i] = deger;
        }
        Arrays.sort(dizi);
        out.print("Siralanan Dizi : " + Arrays.toString(dizi));


    }
}