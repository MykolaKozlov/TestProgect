package Task6;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] mass = new int[8][5];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = random.nextInt(90) + 10;
            }
        }

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}
