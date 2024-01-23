// Find a string whether it contains alphanumeric characters or not?

import java.util.*;
public class AlphaNumeric {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String Alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String num = "0123456789";
        String spe = "!@#$%^&*";
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        for(int i = 0 ; i < str.length() ; i++)
        {
            for(int j = 0 ; j < alpha.length() ; j++)
            {
                if(str.charAt(i) == alpha.charAt(j))
                {
                    count1++;
                }
            }
        }
        for(int i = 0 ; i < str.length() ; i++)
        {
            for(int j = 0 ; j < Alpha.length() ; j++)
            {
                if(str.charAt(i) == Alpha.charAt(j))
                {
                    count2++;
                }
            }
        }
        for(int i = 0 ; i < str.length() ; i++)
        {
            for(int j = 0 ; j < num.length() ; j++)
            {
                if(str.charAt(i) == num.charAt(j))
                {
                    count3++;
                }
            }
        }
        for(int i = 0 ; i < str.length() ; i++)
        {
            for(int j = 0 ; j < spe.length() ; j++)
            {
                if(str.charAt(i) == spe.charAt(j))
                {
                    count4++;
                }
            }
        }
        if(count1 > 0 && count2 > 0 && count3 > 0 && count4 > 0 )
        {
            System.out.println("Alpha numeric");
        }
        else{
            System.out.println("not Alpha numeric");
        }
    }
}
