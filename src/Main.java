import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.*;


public class Main {

    public static void main(String[] args) {
//Zad.1
        Zwierzęta();
//Zad.2
        setLiczby();

    }
    /* ćw_6 Listy */


//zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
    //Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
    //elementów i elementami mają być nazwy zwierząt.

    static void Zwierzęta() {
        List<String> zwierzęta = new ArrayList<>();
        Scanner scan = new Scanner((System.in));
        System.out.println("Wpisz 6 nazw zwierząt ");

//b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
        //-- podpowiedź: for(String zmienna : List<String>)
        for (int i = 0; i < 6; i++) {
            zwierzęta.add(scan.nextLine());
        }

        for (String zw : zwierzęta) {
            System.out.println(zw + " ");
        }
//c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
        //następnie wyświetlić listę i wielkość listy,

        zwierzęta.remove(4);
        zwierzęta.remove(4);
        zwierzęta.add("Kot");
        zwierzęta.add("Pies");
        zwierzęta.add("Szczur");
        System.out.println("To zwierzęta z listy wielkości " + zwierzęta.size() + " " + zwierzęta);

//d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
        //elementów listy
        Collections.reverse(zwierzęta);
        for (String zw : zwierzęta) {
            System.out.println(zw + " ");
        }
    }


    // zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
    // niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
    //a następnie przeiterować i wyświetlić forEach-em (jak wyżej)

    static void setLiczby() {

        Set<Integer> Liczby = new TreeSet<>();
        Scanner scaner = new Scanner((System.in));

        System.out.println("Wpisz 10 liczb, liczby mogą się powtarzać:");
        for (int i = 0; i < 10; i++) {
            Liczby.add(scaner.nextInt());
        }
        System.out.println("Wpisane Liczby: " + Liczby);
    }
}



