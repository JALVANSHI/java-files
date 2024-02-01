class A extends Thread{
    public void run(){
        for(int i=1;i<=5;i++)
            {  
                System.out.println("cse");
                //Thread.Sleep(1000);
            }      
        
    }
}
class t2{
    public static void main(String args[]){
        A t3=new A();
        t3.start();
        for(int i=1;i<=5;i++)
        {
            System.out.println("I am the student of RBSSIET");
            //Thread.Sleep(1000);
        }
    }
}