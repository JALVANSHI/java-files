import java.util.Scanner;
class table2{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=input.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }        
    }
}