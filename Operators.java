class Operators
{
public static void main(String[] args)
 {
 //Arithmetic Operators
 int a=10;
 int b=4;
 System.out.println(a+b);
 System.out.println(a-8);
 System.out.println(b*9);
 System.out.println(a/b);
 System.out.println(10%b);
 System.out.println(++a); //Pre-Increment
 System.out.println(b--); //post-increment
 System.out.println(b);
 //Assignment Operators
 int c=52;
 int d=21;
 System.out.println(c=d);
 System.out.println(c*=3); //a=a*3
 System.out.println(d/=4); //b=b/4
 System.out.println(d%2); //b=b%2

 //Comparison Operators
 int f=20;
 int g=10;
 System.out.println(f==g);
 System.out.println(g!=f);
 System.out.println(20<f);
 System.out.println(g>40);
 System.out.println(14<=f);
 System.out.println(g>=11);
 //Logical Operators
 int s=15;
 int u=20;
 System.out.println(s>u && s<u);
 System.out.println(s>=16 || u<=19);
 System.out.println(u!=20);

 //Bit-Wise Operators
 //2 power n format
 //64 32 16 8 4 2 1
 int x=25;// 0 0 1 1 0 0 1(011001)
 int y=50;// 0 1 1 0 0 1 0(110010)
 System.out.println(x & y); //010000
 System.out.println(x | y); //111011
 System.out.println(x ^ y); //101011
 System.out.println(x << 3); //multiply with 2(3 times)
 System.out.println(y >> 5); //divide with 2(5 times)
 }
}