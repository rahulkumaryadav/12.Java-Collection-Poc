package DurgaSoft;
/*
Created by Rahul Yadav on the basis of durga soft pdf form page no 14
 */

import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {
        int indexValue;
        Object toGetObjectList;
        ArrayList arrayList=new ArrayList();
        arrayList.add("a");//using add method added Object in the ArrayList.
        arrayList.add(10);
        arrayList.add("a");
        arrayList.add(null);
        System.out.println(arrayList);
        arrayList.remove(1);//remove method will object form index 1
        arrayList.remove("a");//remove method will remove "a" object form arrayList
        System.out.println(arrayList);
        arrayList.add(1,"M");//add method will add the object "M" at the 1 index
        System.out.println(arrayList);
        arrayList.add("N");//add will add object "N" at the end of the arrayList
        System.out.println(arrayList);
        arrayList.set(2,"O");//Used for updating an element. It replaces the element present at the specified index with the object o.
        System.out.println(arrayList);
        indexValue=arrayList.indexOf("N");//indexOf method give the index number of specified object.
        System.out.println(indexValue);
        toGetObjectList=arrayList.get(0);//if we pass the index number in get method then it return of that arrayList
        System.out.println(toGetObjectList);
        System.out.println(arrayList.size());//size method will return size of the object
        Boolean isPresent=arrayList.contains("s");//It checks whether the given object o is present in the array list if its there then it returns true else it returns false.
        System.out.println(isPresent);
        arrayList.clear();//It is used for removing all the elements of the array list in one go. The below code will remove all the elements of ArrayList whose object is obj.
        System.out.println(arrayList+"this will clear the list");



    }
}
