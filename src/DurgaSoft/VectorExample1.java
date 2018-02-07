package DurgaSoft;

import java.util.Vector;

public class VectorExample1 {
    public static void main(String[] args) {
        Vector vector=new Vector();
        System.out.println(vector.capacity());
        for (int i=0;i<10;i++){
            vector.addElement(i);
        }
        System.out.println(vector.capacity());
        vector.add("A");
        System.out.println(vector.capacity());
        System.out.println(vector);
        System.out.println(vector.size());
        vector.removeElement(9);
        System.out.println(vector);
        vector.removeElementAt(3);
        System.out.println(vector);
        vector.removeAllElements();
        System.out.println(vector);

    }
}
