
import java.util.Scanner;
import java.lang.Math;
public class main{
        public static void main(String args[]){
            Scanner sc =new Scanner(System.in);
            int myNumber=(int)(Math.random()*1000);
            int userNumber=0;
        
            do{
                System.out.println("guess your number:");
                userNumber=sc.nextInt();
                if(userNumber==myNumber){
                    System.out.println("woow!your Answer is correct");
                    break;
                }
                
                else if(userNumber > myNumber){
                    System.out.println("your number is so large");
                }
                else{
                    System.out.println("your number is so small");
                }
            }while(userNumber >=0);

            System.out.println("My number was:");
            System.out.println("myNumber");
        }
    }