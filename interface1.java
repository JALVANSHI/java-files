interface client{
    void design();
    void develop();
}
abstract class Rahul implements client{
   public void design(){
        System.out.println("the design of the website is so good.you can proceed to develop");
    }
}
class Raman extends Rahul{
    public void develop(){
        System.out.println("the web is very beautiful thank you so much.");
    }
}
class interface1{
    public static void main(String args[]){
        Raman obj = new Raman();
        obj.design();
        obj.develop();
    }
}