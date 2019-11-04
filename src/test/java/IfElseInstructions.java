import org.testng.annotations.Test;

public class IfElseInstructions {

    @Test
    public void instructionTest()
    {
        checkAge(17);
        checkAge(18);
    }

    public void checkAge(int age)
    {
        if (age < 18)
            System.out.println("You CAN'T sell alcohol this person! It's prohibited!");
        else
            System.out.println("You CAN sell alcohol!");
    }
}
