package petle_warunki;

import java.util.Scanner;

public class calculator_switch {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    char znak, znak2;
    double a, b;
        System.out.print("Podaj 1 liczbe: ");
        a = s.nextDouble();
        System.out.print("Podaj 2 liczbe: ");
        b = s.nextDouble();
        do {
            do {
                System.out.println("Napisz znak dzialania jakie ma byc przeprowadzone na tych liczbach. (+)(-)(*)(/)");
                znak = s.next().charAt(0);
            } while (znak != '+' & znak != '-' & znak != '/' & znak != '*');
            switch (znak) {
                case '+':
                    double suma = a + b;
                    System.out.println("Suma wynosi: " + suma);
                    break;
                case '-':
                    double roznica = a - b;
                    System.out.println("Roznica wynosi: " + roznica);
                    break;
                case '/':
                    double iloraz = a / b;
                    System.out.println("Iloraz dzielenia wynosi: " + iloraz);
                    break;
                case '*':
                    double iloczyn = a * b;
                    System.out.println("Iloczyn wynosi: " + iloczyn);
                    break;
            }
            do {
                System.out.println("Czy chcesz wykonac jeszcze jedno dzialanie na tych liczbach? (T/N): ");
                znak2 = s.next().charAt(0);
            } while (znak2 != 'T' & znak2 != 'N');
        }while (znak2 == 'T');

    }
}
