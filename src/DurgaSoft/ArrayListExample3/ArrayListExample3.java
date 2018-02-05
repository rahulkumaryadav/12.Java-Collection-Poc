package DurgaSoft.ArrayListExample3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample3 {
    public static void main(String[] args) {
        Student student1=new Student(10,"rahul",15);//Creating user defined class object
        Student student2=new Student(11,"bhavik",15);

        ArrayList<Student> arrayList=new ArrayList<Student>();//created generic arrayList
        arrayList.add(student1); //added student class object
        arrayList.add(student2);

        Iterator iterator=arrayList.iterator();//Getting iterator

        //traversing element of ArrayList Object
        while (iterator.hasNext()){
            Student student=(Student)iterator.next();
            System.out.println(student.age+"--"+student.rollNo+"---"+student.name);
        }
    }
}
