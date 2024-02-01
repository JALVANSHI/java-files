class Test{
    int a;
    int b;
     Test(){
        a=10;
        b=12;
     }
     Test get(){
        return this;
     }
     void display(){
        System.out.println("the value of a is:"+a);
        System.out.println("the value of b is:"+b);
     }
     public static void main(String args[]){
        Test obj=new Test();
        obj.get().display();
     }
}