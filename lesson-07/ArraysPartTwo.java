class Student
{
    int rollno;
    String name;
    int marks;


}

class ArraysPartTwo {
    public static void main(String a[])
    {
        // Student s1 = new Student();
        // s1.rollno = 1;
        // s1.name = "Navin";
        // s1.marks = 88;
        
        // Student s2 = new Student();
        // s2.rollno = 2;
        // s2.name = "Harsh";
        // s2.marks = 67;

        // Student s3 = new Student();
        // s3.rollno = 3;
        // s3.name = "Kiran";
        // s3.marks = 97;

        // Student students[] = new Student[3];
        // students[0] = s1;
        // students[1] = s2;
        // students[2] = s3;

        
        // for(Student student : students)
        // {
        //     System.out.println(student.name + " : " + student.marks);
            
        // }
        
        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;

        for(int n : nums)
        {
            System.out.println(n);
        }
    }
}
