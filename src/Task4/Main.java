package Task4;

public class Main {
    public static void main(String[] args) {

        int [] mass = new int[50];

        for (int i = 1, f = 0; i < 100; i+=2, f++) {
            mass[f] = i;
        }

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }

        System.out.println();

        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.print(mass[i] + " ");
        }
    }
}
