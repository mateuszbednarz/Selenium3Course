public class Variables {

    // deklaracja zmiennych
    int firstNumber;
    int secondNumber;
    int sum;

    // deklaracja i inicjalizacja zmiennej w jednym miejscu
    int thirdNumber = 10;

    String name = "Matthew";

    public void sumCalc()
    {
        // inicjalizacja zmiennych
        firstNumber = 2;
        secondNumber = 5;
        sum = firstNumber + secondNumber;
        System.out.println("Suma dwóch liczb = " + sum);
    }
}
