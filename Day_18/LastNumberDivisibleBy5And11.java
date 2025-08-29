package Day_18;
public
class LastNumberDivisibleBy5And11 {
    public static void main(String[] args) 
    {
        //print the last number Divisible by 5 and 11 
        int last=0;
        for(int i=1;i<=500;i++)
        {
            if(i%5==0 && i%11==0)
            {
                last=i;
            }
        }
        System.out.println(last);
    }
}