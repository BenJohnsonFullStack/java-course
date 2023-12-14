

public class Arrays {
    public static void main(String a[])
    {
         int nums[][] = new int[3][]; // jagged array

         // define nested array size at each index
         nums[0] = new int[3]; 
         nums[1] = new int[4];
         nums[2] = new int[2];

        // int nums[][] = new int[3][4][5]; 3D ARRAY




        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                nums[i][j] = (int) (Math.random() * 10);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        // enhanced for loop
        // for(int n[] : nums) // forEach array of integers in nums
        // {
        //     for(int m : n) // for each value in array n
        //     {
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }
    }
}
