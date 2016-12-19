import javax.swing.*;

/**
 * Created by Emil Käck on 2016-12-19.
 */
public class Metoder {
    public static void main(String[] arg){
        // Tar reda på kostan utan moms och momsen och gör om det till en double sen anropar jag metoden uppgift 8.2 sida 174
        /**
        String Pris;
        Pris = JOptionPane.showInputDialog("Kostnad utan moms?");
        double Utanmoms = Double.parseDouble(Pris);
        Pris = JOptionPane.showInputDialog("Vad är momsen i procent?");
        double Moms = Double.parseDouble(Pris);
        double Medmoms = kostnad(Utanmoms, Moms);
        JOptionPane.showMessageDialog(null, "Kostnaden med moms = " + Medmoms);
        **/

        

    }
    // Metod för att beräkna kostnaden med moms i procent
    public static double kostnad (double a, double b) {
        return a*(b/100+1);
    }
}
