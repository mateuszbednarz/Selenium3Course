public class OneDimArray {

    int numbers[] = new int[5];

    public void setNumbers()
    {
        numbers[0] = 1;
        numbers[1] = 10;
        numbers[2] = 25;
        numbers[3] = 100;
        numbers[4] = 150;
    }

    public void showNumbers()
    {
        for (int i = 0; i < numbers.length; i++)
            System.out.println("Number = " + numbers[i]);
    }

    Student students[] = new Student[2];

    public void addStudents()
    {
        Student fst = new Student("Thomas", "Cat", "Linux Admins");
        Student sst = new Student("Allan", "Parish", "Front-end Developers");

        students[0] = fst;
        students[1] = sst;
    }

    public void introduceStudents()
    {
        try
        {
            students[0].sayHello();
            students[1].sayHello();
            students[2].sayHello();
        } catch (ArrayIndexOutOfBoundsException ex)
            {
                System.out.println("EX: You try to access to the array index which doesn't exist!");
            } finally
                {
                    System.out.println("We're closing DATABASE connection HERE!");
                }

    }

}
