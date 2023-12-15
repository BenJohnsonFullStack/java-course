class Human
{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }

    public void setAge(int a)
    {
        age = a;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }

}

public class Encapsulation {
    public static void main(String a[])
    {

        Human Navin = new Human();
        Navin.setAge(11);
        Navin.setName("Navin");

        // Navin.age = 11;
        // Navin.name = "Navin";

        System.out.println(Navin.getName() + " : " + Navin.getAge());

    }
}
