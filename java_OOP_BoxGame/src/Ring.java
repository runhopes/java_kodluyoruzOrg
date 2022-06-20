import java.util.Random;

import static java.lang.System.out;

public class Ring {
    Fighter f1;
    Fighter f2;
    String name;
    int baslayan;
    Random rand = new Random();
    Ring(Fighter f1,Fighter f2,String name)
    {
        this.f1 = f1;
        this.f2 = f2;
        this.name = name;
    }
    void baslat()
    {
        baslayan = rand.nextInt(2);
        if(baslayan == 0)
            out.println("Maca baslayan " + this.f1.name + "!");
        else
            out.println("Maca baslayan " + this.f2.name + "!");
        fight();
    }
    void fight(){
    int round = 1;
        while(this.f1.health > 0 && this.f1.health > 0)
        {
            out.println("================ "+this.name + " Ringinde Round - " + round + "====================");

            int f1_fightdamage = rand.nextInt(20);
            int f2_fightdamage = rand.nextInt(20);
            if(baslayan == 0) {
                f2.health -= f1_fightdamage;
                f1.health -= f2_fightdamage;
            }
            else {
                f1.health -= f1_fightdamage;
                f2.health -= f2_fightdamage;
            }

            out.println(this.f1.name + ","+this.f2.name+" dovuscusune " + f1_fightdamage + " hasar verdi.");
            out.println(this.f2.name + ","+this.f1.name+" dovuscusune " + f2_fightdamage + " hasar verdi.");

            if(f1.health < 0)
                f1.health = 0;
            if(f2.health < 0)
                f2.health = 0;

            out.println("Hasar sonrasi " + this.f1.name + " kalan cani : "+ this.f1.health);
            out.println("Hasar sonrasi " + this.f2.name + " kalan cani : "+ this.f2.health);
            out.println("=======================================");
            round++;
        }
        kazanan();
    }
    void kazanan()
    {
        if(f1.health == 0 && f2.health != 0) {
            out.println("Maci kazanan : " + f2.name);
        }
        else if(f2.health == 0 && f1.health != 0)  {
            out.println("Maci kazanan : " + f1.name);
        }
        else if(f2.health == 0 && f1.health == 0){
            out.println("AMAN ALLAHIM,MAC BERABERE!");
        }
    }
}


