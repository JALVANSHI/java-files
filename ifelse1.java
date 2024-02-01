import java.util.Scanner; 
class ifelse1{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your age:");
        int age=input.nextInt();

        //int age=10;
        if(age>=18){
            System.out.println("you are eligible for vote");
        }
        else{
            System.out.println("you are not eligible for vote");
            
        }
    }
}