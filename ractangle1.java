import java.util.*;
class ractangle1{
    public static void main(String args[]){
        int n=5;
        int m=10;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=10;j++){
                if( i==1 || j==1 || i==n || j==m ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}