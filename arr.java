import java.util.*;
class arr{
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("Ram");
        list.add("Ram");
        list.add("Ram");
        list.add("Ram");
        Iterator itr=list.iterator(); 
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}