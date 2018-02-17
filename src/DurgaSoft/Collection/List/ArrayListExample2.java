package DurgaSoft.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Rahul Yadav
 * Creating generic arrayList
 * In generic collection we Specify the type in angular braces.
 *
 */
public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList=new ArrayList<String>();//Creating generic arrayList
        stringArrayList.add("jijesh");//adding object in array
        stringArrayList.add("prahlad");
        stringArrayList.add("Bhavik");
        System.out.println(stringArrayList);

        System.out.println("Traversing list through Iterator----->");
        Iterator iterator=stringArrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Iterating Collection through for-each loop------>");
        for (String o:stringArrayList){
            System.out.println(o);
        }
    }
}
