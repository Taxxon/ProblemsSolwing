import javax.swing.*;

/**
 * Created by Emil Käck on 2016-11-28.
 */

public class PRG1Uppgift1 {
    public static void main(String[] arg){
/**
        String Numbers= "";
        int rows=9;

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++)
                Numbers = Numbers + " " + i*j;
                Numbers = Numbers + "\n";
        }

        JOptionPane.showMessageDialog(null, Numbers);
**/
/** Assignment 5.5 Page 122 **/

        double absolut = 0.00001;
        int delat = 1;
        double tal = 0;
        double svar = 0;

        do {
            tal = 1 / delat;
            delat = delat + 1;
            svar = svar + tal;
            tal = 1 / delat;
            delat = delat + 1;
            svar = svar - tal;
        }   while (svar>=absolut);

        JOptionPane.showMessageDialog(null, svar);

    }

}

