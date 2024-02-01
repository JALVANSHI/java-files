interface A{
     void prints();
    
}
class B{
    public void print_B(){
        System.out.println("this is java");
    }
}
class C extends B implements A{
    String language="java";
    public void prints(){
        System.out.println(language +"is a very easy language");
    }
    
}
class multiple{
    public static void main(String[] args) {
        C obj=new C();
        obj.prints();
        obj.print_B();
    }
}
