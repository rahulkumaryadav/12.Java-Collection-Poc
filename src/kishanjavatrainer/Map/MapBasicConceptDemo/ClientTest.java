package kishanjavatrainer.Map.MapBasicConceptDemo;

import java.util.HashMap;
import java.util.Map;

public class ClientTest {
    public static void main(String[] args) {


        Employee e1 = new Employee(1009, "Sam", 90000.00, "sam@infotech.com");
        Employee e2 = new Employee(2009, "Martin", 30000.00, "martin@infotech.com");
        Employee e3 = new Employee(3009, "Joya", 50000.00, "joya@infotech.com");
        Employee e4 = new Employee(4009, "Harry", 70000.00, "harry@infotech.com");
        Employee e5 = new Employee(5009, "Sean", 80000.00, "sean@infotech.com");


        Department d1 = new Department(10001, "IT", "Boston");
        Department d2 = new Department(10002, "Finance", "Chennai");

        Map<Employee,Department> employeeDepartmentMap=new HashMap<>();
        employeeDepartmentMap.put(e1,d1);
        employeeDepartmentMap.put(e2,d1);
        employeeDepartmentMap.put(e3,d1);
    }
}
