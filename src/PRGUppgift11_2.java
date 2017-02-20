import java.util.Scanner;

/**
 * Created by Emil Käck on 2017-02-20.
 */
public class PRGUppgift11_2 {
    public static void main(String[] arg) {
        //tar in talen i en lista
        double[] input = new double[20];
        System.out.println("Skriv dina tal från minst till störst");
        Scanner myScanner = new Scanner(System.in);
        int i = 0;
        int x;
        while (myScanner.hasNextDouble()) {
            double newInt = myScanner.nextDouble();
            input[i] = newInt;
            i++;

        }
        for(x=0; x<i; x++){
            System.out.println(input[x]);
        }
        i--;
        boolean sorterad = ärSorterad(input, i);
        System.out.println("Listans storkelsordning är " + sorterad);
    }


    public static boolean ärSorterad(double[] a, int b) {
        //lista för att titta på listan är i ordning
        boolean order = true;
        do {
            if (a[b - 1] > a[b]) {
                order = false;
            }
            b--;
        }while (b > 0);

        return order;
    }
}