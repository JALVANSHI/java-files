import java.io.*;
class student{
    int num;
    String name;
    student(String sname,int snum){
      num=snum;
      name=sname;
      }
}
class parameter{
    public static void main(String args[]){
        student value=new student("name:Raman",20);
        System.out.println(value.name);
        System.out.println(value.num);
    }
}