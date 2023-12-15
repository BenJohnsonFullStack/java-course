// navin

class Strings {
    public static void main(String a[])
    {
        StringBuffer sb = new StringBuffer("Navin");
        sb.append(" Reddy");

        sb.insert(0, "Java ");
        sb.setLength(30);
        sb.ensureCapacity(100);

        System.out.println(sb);

        
    }
}
