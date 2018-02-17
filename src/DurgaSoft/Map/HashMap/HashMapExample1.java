package DurgaSoft.Map.HashMap;

import java.util.*;

/**
 * @Author Rahul Yadav
 * Dated :2018-02-17
 *
 * Constructor:
 * HashMap m=new HashMap();-->create an empty constructor with default initial capacity is 16 and fillRatio is 0.75
 * HashMap m=new HashMap(int initialCapacity);
 * HashMap m=new HashMap(int initialCapacity, float fillRatio);
 * HashMap m=new HashMap(Map m);
 */

public class HashMapExample1 {
    public static void main(String[] args) {
        HashMap hashMap=new HashMap();
        hashMap.put("rahul",100);
        hashMap.put("rohit",800);
        hashMap.put("rajesh",500);
        hashMap.put("bhavik",200);
        System.out.println(hashMap);

        hashMap.put("rahul",300);
        System.out.println(hashMap);

        Set set=hashMap.keySet();
        System.out.println(set);

        Collection collection=hashMap.values();
        System.out.println(collection);

        Set set1=hashMap.entrySet();

        Iterator iterator=set1.iterator();
        System.out.println("key"+"----------------"+"Value");
        while (iterator.hasNext()){
            Map.Entry map=(Map.Entry)iterator.next();
            System.out.println(map.getKey()+"----------------"+map.getValue());
            if(map.getKey().equals("rahul"))
                map.setValue(60000);
        }
        System.out.println(hashMap);


    }
}
