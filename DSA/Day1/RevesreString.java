// Write an algorithm to reverse a string.

import java.util.*;
public class RevesreString {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        if(RevesreString(str).equals(str))
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        
    }
    public static String RevesreString(String str)
    {
        String bag = "";
        for(int i = 0 ; i < str.length() ; i++)
        {
            bag = str.charAt(i) + bag;
        }
        return bag;
    }
}
