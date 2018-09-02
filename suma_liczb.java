package petle_warunki;

import java.util.Scanner;

public class suma_liczb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Program zsumuje podane przez Ciebie liczby, podanie cyfry '0' konczy program.");
        int suma = 0, liczba;
        do {
            System.out.print("Podaj liczbe:");
            liczba = s.nextInt();
            suma = suma+liczba;
        }while(liczba!=0);
        System.out.println("Suma Twoich liczb to: "+suma);
    }
}
