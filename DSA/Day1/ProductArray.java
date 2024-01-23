// Write a program to calculate a product of all elements in an array?

import java.util.*;
public class ProductArray {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = new int[num];
        for(int i = 0 ; i < num ; i++)
        {
            arr[i] = input.nextInt();
        }
        int product = 1;
        for(int i = 0 ; i < arr.length; i++)
        {
            product *= arr[i];
        }
        System.out.println(product);
    }
}
