import java.util.*;
public class MultipilicationTableW
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        int i=1;
        while(i<=10)
        {
            System.out.println(i + "x" + num + "=" + i*num);
            i++;
        }
    }
}
