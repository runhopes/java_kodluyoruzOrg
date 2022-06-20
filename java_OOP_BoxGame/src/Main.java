public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Bora",60,100);
        Fighter f2 = new Fighter("Ahmet",58,100);
        Ring r1 = new Ring(f1,f2,"ABD");

        r1.baslat();

    }
}