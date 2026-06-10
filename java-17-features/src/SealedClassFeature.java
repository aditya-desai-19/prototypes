/*
    Problem: Before Java 17 any class can inherit any class
    Solution: using sealed keyword we can now restrict the inheritance of the class
 */
sealed class Vehicle permits Car, Bike {

}

final class Car extends Vehicle {}

final class Bike extends Vehicle {}


public class SealedClassFeature {
}
