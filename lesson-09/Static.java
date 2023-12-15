class Mobile
{
    String brand;
    static String name;
    int price;

    static
    {
        name = "Phone";
        System.out.println("in static block");
    }

    public Mobile()
    {
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

class Static {
    public static void main(String a[]) throws ClassNotFoundException
    {

        Class.forName("Mobile");

        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 1500;
        
        // Mobile obj2 = new Mobile();
        // obj2.brand = "Samsung";
        // obj2.price = 1700;

        // Mobile.name = "Phone"; // static name reference

        // obj1.show();
        // obj2.show();
    }
}
