import org.testng.annotations.Test;

public class ConstructorTypes {

    @Test
    public void consTest()
    {
        Student st1 = new Student();
        Student st2 = new Student("Jan", "Baginski", "Network Administrators");
        st2.sayHello();
    }
}
