import java.util.*;

public class Exercice1 {

    public static void main(String[] args) {


        int tableau []= new int [5];

        if (args.length == tableau.length) {

            for (int i = 0; i < args.length; i++) {
                tableau[i] = Integer.parseInt(args[i]);
            }

        } else {

            for (int i = 0; i < tableau.length; i++) {
                boolean isDefined = false;
                do {
                    try {
                        tableau[i] = UI.askInt("Entrez un nombre entre entier ");
                        isDefined = true;
                    } catch (OutOfBoundsException e) {
                        System.out.println("Mauvais nombre...");
                    }
                } while (!isDefined);
            }

        }

        System.out.println("Voici le tableau avant le tri: "+Arrays.toString(tableau));

        int []bubbleTab=  Outils.insertionSort(tableau);
        System.out.println("Voici votre tableau trié: "+Arrays.toString(bubbleTab));

    }
}
    
