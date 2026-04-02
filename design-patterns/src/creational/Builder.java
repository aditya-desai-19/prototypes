package creational;

/*
    When to use Builder pattern?
    When you have a complex class with too many states and constructor has too many parameters.
 */
class User {
    private String name;
    private String address;
    private int age;
    private String contactNumber;

    private User(BuilderClass builderClass) {
        this.name = builderClass.name;
        this.address = builderClass.address;
        this.age = builderClass.age;
        this.contactNumber = builderClass.contactNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public static class BuilderClass {
        private String name;
        private String address;
        private int age;
        private String contactNumber;

        public BuilderClass(String name) {
            this.name = name;
        }

        public BuilderClass address(String address) {
            this.address = address;
            return this;
        }

        public BuilderClass age(int age) {
            this.age = age;
            return this;
        }

        public BuilderClass contactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

public class Builder {
    public static void main(String[] args) {
        User u1 = new User.BuilderClass("Aditya").address("Bangalore").build();
        User u2 = new User.BuilderClass("Aditya").contactNumber("9988997733").age(23).build();
        System.out.println(u1.getAge());
        System.out.println(u2.getAge());
    }
}
