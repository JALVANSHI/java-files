//method overloading by changing the data types of the arguments
import java.io.*;
class rakesh{
    public int sum(int a,int b ){
        int sum1=a+b;
        return sum1;
    }

    public double sum(double a,double b){
        double sum2=a+b;
        return sum2;
    }
}
class pro3{
    public static void main(String args[]){
        rakesh obj=new rakesh();
        int sum1=obj.sum(12,15);
        System.out.println("the value of sum1 is:"+sum1);
        double sum2=obj.sum(42.25,15.65);
            System.out.println("the value of sum1 is:"+sum2);
    }
}