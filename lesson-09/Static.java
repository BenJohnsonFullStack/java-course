class Mobile
{
    String brand;
    static String name;
    int price;

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

class Static {
    public static void main(String a[])
    {

        

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;

        Mobile.name = "Phone"; // static name reference

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }
}
