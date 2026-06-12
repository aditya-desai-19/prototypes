public class MathClampFeature {
    public static void main(String[] args) {
        int val = 150;
        /*
            Helps from writing if else
         */
        int restricted = Math.clamp(val, 10, 30);
        System.out.println(restricted);
    }
}
