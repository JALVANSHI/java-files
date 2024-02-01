class sum{
    public int sum(int x, int y){
        return(x+y);
    }
    public int sum(int x,int y,int z){
        return(x+y+z);
    }
    public double sum(double x,double y){
        return(x+y);
    }
 
}
class pro1{
    public static void main(String args[]){
        sum A=new sum();
       System.out.println(A.sum(25,45)) ;
       System.out.println(A.sum(25,45,75)) ;
       System.out.println(A.sum(25.47,45.4)) ;
      
    }
}