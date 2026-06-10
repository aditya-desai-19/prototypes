/*
    Problem: Before java 17 we had to cast object to required type
    Improvement: instanceof supports casting reducing boilerplate code
 */
public class PatternMatchingFeature {
    public static void main(String[] args) {
        Object s = "Hello";

        if(s instanceof String str) {
            System.out.println(str.toUpperCase());
        }
    }
}
