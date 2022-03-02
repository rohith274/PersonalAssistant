package ClassFiles;

import java.util.ArrayList;

public class HeatWater {
    ArrayList<String> DayList = new ArrayList<String>(7);

    void Bath(int t, String day) {
        DayList.add("monday");
        DayList.add("tuesday");
        DayList.add("wednesday");
        DayList.add("thursday");
        DayList.add("friday");
        DayList.add("saturday");
        DayList.add("sunday");
        if (DayList.indexOf(day) % 2 == 0) {
            System.out.println("You usually bath on even days ");
            System.out.println("So, Heating water to temperature : " + t + " degrees");

        } else {
            System.out.println("You usually wont bath on today.Try changing day for heating water(mon/wed/fri/sun)");
        }

    }
}
