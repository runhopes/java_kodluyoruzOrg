import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {0,69,56,24,25,26,25,29,28,28,32,34,7,37,6,6};
        int tekrar = 0;
        int tekrarfrekans = 0;
        for(int i=0;i<dizi.length;i++)
        {
                for(int k=0;k<dizi.length;k++)
                {
                    if(dizi[i] == dizi[k]) {
                        tekrar = dizi[k];
                        tekrarfrekans++;
                    }
                }
            out.println("Tekrar Eden => " + tekrar + " - Frekans =>" + tekrarfrekans);
            tekrar = 0;
            tekrarfrekans = 0;
        }
    }
}