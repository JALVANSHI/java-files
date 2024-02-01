import java.util.*;
class fun1{
    public static void myName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string:");
        String name=sc.next();
        myName(name);

    }
}