
import java.util.*;
class Arms1 {
    public static void main(String[] args) {
        //Intializing Values
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the Number: ");
            int num=sc.nextInt();
            int count=0;
            int temp1=num;
            int temp2=num;
        
        //Counting the Values
        while(temp1>0) {
            count++;
            temp1=temp1/10;
        }
       //Armstrong number logic 
        int sum=0;
        while(temp2>0) {
            int digit=temp2%10;
            int power=1;
            for(int k=1;k<=count;k++) {
                power=power*digit;
            }
            sum=sum+power;
            temp2=temp2/10;
        }if(sum==num) {
            System.out.print(num+" is a Armstrong number");
        }
        else
        {
            System.out.println(num+" is not a Armstrong Number");
        }
        
    
    }
}