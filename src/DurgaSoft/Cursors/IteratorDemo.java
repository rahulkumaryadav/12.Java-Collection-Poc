package DurgaSoft.Cursors;

import java.util.Iterator;
import java.util.Vector;

/**
 * @Author Rahul Yadav
 * Dated :2018-02-08
 * We can apply concept for any collection objects.
 * It is a universal cursor.
 * While iterating we can perform remove operation also in addition ot read operation.
 * we can get iteration object by Iterator() of collection interface.
 *Iterator interface defines the following 3 methods
 * public boolean hasNext();
 * public boolean next();
 * public void remove();
 *
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Vector vector=new Vector();
        for(int i=0;i<=10;i++){
            vector.addElement(i);
        }
        System.out.println(vector);
        Iterator iterator=vector.iterator();//we can get iteration object by iterator() of collection interface.
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
