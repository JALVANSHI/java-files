class A{
    public void print_A(){
        System.out.println("this is a0");
    }
}
class B extends A{
    public void print_B(){
        System.out.println("this is b0");
    }
}
class c extends B{
    public void print_c(){
        System.out.println("this is c0");
    }
}
class d extends c{
    public void print_d(){
        System.out.println("this is d0");
    }
}
class Multilevel{
    public static void main(String[] args) {
        d obj=new d();
        obj.print_A();
        obj.print_B();
        obj.print_c();
        obj.print_d();

    }
}