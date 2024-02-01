abstract class base{
    base(){
       System.out.println("the base class constructor is called");
       
    }
    abstract void fun(); 
}
class derived extends base{
    derived(){
        System.out.println("the derived class is called");
    }
    void fun(){
        System.out.println("hello how are you");
    }
}
class pro2{
    public static void main(String args[]){
        derived obj=new derived();
        obj.fun();
    }
}