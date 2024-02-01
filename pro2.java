//method overriding 
class ram{
    void show(){
        System.out.println("hello");
        }
    // void show1(){
    //     System .out.println("ravi");
    // }    
}
class raman extends ram{
    void show(){
        super.show();
        System.out.println("hi");
    }
    
    // void show1()
     
     
}
class pro2{
    public static void main(String args[]){
        ram obj=new raman();
         obj.show();
    }
}