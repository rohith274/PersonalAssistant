package ClassFiles;

import java.util.ArrayList;

public class Coffee {
    ArrayList<String> DayList = new ArrayList<String>(7);

    void Make(String s2, String Day) {
        DayList.add("monday");
        DayList.add("tuesday");
        DayList.add("wednesday");
        DayList.add("thursday");
        DayList.add("friday");
        DayList.add("saturday");
        DayList.add("sunday");
        if (DayList.contains(Day)) {
            int i = DayList.indexOf(Day);
            System.out.println("Adding sugar as per today = " + i + " grams");
            System.out.println("-----------------------------------------");
            System.out.println("Your preferred " + s2 + " coffee is ready with " + i + " grams of sugar.");
            System.out.println("-----------------------------------------");
            System.out.println("Thank you! I hope I served your needs");

        }

    }
}
