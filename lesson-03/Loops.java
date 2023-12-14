class Loops 
{
    public static void main(String args[])
    {
        // loops: while, do while, for\
        // number of times OR under certain condition
        int i = 1;
        while(i <= 4)
        {
            System.out.println("Hi" + i);
            
            int j = 1;
            while(j <= 3)
            {
                System.out.println("Hello" + j);
                j++;
            }

            i++;
        }


        System.out.println("Bye" + i);
    }
    
}
