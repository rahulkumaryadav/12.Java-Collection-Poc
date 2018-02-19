package DurgaSoft.Map.SortedMap;

import java.util.TreeMap;

/**
 * @Author Rahul Yadav
 * Dated:2018-02-19
 *Constructors
 * TreeMap t= new TreeMap(); ---> for default natural sorting order.
 * TreeMap t =new TreeMap(Comparator c);-->for customized sorting order.
 * TreeMap t =new TreeMap(Map m);
 * TreeMap t=new TreeMap(SortedMap m);
 */

public class TreeMapExample1 {
    public static void main(String[] args) {
        TreeMap m =new TreeMap();
        m.put(100,"zzz");
        m.put(103,"yyy");
        m.put(101,"xxx");
        m.put(104,"106");
       // m.put("FFFF","XXX");
        m.put(null,"XXX");
        System.out.println(m);
    }
}
