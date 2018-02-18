package DurgaSoft.Map.WeakHashMap;

public class Temp {
    public String toString(){
        return "temp";
    }
    public void finalize(){
        System.out.println("finalize method is called");
    }
}
