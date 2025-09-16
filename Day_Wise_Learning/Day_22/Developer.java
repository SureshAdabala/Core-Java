class Developer {
    //Method Overloading in println()
    public static void println() { 
        System.out.println("---- o ----");
    }
    public static void println(int a) {
        System.out.println("[ "+a+" ]");
    }
    public static void println(String num,int a) {
        System.out.println("/"+num+"/");
        System.out.println("{ "+a+" }");
    }
    public static void println(boolean value) {
        System.out.println("( "+value+" )");
    }
    //Method Overloading in max()
    public static void max(int a,int b) {
        if(a>b) System.out.println(a+" is max");
        else System.out.println(b+" is max");
    }
    public static void max(int a,int b,int c) {
        if(a>b && a>c) System.out.println(a+" is max");
        if(b>a && b>c) System.out.println(b+" is max");
        if(c>a && c>b) System.out.println(c+" is max");
    }
    public static void max(char a,char b) {
        if(a>b) System.out.println(a+" is max");
        else System.out.println(b+" is max");
    }
    //Method Overloading in palindromOrNot()
    public static void palindromeOrNot(int num) {
        int original=num;
        int temp=original;
        int rev=0;
        while(temp>0) {
            int digit = temp%10;
            rev=rev*10+digit;
            temp=temp/10;
        }
        if(original==rev) System.out.println(num+" is palindrome number");
        else System.out.println(num+" is not a palindrome number");
    }
    public static void palindromeOrNot(String str) {
        String original=str;
        String rev="";
        for(int i=str.length()-1;i>=0;i--) {
            rev=rev+str.charAt(i);
        }
        if(rev.equals(str)) System.out.println(str+" is a palindrome String");
        else System.out.println(str+" is not a palindrome String");
    }
}