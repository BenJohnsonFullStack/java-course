class Calculator
{

    int num = 5;

    public int add(int n1, int n2)
    {
        // System.out.println(num);
        return n1 + n2;
    }
}

public class Methods {
    public static void main(String a[])
    {
        int data = 10;
        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();

        obj.num = 8;

        int r1 = obj.add(3, 4);
        // System.out.println(r1);
        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}
