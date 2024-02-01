class A extends Thread
{
    public void run(){
        System.out.println("i am a student of cse");
    }
}
class t1{
    public static void main(String args[]){
        A t=new A();
        t.start();
    }
}