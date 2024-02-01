import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String>list=new LinkedList<>();
        list.add("raja");
        list.add("raja");
        list.add("raja");
        list.add("raja");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
