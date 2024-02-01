class exp1{
    public static void main(String args[]){
        int a=20;int b=0;int c;
        System.out.println("the exception is started");
        try{
             c=a/b;
        System.out.println(c);
        }
       catch(ArithmeticException e)
       {
        System.out.println("can't divide by zero");
       }
        System.out.println("main method is ended");
    }
}