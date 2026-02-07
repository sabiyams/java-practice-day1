import java.util.*;
public class Hashmapprblm {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("sabiya", 20);
        hashMap.put("meghana", 50);
        System.out.println(hashMap);
        System.out.println(hashMap.get("sabiya"));
        hashMap.remove("meghana");
        System.out.println(hashMap);
        //size
        System.out.println(hashMap.size());
        hashMap.put("sabiya", 11);
        System.out.println(hashMap);
        //traverse hashmap
        for(Map.Entry<String, Integer>e: hashMap.entrySet()){
            System.out.println("key:"+e.getKey()+" " + "value:"+e.getValue());
    }
    }
}
