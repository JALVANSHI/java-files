class ram{
//   public:
    int a=10;
}
class b extends ram{
    int b=a+10;
}
class singel{
    public static void main(String args[]){
        b obj=new b();
    //    int c=
    //  obj.a;
        System.out.println(obj.a);
    //   int d=  
    // obj.b;
        System.out.println(obj.b);
    }
}