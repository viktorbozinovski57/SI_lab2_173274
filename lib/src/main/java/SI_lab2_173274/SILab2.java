package SI_lab2_173274;

import java.util.ArrayList;
import java.util.List;

class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
};

public class SILab2 {
	
	public static void main(String[] args){
        List<Time> timesList = new ArrayList<>();
        //Time time = new Time(20,58,60);
        Time tim1 = new Time(24,0,0);
       // timesList.add(time);
        timesList.add(tim1);
         function(timesList);
    }
	public static List<Integer> function(List<Time> timesList) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < timesList.size(); i++) {
            int hr = timesList.get(i).hours;//4
            int min = timesList.get(i).minutes;//5
            int sec = timesList.get(i).seconds;//6
            if (hr < 0 || hr > 24){//7
                if (hr < 0){//8
                    throw new RuntimeException("The hours are smaller than the minimum");//9
                }
                else {
                    throw new RuntimeException("The hours are grater than the maximum");//10
                }
            }
            else if (hr < 24) {//11
                if (min < 0 || min > 59)//12
                    throw new RuntimeException("The minutes are not valid!");//13
                else {
                    if (sec >= 0 && sec <= 59)//14
                        result.add(hr * 3600 + min * 60 + sec);//15
                    else
                        throw new RuntimeException("The seconds are not valid");//16
                }
            }
            else if (hr == 24 && min == 0 && sec == 0) {//17
                result.add(hr * 3600 + min * 60 + sec);//18
            }
            else {
                throw new RuntimeException("The time is greater than the maximum");//19
            }
        }//20
        return result;//21
    }//22
	
	
}
