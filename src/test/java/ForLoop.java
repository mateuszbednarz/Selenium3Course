import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ForLoop {

    // show numbers from 1 to 10
    @Test
    public void showNumbers()
    {
        List<String> students = Arrays.asList("Thomas", "Andrew", "Marienne", "Brian", "Jessica");

        /*
        for (int i = 0; i <= 10; i++)
            System.out.println("i = " + i);

        for (String st : students)
        {
            System.out.println("Student name: " + st);
        }
        */
        for (int j = 0; j < students.size(); j++)
            System.out.println("Student number " + j + ": " + students.get(j));
    }
}