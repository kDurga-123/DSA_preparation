// Write a program to check whether a given number is even or odd?

// import java.util.Scanner;
// public class EvenOrOdd {
//     public static void main(String args[])
//     {
//         Scanner input = new Scanner(System.in);
//         int num = input.nextInt();
//         EvenOdd(num);
//     }
//     public static void EvenOdd(int num)
//     {
//         if(num % 2 == 0)
//         {
//             System.out.println("even");
//         }
//         else
//         {
//             System.out.println("odd");
//         }
//     }
// }


import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        EvenOdd(num);
    }
    public static void EvenOdd(int num)
    {
        if((num & 1) == 0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}
