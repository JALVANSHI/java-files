import java.util.Scanner;
class if3{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a=input.nextInt();
        System.out.println("enter the value of b:");
        int b=input.nextInt();
        if(a==b){
            System.out.println("a is equal to b");
        }
        else{
            if(a<b){
                System.out.println("a is lesser than b");
            }
            else{
                System.out.println("a is greater than b");
            }
        }
    }
}