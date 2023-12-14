class Calculator
{
    int a;

    public int add(int num1, int num2)
    {
        int result = num1 + num2;
        return result;
    }
}

public class OOP 
{
    public static void main(String a[])
    {
        Calculator calc = new Calculator();

        int result = calc.add(4, 5);

        System.out.println(result);

    }
}

// OOP //
/**
 * Properties
 * Behaviors
 */