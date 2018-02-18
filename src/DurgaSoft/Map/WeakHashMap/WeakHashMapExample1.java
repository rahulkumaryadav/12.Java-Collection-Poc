package DurgaSoft.Map.WeakHashMap;

import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * @Author Rahul Yadav
 * Dated : 2018-02-18
 *
 */

public class WeakHashMapExample1 {
    public static void main(String[] args)  throws InterruptedException{
       // HashMap m=new HashMap();
        WeakHashMap m=new WeakHashMap();
        Temp t =new Temp();
        m.put(t,"Durga");
        System.out.println(m);
        t=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(m);
    }

}
