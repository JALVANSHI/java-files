//method overloading by changing the order of parameter
//import java.util.io.*;
class rahul{
    public void studentid(String name,int id){
        System.out.println("the name of the student is: "+name+" and the id of the student is: "+id);
    }
    public void studentid(int id, String name){
        System.out.println("the id of the student is: "+id+" and the name of the student is: "+name);
    }
}
class pro4{
    public static void main(String args[]){
        rahul obj=new rahul();
        obj.studentid("raja",01);
        obj.studentid(02,"raman");
    }
        
}