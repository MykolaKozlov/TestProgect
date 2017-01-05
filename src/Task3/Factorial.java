package Task3;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(0));
    }

    public static long fact(long number) {

        if (number < 1) {
            System.out.println("Значение числа n не должно быть меньше 1");
            return number;
        } else {
            int resalt = 1;
            while (number != 0) {
                resalt *= number;
                number--;
            }
            return resalt;
        }
    }
}
