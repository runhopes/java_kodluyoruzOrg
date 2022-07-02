import java.util.*;
import java.io.*;
import static java.lang.System.out;

class Main {

    public static String LetterCapitalize(String str) {
        // code goes here

        //
        str=str.substring(0,1).toUpperCase();
        for(int i = 0;i<str.length();i++){
            String temp=Character.toString(str.charAt(i));
            if(temp.equals(" "))
                str = str.substring(i+1, i+2).toUpperCase();
            else
                str += temp;
        }


        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCapitalize(s.nextLine()));
    }

}