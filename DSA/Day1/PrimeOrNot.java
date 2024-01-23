// Write a program to check whether a given number is prime or not?

// import java.util.*;
// public class PrimeOrNot {
//     public static void main(String args[])
//     {
//         Scanner input = new Scanner(System.in);
//         int num = input.nextInt();
//         int count = 0;
//         for(int i = 1 ; i <= num ; i++)
//         {
//             if(num % i == 0)
//             {
//                 count++;
//             }
//         }
//         if(count == 2)
//         {
//             System.out.println("prime number");
//         }
//         else{
//             System.out.println("not prime number");
//         }
//     }
// }
import java.util.*;

public class PrimeOrNot {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        PrimeNumber(num);
    }
    public static void PrimeNumber(int num){
        if (num < 2) {
            System.out.println("not a prime number");
        } else if (num == 2 || num == 3 || num == 5 || num == 7) {
            System.out.println("prime number");
        } else if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
            System.out.println("not a prime number");
        } else {
            System.out.println("prime number");
        }
    }
}
