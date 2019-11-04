import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class DoWhileLoop {

    @Test
    public void doWhileLoopTest()
    {
        int index = 0;
        /* jest to pętla, która zawsze wykona się co najmniej JEDEN RAZ, bo warunek jest sprawdzany na końcu!
        do
        {
            System.out.println(index);
            index++;
        } while (index < 5);
        */
        List<String> things = Arrays.asList("Lamp", "Table", "Sofa");

        do
        {
            System.out.println("Thing name: " + things.get(index));
            index++;
        } while (index < things.size());
    }
}
