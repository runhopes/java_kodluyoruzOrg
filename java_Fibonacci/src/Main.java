import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        int sayi1=0,sayi2=1,toplam;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Seri sayisini girin: ");
        int seri=scanner.nextInt();
        for (int i=1; i<=seri; i++) {
            toplam=sayi1+sayi2;
            if(sayi1==0)
                System.out.print(sayi1);
            if(i==1)
                System.out.print("-"+i);
            System.out.print("-"+toplam);
            sayi1=sayi2;
            sayi2=toplam;
        }


    }
}