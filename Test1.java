class Test1{
    int a;
    int b;
    Test1(){
        a=23;
        b=25;
    }
     void display(Test1 obj){
        System.out.println("the value of a is:"+obj.a);
        System.out.println("the value of a is:"+obj.b);
     }
     void get(){
        display(this);
    }
    public static void main(String args[]){
        Test1 obj1=new Test1();
        obj1.get();
    }
}