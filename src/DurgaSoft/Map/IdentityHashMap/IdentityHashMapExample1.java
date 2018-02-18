package DurgaSoft.Map.IdentityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;

/**
 * @Author Rahul Yadav
 * Dated :2018-02-18
 * Durgasoft video:12
 *
 */

public class IdentityHashMapExample1 {
    public static void main(String[] args) {
        //HashMap hashMap=new HashMap();
        IdentityHashMap hashMap=new IdentityHashMap();
        Integer integer=new Integer(10);
        Integer integer1=new Integer(20);
        hashMap.put(integer,"pawan");
        hashMap.put(integer1,"kalyan");
        System.out.println(hashMap);

    }

}
