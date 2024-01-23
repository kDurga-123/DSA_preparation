// Write a program to calculate the sum of digits present in a number?
// Example : input : 124, output : 7



package Day2;
import java.util.*;
public class SumDigits {
        public static void main(String[] args)
        {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        while(num > 0)
        {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        } 
        System.out.println(sum);
    }
}