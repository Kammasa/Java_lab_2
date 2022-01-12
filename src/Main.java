import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */

// zad.1
//a) stworzyć tablicę typu int[20],
        int[] tablica1 = new int[20];

//d) wstawić wywołanie metody do metody main

        wypisywanieTablicy(uzupełnienieTablicy(tablica1));

//zad.2
//a) stworzyc tablicę typu String[6],
        String[] tablica2 = new String[6];
        wyświetlenieTablicy2(uzupełanianieTablicy2(tablica2));

//zad.3
        imieNazwiskoWiek("Kamil","Masacz",24);

//zad.4
        suma2metod();


    }
// Zad 1.b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 21,

    static int[] uzupełnienieTablicy(int[] tablica1) {
        for (int i = 0; i < tablica1.length; i++) {
            tablica1[i] = 40 - i;
        }
        return tablica1;
    }
// Zad 1.c) napisać metodę, która wypisze otrzymane wartości,

    static void wypisywanieTablicy(int[] tablica1) {
        for (int i = 0; i < tablica1.length; i++) {
            System.out.println(tablica1[i] + " ");
        }
    }
// Zad 2.b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury  (użyć do tego pętli i klasy Scanner),

    static String[] uzupełanianieTablicy2(String[] tablica2) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Wpisz " + tablica2.length + " słów");
        for (int j = 0; j < tablica2.length; j++) {
            tablica2[j] = scaner.nextLine();
        }
        return tablica2;
    }
// Zad 2.c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,

    static String[] wyświetlenieTablicy2(String[] tablica2) {
        int zmienna = tablica2.length - 1;
        for (int j = 0; j < tablica2.length; j++) {
            System.out.println(tablica2[zmienna - j] + " ");
        }
        return tablica2;
    }

// Zad.3.a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
   //wyświetla w konsoli string który ma być waszym imieniem,

    static void imie(String imie){
        System.out.println(imie + " ");
    }
//Zad.3.b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
    //wasze imie i nazwisko,

    static void imieNazwisko(String imie, String nazwisko){
        System.out.println(imie + " ");
        System.out.println(nazwisko + " ");
    }

//Zad.3.c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
    //nazwisko i wiek (int), a następnie wszystko wyświetli,

    static void imieNazwiskoWiek(String imie, String nazwisko, int wiek){
        System.out.println(imie + " ");
        System.out.println(nazwisko + " ");
        System.out.println(wiek + " ");
    }
//Zad.4.a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,

    static int suma2zmiennych(int a, int b){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj a i b");
        a = scan.nextInt();
        b = scan.nextInt();
        return a + b;
    }
//Zad.4.b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
    //którą przypiszemy do zmiennej,

    static int suma3zmiennych(int a, int b, int c){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj c");
        c = scan.nextInt();
        return a + b + c;
    }
//Zad.4.c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));

    static void suma2metod() {
        System.out.println("Wynik " + (suma2zmiennych(0,0) + suma3zmiennych(0,0,0)));
    }

}


