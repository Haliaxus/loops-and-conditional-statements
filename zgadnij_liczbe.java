package petle_warunki;

import java.util.Random;
import java.util.Scanner;

public class zgadnij_liczbe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("System wylosowal dla Ciebie liczbe z zakresu 1-100. Odgadnij ja.");
        Random r = new Random();
        int a = r.nextInt(100)+1;
        int b, suma=0;
        do{
            System.out.print("Podaj liczbe: ");
            b = s.nextInt();
            suma++;
            if(b>a) System.out.println("Za duza wartosc");
            else if(b<a) System.out.println("Za mala wartosc");
            else System.out.println("Brawo, odgadles liczbe w "+suma+" ruchach");
        }while(b!=a);

    }
}
