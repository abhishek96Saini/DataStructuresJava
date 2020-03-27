import java.util.HashMap;

public class MyHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> strIntHashMap = new HashMap();

        System.out.println("Empty Hash map: "+strIntHashMap);

//        insert (key, value) in hash map.
        strIntHashMap.put(1,"Aarnav");
        strIntHashMap.put(2,"Abhay");
        strIntHashMap.put(3,"Akshat");

        System.out.println(strIntHashMap);

//        insert (key, value) only if not already existing
        strIntHashMap.putIfAbsent(33,"Lakshay");;
        strIntHashMap.putIfAbsent(33,"Lakshay2233");;
        strIntHashMap.putIfAbsent(34,"Lakshay2");;

        System.out.println(strIntHashMap);

    }
}
