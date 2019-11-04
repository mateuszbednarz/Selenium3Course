import org.testng.annotations.Test;

public class MethodsBook {

    // metoda
    public void firstMethod()
    {
        int a = 2;
        int b = 3;

        System.out.println("Sum = " + (a + b));
    }

    // metoda
    public int sum()
    {
        int a = 2;
        int b = 3;
        return a + b;
    }

    int sumResult = sum();

    // metoda
    public Student studentData()
    {
        Student st = new Student();
        st.name = "Thomas";
        st.surname = "Kovalksy";
        st.group = "C# Developers";

        return st;
    }

    @Test
    public void showResults()
    {
        firstMethod();
        System.out.println(sum());
        System.out.println(sumResult);

        Student stData = studentData();

        System.out.println(stData.name);
        System.out.println(stData.surname);
        System.out.println(stData.group);
    }
}
