//logical operator
class logical{
    public static void main(String args[])
{
    int a=21,b=43,c=15;
    System.out.println((a>b)||(a>c));//true
    System.out.println((c<a)&&(c<b));//true
    System.out.println((b<=a)||(b>=a));//true
    System.out.println(!(a<b));//false
}
}