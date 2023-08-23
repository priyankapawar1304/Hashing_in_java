import java.util.*;
public class HashMapImp {
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",200);
        map.put("usa",300);
        map.put("china",400);

        map.put("china",190);
        System.out.println(map);
//        if(map.containsKey("Indiaop")){
//            System.out.println("the key exists");
//        }
//        else{
//            System.out.println("No");
//        }
        System.out.println(map.get("china"));
        System.out.println(map.get("indonesia"));
    }
}
