package Day_18;
import java.util.*;
public class MultipleTables {
    //Program to print multiplication tables from 1 to N and stop when the result is greater than or equal to 24
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int N=sc.nextInt();
        int res=0;
        for(int j=1;j<=N;j++)
        {
            for(int i=1;i<=10;i++)
            {
                res=j*i;
                if(res>=24) break;
                System.out.print(j+" x "+i+" = "+j*i+"  ");
            }
            if(res>=24) break;
            System.out.println("__________________");
        }
    }
}
