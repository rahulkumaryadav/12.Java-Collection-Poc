package DurgaSoft.Cursors;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @Author Rahul Yadav
 * Dated :2018-02-08
 * Theory i have to add form durga soft video
 */

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add("balakrishna");
        linkedList.add("venki");
        linkedList.add("chiru");
        linkedList.add("nag");
        System.out.println(linkedList);//[balakrishna,venki,chiru,nag]
        ListIterator listIterator=linkedList.listIterator();
        while (listIterator.hasNext()){
            String string=(String)listIterator.next();
            System.out.println(string);
            if(string.equals("venki")){
                listIterator.remove();//[balakrishna,chiru,nag]
            }else if (string.equals("nag")){
                listIterator.add("chaitu");//[blakrishna,chiru,nag,chaitu]
            }else if (string.equals("chiru")){
                listIterator.set("charan");//[blakrishna,charan,nag,chaitu]
            }
            System.out.println(linkedList);
        }
    }
}
