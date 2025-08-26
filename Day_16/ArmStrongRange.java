public class ArmstrongRange {
    public static void main(String[] args) {
        //Intializing Values
        for(int i=1;i<=1000;i++) {
            int num=i;
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
            System.out.println(num+" is a Armstrong number");
        }
        
    }
}
}