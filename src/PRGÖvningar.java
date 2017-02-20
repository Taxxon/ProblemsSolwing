import java.util.Scanner;

/**
 * Created by Emil Käck on 2017-01-18.
 */
public class PRGÖvningar {
    public static void main(String[]arg){
        //Uppgift 2.2 programet tar in ditt namn och efternamn sen printar den ut ditt förnamn.
        /**
        System.out.print("Enter you're name with you're last name first");
        Scanner scanner = new Scanner(System.in);
        String[] name = scanner.nextLine().split(" ");
        System.out.println("Hej " + name[1]);
        String input = scanner.nextLine();
        System.out.print("Hej " + input.substring(input.lastIndexOf(" ")));
        **/

        //Uppgift 3.4 där den tar alla kordinater sen använder den klassen Avstånd för att räkna ut avståndet från kordinaterna.
        /**
        System.out.print("Skriv x kordenaten på första punkten");
        Scanner scanner = new Scanner(System.in);
        String punktx1 = scanner.nextLine();
        double x1 = Double.parseDouble(punktx1);
        System.out.print("Skriv y kordenaten på första punkten");
        String punkty1= scanner.nextLine();
        double y1 = Double.parseDouble(punkty1);
        System.out.print("Skriv x kordentaten på andra punkten");
        String punktx2 = scanner.nextLine();
        double x2 = Double.parseDouble(punktx2);
        System.out.print("Skriv y kordenaten på andra punkten");
        String punkty2 = scanner.nextLine();
        double y2 = Double.parseDouble(punkty2);
        double distance = Avstånd.kordinat(x1, x2, y1, y2);
        System.out.print("Avståndet är" + distance);
         **/
    }
    static class Avstånd {
        public static double kordinat (double a1,double a2, double b1, double b2) {
            double squareA=(a1-a2)*(a1-a2);
            double squareB=(b1-b2)*(b1-b2);
            return (Math.sqrt(squareA + squareB));
        }
    }
}
