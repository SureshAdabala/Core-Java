public class checkArmstrongInMethods
{
 public static void main(String[] args)
 {
 checkArmstrong(153);
 checkArmstrong(232);
 checkArmstrong(371);
 }
 static void checkArmstrong(int n) {
 int N=n;
 int t1=N;
 int t2=t1;
 int c=0;
 while(t1>0) {
 c++;
 t1/=10;
 }
 int s=0;
 while(t2>0) {
 int d=t2%10;
 int p=1;
 for(int i=1;i<=c;i++){
 p=p*d;
 }
 s+=p;
 t2/=10;
 }
 if(s==n) System.out.println("Armstrong");
 else System.out.println("Not an Armstrong");
 };
}
