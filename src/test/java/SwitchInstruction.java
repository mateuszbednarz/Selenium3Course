import org.testng.annotations.Test;

public class SwitchInstruction {

    @Test
    public void switchInsTest()
    {
        weekdayDisplay(1);
        weekdayDisplay(3);
        weekdayDisplay(5);
        weekdayDisplay(7);
        weekdayDisplay(10);
    }

    public void weekdayDisplay(int day)
    {
        switch (day)
        {
            case 1:
                System.out.println("We have Monday!");
            break;

            case 2:
                System.out.println("We have Tuesday!");
            break;

            case 3:
                System.out.println("We have Wednesday!");
            break;

            case 4:
                System.out.println("We have Thursday!");
            break;

            case 5:
                System.out.println("We have Friday!");
            break;

            case 6:
                System.out.println("We have Saturday!");
            break;

            case 7:
                System.out.println("We have Sunday!");
            break;

            default:
                System.out.println("Wrong day number!");
        }
    }
}
