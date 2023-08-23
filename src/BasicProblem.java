import java.util.*;
public class BasicProblem {
    public static void main(String[] args){
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        if(set.contains(2)){
            System.out.println("Set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("Set does not contains 6");
        }
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("1 is not there");
        }
        System.out.println("size of the set is: "+set.size());
    }

}
