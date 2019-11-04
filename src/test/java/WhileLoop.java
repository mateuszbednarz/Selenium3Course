import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class WhileLoop {

    @Test
    public void whileLoopTest()
    {
        int index = 0;
        /*
        while (index <= 100)
        {
            System.out.println("Index ID = " + index);
            index++;
        }
        */
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange");

        while (index < fruits.size())
        {
            System.out.println("Fruit name: " + fruits.get(index) + " -> index no: " + index);
            index++;
        }

    }
}
