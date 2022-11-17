package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	
	public Time(int theHour, int theMinute) {
		hour=theHour;
		minute=theMinute;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void militaryTime(boolean militarytime) {
		if (militarytime=false) {
			if (hour>12) {
				hour=hour-12;
			}
		}
	}

	public String toString() {
		return "Time: "+hour+":"+minute;
	}

	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

	public static void main(String[] args) {
		LinkedList<Date> list= new LinkedList<Date>();
		Time t1 = new Time(5,30);
		Time t2 = new Time (6,30);
		
		
    	
    }

}