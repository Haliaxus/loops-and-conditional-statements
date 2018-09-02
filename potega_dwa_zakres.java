package petle_warunki;

import java.util.Scanner;

public class potega_dwa_zakres {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj zakres, do jakiego chcesz zobaczyc potege liczby 2: ");
        int a = s.nextInt();

        for(int i=2; i<=a; i=i*2)
        {
            System.out.println(i);
        }
    }
}
