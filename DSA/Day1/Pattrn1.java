//     * 
//    * * 
//   * * * 
//  * * * * 
   

import java.util.Scanner;
public class Pattrn1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        Pattrn1(num);
    }
    public static void Pattrn1(int num)
    {
        for(int i = 1 ; i <= num ; i++)
        {
            for(int j=num-i; j >= 1; j--)
            {
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}




// package Day1;
// import java.util.*;
// public class Pattrn5 {
//     public static void main(String[] args)
//     {
//         Scanner input = new Scanner(System.in);
//         int num = input.nextInt();
//         Pattarn5(num);

//     }
//     public static void Pattarn5(int num)
//     {
//         for(int i = 1 ; i <= num ; i++)
//         {
//             for(int j = i ; j <= num ; j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int j = 1 ; j <= i ; j++)
//             {
//                 System.out.print(" *");
//             }
//             System.out.println();
//         }
//     }
// }
