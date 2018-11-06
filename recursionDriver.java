public class recursionDriver
{
     public static int task1(int n)
    {
        if(n<1)
        return 0;
        return 4 + task1(n-1);
    }
    public static int task2(int n)
    {
        if(n<1)
        return 0;
        return 20 + task2(n-1);
    }
    public static int task3(int n)
    {
        if(n<1)
        return 0;
        return 10 + task3(n-1);
    }
    public static int task4(int n)
    {
        if(n<=0)
        return 0;
        return task4(n-2)+n;
    }
    public static int task5(int n)
    {
        if(n<=0)
        return 0;
        return task5(n-2)+n;
    }
    public static void main(String[] args)
    {
         /*
          * Count 
          * 1. Number of legs  10 elephant have
          * 2. Number of students in a school if each
          *    class has 20 students and there are 12 rooms
          * 3. Number of fingers if there are 8 people
          * 4. Find the sum of odd numbers from 0 to N
          * 5. Find the sum of even numbers from 0 to N
     
          * 
          */   
         int counted=0;

         // Task 1.
         System.out.println("Task 1\n" + task1(10));
         
         //Task 2
         System.out.println("Task 2\n" +task2(12));
         
         //Task 3
         System.out.println("Task 3\n" +task3(8));
         
         //Task 4
         int counter1 = 0;
         counter1 = task4(5) + counter1;
         System.out.println("Task 4\n" + counter1);
         
         //Task 5
         int counter2 = 0;
         counter2 = task5(6) + counter2;
         System.out.println("Task 5\n" +counter2);
    }
}
