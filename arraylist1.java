import java.util.*;
class arraylist1{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Raj");
        list.add("Raj");
        list.add("Raj");
        Iterator itr= list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}