 import java.io.*;
class raj{
    int name;
    String num;
    raj(){
        System.out.println("constructor called");
    }
}
class a{
    public static void main(String args[]){
        raj value=new raj();

        System.out.println(value.name);
        System.out.println(value.num);
    }
}