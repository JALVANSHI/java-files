 class multithreademo extends Thread{
    public void run(){
        try{
            System.out.println("thread " +  Thread.currentThread().getId() + " is running");
        }
        catch(Exception e){
            System.out.println("the exception is caut");
        }
    }
}
public class multithread1{
    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++){multithreademo t1=new multithreademo();
            t1.start();}
        

    }
}
