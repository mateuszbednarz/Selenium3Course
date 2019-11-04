import org.testng.annotations.Test;

public class MethodsParameters {

    public int sum(int numberA, int numberB)
    {
        // sum = numberA + numerB;
        return numberA + numberB;
    }

    @Test
    public void parametersTest()
    {
        int sum = sum(20,94);
        System.out.println("Sum (1) = " + sum);
        System.out.println("Sum (2) = " + sum(49,12));
    }
}
