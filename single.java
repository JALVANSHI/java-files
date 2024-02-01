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
class single{
    public static void main(String[] args) {
        B obj=new B();
        obj.print_A();
        obj.print_B();

    }
}
