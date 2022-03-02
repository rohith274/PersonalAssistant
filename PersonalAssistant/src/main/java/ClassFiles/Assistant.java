package ClassFiles;

import java.util.Scanner;

class Assistant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! I am Rohith.Thank you for using this bot.Vote up if you like it");
        System.out.println("Select Your need");
        System.out.println(
                "1. Alarm \n2. Make a coffee \n3. Water Heater \nEnter the corresponding number of your need : ");
        int query = sc.nextInt();
        if (query == 1) {

            System.out.println("Enter time to schedule alarm : ");
            String time = sc.next();
            Alarm a1 = new Alarm();
            a1.setAlarm(time);
            System.out.println("Do you want to see previously scheduled alarms ? (Y/N)");
            String disp = sc.next();
            if (!(disp.equalsIgnoreCase("y"))) {
                System.out.println("Thank you! I hope I served your needs");

            } else {
                a1.ShowAlarm();
            }

        } else if (query == 2) {

            System.out.println("How will you prefer your cofee (MILK/WATER) : ");
            String s2 = sc.next();
            System.out.println("Enter day : ");
            String day = sc.next();
            Coffee c1 = new Coffee();

            if (s2.equalsIgnoreCase("MILK")) {
                c1.Make("MILK", day);
            } else {
                c1.Make("WATER", day);
            }

        } else if (query == 3) {
            System.out.println("Enter temperature to heat water : ");
            int t = sc.nextInt();
            System.out.println("Enter day : ");
            String day2 = sc.next();
            HeatWater h1 = new HeatWater();
            h1.Bath(t, day2);
        }

        else {
            System.out.println("Sorry! I am still expanding this code.So, please choose the available option");
        }
        sc.close();

    }

}
