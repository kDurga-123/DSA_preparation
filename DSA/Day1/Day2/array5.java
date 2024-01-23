package Day2;
import java.util.*;
public class array5 {
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
        int t = 0;
        int l = 0;
        int r = arr.length - 1;
        int b = arr.length - 1;
        String bag = "";
        
    }
}
