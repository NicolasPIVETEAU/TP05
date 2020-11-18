package approcheimperative.fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {

        int[] tableau = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(tableau[0]);
        System.out.println(tableau.length);
        System.out.println(tableau[tableau.length-1]);
        tableau[4] = 8;
        System.out.println(tableau[4]);
    }

}
