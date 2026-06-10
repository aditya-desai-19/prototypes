/*
    Problem: We had to write a lot of boilerplate code for simple DTO class
    Solution: Using record class, java generates boilerplate code like constructor, getter, equals, hashcode, toString etc
 */
record Employee(String name, String empId){};

public class RecordFeature {
    public static void main(String[] args) {
        Employee e = new Employee("Aditya", "123");
        System.out.println(e.name() + " " + e.empId());
    }
}
