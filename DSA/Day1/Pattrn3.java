// * * * * * * * 
// * * * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 



import java.util.Scanner;

public class Pattrn3 {
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
            for(int j = i ; j <= num ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
