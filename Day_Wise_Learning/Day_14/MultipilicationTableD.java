import java.util.*;
public class MultipilicationTableD
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        int i=1;
        do
        {
            System.out.println(i + "x" + num + "=" + i*num);
            i++;
        }while(i<=10);
    }
}
