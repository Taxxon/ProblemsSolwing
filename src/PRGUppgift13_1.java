import javax.swing.*;

/**
 * Created by emka15 on 2017-02-20.
 */
public class PRGUppgift13_1 {
    public static void main(String[]arg){
        //Ger värde på classen Bok och skriver ut den
        Bok albin = new Bok();
        albin.titel = "Albin";
        albin.författare = "Samuel";
        albin.pris = 2000.99;
        albin.sidantal = 420;
        Bok javabok = new Bok();
        System.out.println("Titel " + albin.titel + "\nFörfattare " + albin.författare + "\nPris " + albin.pris + "\nSidantal " + albin.sidantal);
        javabok.sidantal = 2;
        javabok.pris = 2.99;
        javabok.författare = "Alex";
        javabok.titel = "JavaBok";
        System.out.println("Titel " + javabok.titel + "\nFörfattare " + javabok.författare + "\nPris " + javabok.pris + "\nSidantal " + javabok.sidantal);

    }
}
