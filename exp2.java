class exp2{
    public static void main(String args[]){
        
        System.out.println("the main method is started");
        try{
         String str=null;   
        System.out.println(str.toUpperCase());
        }
       catch(NullPointerException n)
       {
        System.out.println(" null values can't typecast ");
       }
        System.out.println("main method is ended");
    }
}