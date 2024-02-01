class Sum{
    public int sum(int a,int b){
        return(a+b);
    }
    public int sum(int a,int b, int c){
        return(a+b+c);
    }
}
class main{
    public static void main(String args[]){
        Sum obj=new Sum();
        System.out.println(obj.sum(20,10));
        System.out.println(obj.sum(20,10,30));
        
        
    }
}