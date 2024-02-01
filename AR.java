import java.lang.Math;
class AR
{
    double lenght;
    double breath;
    void getdata(double a,double b)
    {
        lenght=a;
        breath=b;
    }

    class breath{
        public static void main(String args[])
        {
            AR obj=new AR();
            obj.getdata(10,5);
            double area=Math.area(a*b);
            System.out.println(area);
        }
    }
}