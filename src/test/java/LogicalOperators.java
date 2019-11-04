import org.testng.annotations.Test;

public class LogicalOperators {

    @Test
    public void logOpsTest()
    {
        int numberA = 2;
        int numberB = 5;

        System.out.println(numberA > numberB);      // FALSE
        System.out.println(numberA < numberB);      // TRUE
        System.out.println(numberA == numberB);     // FALSE
        System.out.println(numberA != numberB);     // TRUE
        System.out.println(numberA >= numberB);     // FALSE
        System.out.println(numberA <= numberB);     // TRUE

        System.out.println(1 > 0 && 1 > -1);        // TRUE
        System.out.println(1 > 2 || 0 > 2);         // FALSE
        System.out.println(2 > 3 && 1 > 0);         // FALSE
        System.out.println(1 > 0 || 3 > 5);         // TRUE
    }
}
