public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */

        // a)
        for (int i = 1; i <= 10; i++)
        {
            if (i == 7)
            {
                break;
            }
            System.out.println(i); // wyświetla się tylko do 6
        }
        System.out.println();

        // b)
        for (int j = 1; j <= 10; j++)
        {
            if (j == 2)
            {
                continue;
            }
            System.out.println(j); // Pętla pomija 2
        }
        System.out.println();

        // c)
        for (int k = 1; k < 10; k++)
        {
            if (k == 3)
            {
                return;
            }
            System.out.println(k); // Pętla wyświetla tylko do 2

        }
    }
}
