class Rahul{
    public void print_A(){
        System.out.println("this is Rahul");
    }
}
class B extends Rahul{
    public void print_B(){
        System.out.println("this is Ritesh");
    }
}
class C extends Rahul{
    public void print_C(){
        System.out.println("this is Rohan");
    }
}
public class hierarchical{
    public static void main(String[] args) {
        B obj=new B();
        obj.print_A();
        obj.print_B();
        C obj1=new C();
        obj1.print_A();
        obj1.print_C();

    }
}

