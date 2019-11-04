import org.testng.annotations.Test;

public class MathOperators {

    @Test
    public void operatorsTest()
    {
        int firstNumber = 5;
        int secondNumber = 2;

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double quotient = (double)firstNumber / secondNumber;
        int modulo = secondNumber % firstNumber;

        System.out.println("Suma dwóch liczb = " + sum);
        System.out.println("Różnica dwóch liczb = " + difference);
        System.out.println("Iloczyn dwóch liczb = " + product);
        System.out.println("Iloraz dwóch liczb = " + quotient);
        System.out.println("Reszta z dzielenia dwóch liczb = " + modulo);

    }
}
