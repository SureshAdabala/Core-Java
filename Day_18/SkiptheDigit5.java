
public class SkiptheDigit5 {
    public static void main(String[] args)
    {
         //Program to print the  number which are not having '5'
        for(int i=1;i<=60;i++)
        {
            int n=i;
            for(;n>0;){
                int digit = n%10;
                if(digit == 5) break;
                n/=10;
        }if(n==0)
        System.out.print(i+" ");
        }
    }
}