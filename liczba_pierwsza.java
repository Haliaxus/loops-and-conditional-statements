package petle_warunki;

import java.util.Scanner;

public class liczba_pierwsza {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, wskaznik = 0;
        System.out.println("Program sprawdzi czy podana liczba, jest liczba pierwsza.");
        System.out.print("Podaj liczbe: ");
        a = s.nextInt();
        for(int i = 2; i<a; i++)
        {
            if(a%i==0){
                System.out.println("Liczba nie jest liczba pierwsza.");
                wskaznik++;
                break;
            }
        }
        if(wskaznik==0) {
            System.out.println("Podana liczba jest liczba pierwsza, jej dzielniki to 1 oraz " + a);
        }
    }
}
