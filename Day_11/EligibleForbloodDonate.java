import java.util.Scanner;
public class EligibleForbloodDonate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age=sc.nextInt();
        System.out.println("Enter the Blood Count: ");
        int blood=sc.nextInt();
        System.out.println("Enter the Height: ");
        float height=sc.nextFloat();
        System.out.println("Enter the Weight: ");
        int weight=sc.nextInt();
        if(age>=18){
            System.out.println("Your age is Eligible");
            if(blood>=8){
                System.out.println("Your Blood Count is also Eligible");
                if(height>=5.5){
                    System.out.println("Your height is also Eligible");
                    if(weight>=45){
                        System.out.println("Your are eligible for Blood Donating");}
                    else{
                        System.out.println("Your are not eligible for weight");}}
                else{
                    System.out.println("Your height is not eligible");}}
            else{
                System.out.println("Your Blood count is not eligible");}}
        else{
            System.out.println("Your are not eligible for Blood Donating");}}}
