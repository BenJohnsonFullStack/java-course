class Calculator
{
    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
}

public class Methods {
    public static void main(String a[])
    {
        Calculator obj = new Calculator();

        int r1 = obj.add(3, 4);
        System.out.println(r1);
    }
}