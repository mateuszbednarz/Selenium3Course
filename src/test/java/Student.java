public class Student {

    public String name;
    public String surname;
    public String group;

    public void sayHello()
    {
        System.out.println("Hello my name is " + name + " " + surname + " and I'm a student on Layola University, Chicago.");
    }

    // konstruktor
    public Student()
    {
        System.out.println("Hello, welcome in CUSTOM CONSTRUCTOR! Feel inside!");
    }

    // konstruktor
    public Student(String newName, String newSurname, String newGroup)
    {
        this.name = newName;
        this.surname = newSurname;
        this.group = newGroup;
    }
}
