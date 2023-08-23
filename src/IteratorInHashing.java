import java.util.*;
import java.util.Iterator;
public class IteratorInHashing {
    public static void main(String[] args){
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(62);
        set.add(3);
        set.add(47);
        System.out.println(set);
        Iterator it= set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
