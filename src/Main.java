import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */

        int i = 1000;
        do
        {
            if (i % 4 == 0 && i > 0)
            {
                System.out.printf("Liczba %s jest podzielna przez liczbe 4\n", i);
            }
        }
        while (--i >= 0) ;


        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */

        //a)
        int[] tabInt = {4,7,13,17,24,};
        int i = 0;
            while (i < tabInt.length)
            {
                System.out.println(tabInt[i]);
                i++;
            }

        //b)
        double[] tabDouble = {4.5,7.8,13.43,17.54,24.87,};
        int i = 0;
            while (i < tabDouble.length)
            {
                System.out.println(tabDouble[i]);
                i++;
            }

        //c)
        String[] tabString = new String[]{"Kasia", "Misia", "Basia", "Ela", "Mela"};
        int t = tabString.length - 1;
        String y;

            while(t >= 0)
            {
                y = tabString[t];
                System.out.println(y + " ");
                t--;
            }

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */

        int a = 8;
            while (a > 0) //Pętla będzie wypisywała 8 w nieskończoność
            {
                System.out.println(a);
            }

            while (a == 7) //Pętla nic nie wykona
            {
                System.out.println("wykonano zadanie");
            }



        }
    }
