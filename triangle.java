package petle_warunki;

import java.util.Scanner;

public class triangle {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj 3 boki prostokąta, aby sprawdzic czy moze powstac z niego trojkat.");
        int a, b, c;
        System.out.print("Podaj bok pierwszy: ");
        a = s.nextInt();
        System.out.print("Podaj bok drugi: ");
        b = s.nextInt();
        System.out.print("Podaj bok trzeci: ");
        c = s.nextInt();

        if(a<b+c&&b<c+a&&c<a+b)
            System.out.println("Z tych bokow zbudujesz trojkat.");
        else
            System.out.println("Z tego trojkata nie bedzie.");
    }
}
