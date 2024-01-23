package Day2;
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[][] arr = new int[num][num];
        for(int i = 0 ; i < num ; i++)
        {
            for(int j = 0 ; j < num ; j++)
            {
                arr[i][j] = input.nextInt();
            }
        }
        String bag = "";
        for(int i = arr.length - 1 ; i >= 0 ; i--)
        {
            bag += arr[i][arr.length - 1] + " ";
        }
        for(int i = arr.length - 1 ; i >= 0 ; i--)
        {
            bag += arr[i][1] + " ";
        }
        for(int i = arr.length - 1 ; i >= 0 ; i--)
        {
            bag += arr[i][0] + " ";
        }
        System.out.println(bag);
    }
}
