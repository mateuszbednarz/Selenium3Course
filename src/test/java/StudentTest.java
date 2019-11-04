import org.testng.annotations.Test;

public class StudentTest {

    @Test
    public void checkStudent ()
    {
        Student fst = new Student();
        Student sst = new Student();

        fst.name = "Gregory";
        fst.surname = "Collins";
        fst.group = "Java Developers";
        fst.sayHello();

        sst.name = "Dayana";
        sst.surname = "Carpaccio";
        sst.group = "Systems Administrators";
        sst.sayHello();

    }
}
