package petle_warunki;

import java.util.Scanner;

public class suma_cyfr_w_liczbie {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, wskaznik = 0, suma = 0;
        double sumanp=0, sumap=0, wskaznik1=0, wskaznik2=0, srednianp, sredniap;
        System.out.print("Podaj liczbe do obliczenia sumy jej cyfr: ");
        a = s.nextInt();
        String liczba = String.valueOf(a);
        while(wskaznik < liczba.length())
        {
            suma = suma + Integer.parseInt(String.valueOf(liczba.charAt(wskaznik)));
            if(Integer.parseInt(String.valueOf(liczba.charAt(wskaznik))) % 2 == 0 )
            {
                sumap+=Integer.parseInt(String.valueOf(liczba.charAt(wskaznik)));
                wskaznik1++;
            }
            else
            {
                sumanp+=Integer.parseInt(String.valueOf(liczba.charAt(wskaznik)));
                wskaznik2++;
            }
            wskaznik++;
        }
        if(wskaznik1==0)
        {
            System.out.println("Brak liczb parzystych do wyliczenia sredniej");
        }
        else {
            sredniap = sumap / wskaznik1;
            System.out.println("Srednia liczb parzystych: "+sredniap);
        }
        if(wskaznik2==0)
        {
            System.out.println("Brak liczb nieprzarzystych do wyliczenia sredniej");
        }
        else {
            srednianp = sumanp / wskaznik2;
            System.out.println("Srednia liczb nieparzystych: "+srednianp);
        }
        System.out.println(suma+" to Twoja suma cyfr.");
    }
}
