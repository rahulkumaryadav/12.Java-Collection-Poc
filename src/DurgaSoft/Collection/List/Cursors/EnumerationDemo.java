package DurgaSoft.Collection.List.Cursors;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @Author Rahul kumar
 * Dated :2018-02-08
 * It is cursor to retrieve Object one by one form collection
 * it is applicable for legacy classes
 * we can create enumeration object by using elements()
 * EnumerationDemo defines following objects
 * public boolean hasMoreElements();
 * public boolean nextElements();
 *
 */
public class EnumerationDemo {
    public static void main(String[] args) {
        Vector vector=new Vector();
        for(int i=0;i<=10;i++){
            vector.addElement(i);//added 10 elements in vector objects
        }
        System.out.println(vector);
       Enumeration enumeration=vector.elements();
       while (enumeration.hasMoreElements()){
           Integer integer=(Integer) enumeration.nextElement();
           if(integer%2==0){
               System.out.println(integer);//here we can perform any logical operation on basis of requirement.
           }
           System.out.println(vector);

       }
    }
}
