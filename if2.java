import java.util.Scanner;
class if2{
    public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    System.out.println("enter the value of a:");
    int a=input.nextInt();
    System.out.println("enter the value of b:");
     int b=input.nextInt();
    System.out.println("enter the value of c:");
     int c=input.nextInt();
     if(a>b){
        if(a>c){
            System.out.println("a is greater");
        }
     }
     else if(b>a){
        if(b>c){
            System.out.println("b is greater");
        }
     }
     if(c>a&&c>b){
        System.out.println("c is greater");
     }
    } 
}