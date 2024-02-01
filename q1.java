import java.util.Scanner;
class q1{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int N=n.nextInt();
        int sum=0;
        for(int i=0;i<=N;i++){
            sum=sum+i;
        }
        System.out.println(sum);

    }
}