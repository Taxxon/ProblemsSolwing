import java.util.Scanner;

/**
 * Created by Emil Käck on 2017-02-27.
 */
public class PRGUppgif13_3 {
    public static void main(String[] arg) {
        RatTal[] tal = new RatTal[3];
        tal[0] = new RatTal();
        tal[0].t = 5;
        tal[0].n = 9;

        tal[1] = new RatTal();
        tal[1].t = 1;
        tal[1].n = 3;

        tal[2] = new RatTal();
        tal[2].t = 7;
        tal[2].n = 12;

        for (int i=0; i < tal.length; i++) {
            System.out.println(tal[i].t + "/" + tal[i].n);
        }
    }
}

