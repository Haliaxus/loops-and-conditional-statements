package petle_warunki;

import java.util.Scanner;

public class suma_ciagu {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj pierwsza cyfre, od ktorej program ma zaczac liczyc ciag: ");
        int a = s.nextInt();
        System.out.print("Podaj liczbe konczaca ciag: ");
        int b = s.nextInt();
        int sumafor =0, sumawhile=0, sumado=0, c=a, d=a;
        for(int i=a; i<=b; i++)
        {
            sumafor = sumafor+i;
        }
        while(c<=b)
        {
            sumawhile = sumawhile+c;
            c++;
        }
        do{
            sumado = d+sumado;
            d++;
        }while(d<=b);

        System.out.println("Petla for: "+sumafor+", petla while: "+sumawhile+", a petla do while: "+sumado);
    }
}
