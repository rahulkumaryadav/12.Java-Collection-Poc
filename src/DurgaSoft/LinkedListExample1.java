package DurgaSoft;

import java.util.LinkedList;

/**
 * Created by Rahul Yadav
 * Usually we can use LinkedList to implement stack and queue
 * LinkedList class consists of the following methods :
 * 1. boolean add(Object element) : It appends the element to the end of the list.
 * 2. void add(int index, Object element): It inserts the element at the position ‘index’ in the list.
 * 3. void addFirst(Object element) : It inserts the element at the beginning of the list.
 * 4. void addLast(Object element) : It appends the element at the end of the list.
 * 5. boolean contains(Object element) : It returns true if the element is present in the list.
 * 6. Object get(int index) : It returns the element at the position ‘index’ in the list. It throws ‘IndexOutOfBoundsException’ if the index is out of range of the list.
 * 7. int indexOf(Object element) : If element is found, it returns the index of the first occurrence of the element. Else, it returns -1.
 * 8. Object remove(int index) : It removes the element at the position ‘index’ in this list. It throws ‘NoSuchElementException’ if the list is empty.
 * 9. int size() : It returns the number of elements in this list.
 * 10. void clear() : It removes all of the elements from the list.
 *
 */

public class LinkedListExample1 {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add("rahul");
        linkedList.add(30);
        linkedList.add(null);
        linkedList.add("rahul");
        System.out.println(linkedList);
    }
}
