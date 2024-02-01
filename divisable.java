//program to write the total number between 100 and 200 that is divisible by 7 and sum of total numbers
class divisable{
    public static void main(String args[])
    {
        int a=105;
        int an=196;
        int d=7;
        int n=(an-a)/d+1;
        int sn=(n/2)*(a+an);
        System.out.println("the number is :"+n);
        System.out.println("the sum of number is :"+sn);
    }
}