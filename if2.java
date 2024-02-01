import java.util.Scanner;
class if2{
    public static void main(String args[])
    {
        //int b=2,r,c;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the a:");
        int a=input.nextInt();
       // c=a/b;
        //r=a-(b*c);
        if(a%2==0)
        {
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
}