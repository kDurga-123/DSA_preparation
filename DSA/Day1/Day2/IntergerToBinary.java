// Write a program to Convert Integer  into  a Binary?

package Day2;
import java.util.*;
public class IntergerToBinary {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String binary = "";
        while(num > 0)
        {
            int rem = num % 2;
            binary = rem + binary;
            num = num / 2;
        }
        System.out.println(binary);
    }
}
