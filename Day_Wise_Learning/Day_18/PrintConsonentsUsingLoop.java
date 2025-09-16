package Day_18;
public class PrintConsonentsUsingLoop {
        //Program to println A to Z
        // Print consonents
    public static void main(String[] args) {
    for(int i=65;i<=90;i++)
        {
            char c=(char)i;
            if(c=='A' || c=='E'|| c=='I' || c=='O'|| c=='U')
            {
                continue;
            }
            System.out.print(c+" ");
        }
    }
}