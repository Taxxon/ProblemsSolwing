import java.util.Scanner;

/**
 * Created by Emil Käck on 2017-02-13.
 */
public class PRGUppgift11_1 {
    public static void main(String[]arg){

        int a = 0;
        //int[] integer = readData(a);
        readData(a);
    }

    public static int[] readData(int a) {
        //titttar igenom listan och sätter in talet om det inte finns
        int[] input = new int[1000];
        System.out.println("Ange din data, Avsluta med End of File");
        Scanner myScanner = new Scanner(System.in);
        int i;
        int x = 0;
        while (myScanner.hasNextInt()) {
            int newInt = myScanner.nextInt();
            boolean found = false;
            for (i = 0; i <= x; i++) {
                if (input[i] == newInt) {
                    found = true;
                }
            }
            if (!found) {
               input[x]=newInt;
                x = x + 1;
            }
        }
        for(i=0; i<x; i++){
            System.out.println(input[i]);
        }
        return input;
    }
}
