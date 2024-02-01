// print the sum of two numbers using function.
import java.util.*;
class funsum{
    public static int sum(int a,int b){
        int total=a+b;
       // System.out.println("total:"+total);
        return total;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a=sc.nextInt();
        System.out.println("enter the value of b:");
        int b=sc.nextInt();
        int total= sum(a,b);
        System.out.println("the total is:"+total); 
    }
}