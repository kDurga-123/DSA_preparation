// Write a program to print all elements in an array?

import java.util.Scanner;

public class AllArray {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = new int[num];
        for(int i = 0 ; i < num ; i++)
        {
            arr[i] = input.nextInt();
        }
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
