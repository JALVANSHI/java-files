// simple inheritance
class A{
    // int a=10;
    void a(){
        System.out.println("hello");
    }
    
}
class B extends A{
    // int b=a+10;
    void b(){
    System.out.println("ravi");
    }
}
class C extends B{
    // int c=a+10;
    void c(){
 System.out.println("how are you");
    }
   
}
class simple{
    public static void main(String args[]){
        C raj=new C();
        raj.a();
        raj.a();
        // System.out.println(a);
        raj.b();
        //  System.out.println(b);
        raj.c();
        //  System.out.println(c);
    }
}