package Task5;

public class Main {

    public static void main(String[] args) {
        int [] mass = new int[20];

        mass[0] = 1;
        mass[1] = 1;

        for (int i = 0, j = 1, k = 2; k < mass.length; i++, j++, k++) {
            mass[k] = mass[i] + mass[j];
        }

        for (int i: mass) {
            System.out.println(i);
        }
    }
}
