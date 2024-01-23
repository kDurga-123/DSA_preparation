// Given an array of number rearrange the array according to below example
// Input : Array = [2,3,4,6,5,1,8]
// Output : Array = [2,4,6,8,3,5,1]

import java.util.*;;
public class Swap {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] arr = new int[num];
        for(int i = 0 ; i < num ; i++)
        {
            arr[i] = input.nextInt();
        }
        int start = 0;
        int end = arr.length;
        while(start < end)
        {
            if(arr[start] % 2 == 0)
            {
                start++;
            }
            if(arr[start] % 2 != 0)
            {
                end--;
            }
            if(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
