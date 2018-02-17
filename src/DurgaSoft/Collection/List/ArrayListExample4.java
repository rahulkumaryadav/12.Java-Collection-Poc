package DurgaSoft.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Rahul Yadav
 * addAll(Collection c) method
 * removeAll() method
 * retainAll() method
 */

public class ArrayListExample4 {
    public static void main(String[] args) {
        System.out.println("-----------------addAll method-------------");
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("rahul");
        arrayList.add("rajesh");
        arrayList.add("rohit");

        ArrayList<String> arrayList1=new ArrayList<String>();
        arrayList1.add("bhavik");
        arrayList1.add("pushkar");
        arrayList.addAll(arrayList1);//added second list in first list

        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("----------------removeAll() method-----------");
        arrayList.removeAll(arrayList1);//removed arrayList1 form the arrayList

        Iterator iterator1=arrayList.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }


        System.out.println("--------------------------------------------");



    }
}
