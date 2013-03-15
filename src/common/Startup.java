package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Startup {

    public static void main(String[] args) {
//        Address a1 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        Address a2 = new Address("0234 Street", "Milwaukee", "222-222-2222");
//        Address a3 = new Address("9234 Street", "Milwaukee", "222-222-2222");
//        Address a4 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        
//        Set set = new HashSet();
//        set.add(a1);
//        set.add(a2);
//        set.add(a3);
//        set.add(a4);
//        
//        for(Object address : set) {
//            System.out.println(address);
//        }
        
//        System.out.println(a1);
//        System.out.println(a2);

//        if (a1.equals(a2)) {
//            System.out.println("The addresses are equal");
//        } else {
//            System.out.println("The addresses are NOT equal");
//        }
        // Lab Activity #1
        System.out.println("Lab Activity #1");
        Employee e1 = new Employee("Jones", "Tommy Lee", "123-45-6789");
        Employee e2 = new Employee("Hackman", "Gene", "234-56-7890");
        Employee e3 = new Employee("Witherspoon", "Reese", "123-45-6789");
        
        System.out.println("*****Adding employees to a HashSet*****");
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        for (Employee employee: employees) {
            System.out.println(employee);
        }
        System.out.println("*****NOW Passing Hashset to a List*****");
        List<Employee> list = new ArrayList<Employee>(employees);
//                    System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("");
        
        // Lab Activity #2
        // Would be best to compare all fields in the equal, rather than just a
        // few of them...
        System.out.println("Lab Activity #2");
        Address a1 = new Address("123 Main Street", "Waukesha", "262-547-0001");
        Address a2 = new Address("465 Westfield Way", "Pewaukee", "262-695-0344");
        Address a3 = new Address("123 Main Street", "Sussex", "262-547-0001");
        
        Set<Address> addresses = new HashSet<Address>();
        addresses.add(a1);
        addresses.add(a2);
        addresses.add(a3);
        
//        for (Address address: addresses) {
//            System.out.println(address);
//        }
        
        if (a1.equals(a3)) {
            System.out.println("Address1 and Address3 are equal");
        } else {
            System.out.println("They are not equal");
        }
        
        System.out.println("");
        
        // Lab Activity #3
        // When the individual class toString() methods are commented out
        // you do not see what appears to be useful information...
        System.out.println("Lab Activity #3");
        Address a4 = new Address("1715 Easy Street", "Waukesha", "262-547-8633");
        System.out.println(a4);
        Dog d1 = new Dog("Wapatui",9);
        System.out.println(d1);
        Employee e4 = new Employee("Cooper", "Bradley", "345-67-8901");
        System.out.println(e4);
        
    }
}
