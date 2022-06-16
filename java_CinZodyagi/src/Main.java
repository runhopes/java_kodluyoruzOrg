import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int dogumyili = 0;
        out.print("Dogum yilinizi giriniz : ");
        dogumyili = oku.nextInt();

        if(dogumyili % 12 == 0)
            out.print("Cin Zodyagi Burcunuz : Maymun");
        if(dogumyili % 12 == 1)
            out.print("Cin Zodyagi Burcunuz : Horoz");
        if(dogumyili % 12 == 2)
            out.print("Cin Zodyagi Burcunuz : Köpek");
        if(dogumyili % 12 == 3)
            out.print("Cin Zodyagi Burcunuz : Domuz");
        if(dogumyili % 12 == 4)
            out.print("Cin Zodyagi Burcunuz : Fare");
        if(dogumyili % 12 == 5)
            out.print("Cin Zodyagi Burcunuz : Öküz");
        if(dogumyili % 12 == 6)
            out.print("Cin Zodyagi Burcunuz : Kaplan");
        if(dogumyili % 12 == 7)
            out.print("Cin Zodyagi Burcunuz : Tavşan");
        if(dogumyili % 12 == 8)
            out.print("Cin Zodyagi Burcunuz : Ejderha");
        if(dogumyili % 12 == 9)
            out.print("Cin Zodyagi Burcunuz : Yılan");
        if(dogumyili % 12 == 10)
            out.print("Cin Zodyagi Burcunuz : At");
        if(dogumyili % 12 == 11)
            out.print("Cin Zodyagi Burcunuz : Koyun");

    }
}