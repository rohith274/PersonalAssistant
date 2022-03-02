package ClassFiles;

import java.util.ArrayList;

class Alarm {
    ArrayList<String> AlarmList = new ArrayList<String>(1);

    void setAlarm(String time) {
        System.out.println("Alarm scheduled at " + time);
        AlarmList.add(time);
    }

    void ShowAlarm() {

        System.out.println(AlarmList.get(0));
        System.out.println("This problem can be solved by linking to a database.");

    }
}
