import org.testng.annotations.Test;

public class TypesCasting {

    @Test
    public void castTest()
    {
        int a = 1;
        double b = 3.99;

        double c = a + b;
        System.out.println("Value of 'c' = " + c);

        int d = a + (int)b;
        System.out.println("Value of 'd' = " + d);
    }

}
