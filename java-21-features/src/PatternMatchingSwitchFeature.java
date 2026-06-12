public class PatternMatchingSwitchFeature {
    public static void main(String[] args) {
        Object obj = false;
        String val = switch (obj) {
            case String s -> "This is a string";
            case Integer i -> "This is integer";
            default -> "None";
        };
        System.out.println(val);
    }
}
