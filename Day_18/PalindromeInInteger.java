package Day_18;
import java.util.*;
class PalindromeInInteger {
    //Program to check whether the given integer is Palindrome or not
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=sc.nextInt();
        int rev = 0;
        int temp = num;
        while(temp>0) {
            int digit = temp%10;
            rev = rev*10+digit;
            temp /= 10;
        }
        if(rev==num) System.out.println(num+" is a Palindrome");
        else System.out.println(num+" is not a Palindrome");
    }
}
