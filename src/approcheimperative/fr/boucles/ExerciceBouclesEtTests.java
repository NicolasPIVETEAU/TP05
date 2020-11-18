package approcheimperative.fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        for (int value : array){
            System.out.println(value);
        }

        for (int i = array.length-1; i >= 0; i-- ){
            System.out.println(array[i]);
        }

        for (int value : array){
            if (value > 3){
                System.out.println(value);
            }
        }

        for (int value : array){
            if (value%2 == 0){
                System.out.println(value);
            }
        }

        //Combiner une boucle et un test de manière à n’afficher que valeurs des indexpairs
        // 2 méthode
        // (1 boucle simple)
        for (int i = 0; i < array.length; i=i+2){
            System.out.println(array[i]);
        }
        //boucle+test
        for (int i = 0; i < array.length; i++){
            if (i%2 == 0){
                System.out.println(array[i]);
            }
        }

        //Combiner une boucle et un test de manière à n’afficher queles entiers impairs
        for (int value : array){
            if (value%2 != 0){
                System.out.println(value);
            }
        }
    }
}
