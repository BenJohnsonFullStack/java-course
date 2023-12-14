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
        int num1 = 4;
        int num2 = 5;


        Calculator calc = new Calculator();


        int result = calc.add(num1, num2);

        System.out.println(result);

    }
}

// OOP //
/**
 * Properties
 * Behaviors
 */