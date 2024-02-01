import java.util.Scanner;
class leap{
    public static void main(String args[])
    {
        Scanner year=new Scanner(System.in);
        System.out.println("enter the year");
        int Year=year.nextInt();
        if(((Year%4==0)&&(Year%100!=0))||(Year%400==0))
        {
            System.out.println("this is leap");
        }
        else{
            System.out.println("this is normal year");
        }
    }
}