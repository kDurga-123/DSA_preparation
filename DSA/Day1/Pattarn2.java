// * 
// * * 
// * * * 
// * * * * 
// * * * * * 


import java.util.*;
public class Pattarn2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        Pattarn2(num);
    }
    public static void Pattarn2(int num)
    {
        for(int i = 1 ; i <= num ; i++)
        {
            for(int j = 1 ; j <= num ; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
