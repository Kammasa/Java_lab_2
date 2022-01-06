import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */

        Scanner scan = new Scanner((System.in));
        System.out.println("Wybierz opcję: ");
        System.out.println("1 - określenie parzystości");
        System.out.printf("2 - określenie podzielności przez 7\n");
        switch (scan.nextInt())
        {
            case 1 :
                int a;
                System.out.println("Podaj Liczbe całkowitą");
                a = scan.nextInt();
                if (a % 2 == 0)
                {
                    System.out.println("Liczba jest parzysta.");
                }
                else
                {
                    System.out.println("Liczba jest nieparzysta.");
                }
                break;

            case 2 :
                int b;
                System.out.println("Podaj Liczbe całkowitą");
                b = scan.nextInt();
                if (b % 7 == 0)
                {
                    System.out.printf("Liczba %s jest podzielna przez 7\n",b);
                }
                else
                {
                    System.out.printf("Liczba %s nie jest podzielna przez 7\n",b);
                }
                break;
        }
        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */

        String text = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        int[] litery = {0, 0, 0, 0, 0, 0};
        /* toCharArray() - metoda zamienia String na tablicę char[] */
        for (char zmiennaChar : text.toCharArray()) {
            switch (zmiennaChar) {
                case 'o':
                    ++litery[0];
                    break;
                case 'p':
                    ++litery[1];
                    break;
                case 'x':
                    ++litery[2];
                    break;
                case 'z':
                    ++litery[3];
                    break;
                case 'q':
                    ++litery[4];
                    break;
                case 'n','i','j','m','t','y':
                    ++litery[5];
                    break;
            }
        }
        System.out.printf("\nLiczba występuje\no: %d - razy\np: %d - razy\nx: %d - razy\nz: %d - razy\nq: %d - razy\npozostałe litery: %d - razy\n",
                litery[0], litery[1], litery[2], litery[3], litery[4],litery[5]);

    }
}
