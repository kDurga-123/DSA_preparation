package Day1;
// Write a program to check whether a given number is positive or not?

import java.util.Scanner;
class PositiveOrNegetive {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        PositiveNegetive(num);
    }
    public static void PositiveNegetive(int num)
    {
        if(num > 0)
        {
            System.out.println("positive");
        }
        else if(num < 0)
        {
           System.out.println("negetive");
        }
        else
        {
            System.out.println("zero");
        }
    }
}