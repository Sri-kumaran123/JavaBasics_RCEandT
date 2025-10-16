
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumSwitchExample {
    public static void main(String[] args) {
        final Day today = Day.SATURDAY;  






        switch (today) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println(today + " is a Weekday.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println(today + " is a Weekend.");
                break;
            default:
                System.out.println("Invalid day.");
                break;
        }




        // switch (today) {
        //     case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> 
        //         System.out.println(today + " is a Weekday.");
        //     case SATURDAY, SUNDAY -> 
        //         System.out.println(today + " is a Weekend.");
        //     default -> 
        //         System.out.println("Invalid day.");
        // }



       /*  System.out.println(today); 
        System.out.println(today.name()); 
        System.out.println(today.ordinal());  */
    }
}
