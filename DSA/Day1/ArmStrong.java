// Write a program to check  whether a given number is an armstrong number or not?


// import java.util.*;
// public class ArmStrong {
//     public static void main(String args[])
//     {
//         Scanner input = new Scanner(System.in);
//         int num = input.nextInt();
//         if(ArmStrongNumber(num) == num){
//             System.out.println("armstong number");
//         }
//         else{
//             System.out.println("not armstong number");
//         }
//     }
//     public static int ArmStrongNumber(int num)
//     {
//         int sum = 0;
//         String a = Integer.toString(num);
//         int len = a.length();
//         while(num > 0)
//         {
//             int rem = num % 10;
//             sum += Math.pow(rem, len);
//             num = num / 10;
//         }
//         return sum;
//     }
// }




import java.util.*;
public class ArmStrong {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(ArmStrongNumber(num) == num){
            System.out.println("armstong number");
        }
        else{
            System.out.println("not armstong number");
        }
    }
    public static int ArmStrongNumber(int num)
    {
        int sum = 0;
        String a = Integer.toString(num);
        int len = a.length();
        for(int i = 0 ; i < a.length() ; i++)
        {
            int chara = a.charAt(i) - '0';
            sum += Math.pow(chara, len);
        }
       return sum;
    }
}
