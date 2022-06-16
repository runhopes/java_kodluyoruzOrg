import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        String username = "admin",userpass="1234";
        String enterusername,enteruserpass,controller;

        out.print("Enter the username : ");
        enterusername = oku.next();

        out.print("Enter the user pass :");
        enteruserpass = oku.next();

        if(enterusername.equals(username)) {
            if (enteruserpass.equals(userpass)) {
                out.print("Girisiniz yapildiniz,hosgeldiniz.");
            }
            else {
                out.print("Sifreniz yanlis,degistirmek ister misiniz? (1- Evet / 2 - Hayir) : ");
                controller = oku.next();

                if(controller.equals("1")){
                    out.print("Sifrenizi giriniz :");
                    enteruserpass = oku.next();
                    if (enteruserpass.equals(userpass)) {
                        out.print("Eski sifreniz ile ayni olamaz,sifre olusturulamadi. :");
                    } else {
                        out.print("Yeni sifreniz olusturuldu.");
                    }
                }
                else
                {
                    out.print("Sifre olusturmaktan vazgectiniz.");
                }
            }
        }
        else
            out.print("Kullanici adi ve sifre yanlistir.");
    }
}