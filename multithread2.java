class multidemo implements Runnable
{
   public void run(){
    try{
        System.out.println("Thread "+ Thread.currentThread().getId()+" is running");
    }
    catch(Exception e){
        System.out.println("the exception is cout");
    }
   } 
}
class multithread2{
    public static void main(String[] args) {
        
        int n=8;
        for(int i=0;i<n;i++){
            multidemo m1=new multidemo();
            Thread t1=new Thread(m1);
            t1.start();
        }
    }
}
