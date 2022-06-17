import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        int kontrol = 0;
        for(int i = 2; i< 100;i++){
            for(int k=2;k<i;k++)
            {
                if(i%k == 0){
                    kontrol = 1;
                    break;
                }
            }
            if(kontrol == 0) out.print(i + " - ");
            kontrol = 0;
        }
    }
}