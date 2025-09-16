package Day_17;

import java.util.*;
class Continue3 {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the name: ");
           String Name=sc.nextLine();
           int count=0;
           for(int i=0;i<Name.length();i++)
           {
               if(Name.charAt(i)=='a'|| Name.charAt(i)=='e' || Name.charAt(i)=='i' || Name.charAt(i)=='o' || Name.charAt(i)=='u' ){
                   count++;
               }
               else{
                   System.out.println(Name.charAt(i));
                   continue;
                   } 
           }
          System.out.println("No of Vowels in the Given String: "+count); 
    }
}