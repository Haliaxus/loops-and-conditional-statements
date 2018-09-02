package petle_warunki;

import java.util.Scanner;

public class dzielniki_liczby {

    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("Program wypisze wszystkie dzielniki Twojej liczby.");
        System.out.print("Podaj liczbe: ");
        a = s.nextInt();
        for(int i=1; i<a; i++)
        {
            if(a%i==0) System.out.print(i + ", ");
        }
        System.out.print(a+".");
    }
}
