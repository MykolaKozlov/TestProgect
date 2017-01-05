package Task2;

public class Factorial {

    public Factorial () {

    }

    public long factorialNumber (long number) {

        if (number < 1) {
            System.out.println("Значение числа n не должно быть меньше 1");
            return number;
        } else {
            long factNumber = 1;
            for (long i = 1; i <= number; i++) {
                factNumber *= i;
            }
            return factNumber;
        }
    }
}
