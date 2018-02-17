package DurgaSoft.Collection.List.ArrayListExample6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rahul Kumar
 * When multiple thread work on single object some data loss occurs due to non-synchronizedList
 * to avoid this loss we should synchronizedList arrayList
 *
 */

public class SynchronizedArrayList {
    private static List<String> arrayList=new ArrayList<String>();//Generic arrayList is created and its non-synchronizedList
    //private static List<String> arrayList=Collections.synchronizedList(new ArrayList<String>());//Generic arrayList is created and its synchronizedList


    public static void main(String[] args) {
    try{
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i < 10 ; i++){
                    if(i%2 == 0){
                        arrayList.add(String.valueOf(i));
                    }
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i < 10 ; i++){
                    if(i % 2 != 0){
                        arrayList.add(String.valueOf(i));
                    }
                }
            }
        });
        t1.start();
        t2.start();
        Thread.sleep(1000);
        for(String s : arrayList){
            System.out.println(" ---- "+s);
        }
    }catch (Exception e){
        e.printStackTrace();
    }

    }
}
