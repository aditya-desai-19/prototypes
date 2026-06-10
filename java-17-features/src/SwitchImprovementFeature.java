public class SwitchImprovementFeature {
    public static void main(String[] args) {
        // Before
        String day = "MON";

        String type;

        switch(day) {
            case "SAT":
            case "SUN":
                type = "Weekend";
                break;

            default:
                type = "Weekday";
        }

        System.out.println(type);


        //  After
        String type1 = switch(day) {
            case "SAT", "SUN" -> "Weekend";
            default -> "Weekday";
        };

        System.out.println(type1);
    }
}
